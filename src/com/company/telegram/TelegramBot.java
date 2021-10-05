package com.company.telegram;

import com.company.database.HashMapSource;
import com.company.database.IDataSource;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class TelegramBot extends TelegramLongPollingBot {
    public static String CHAT_ID = "";

    private final IDataSource hashMap;
    StateMachine stateMachine = new StateMachine();

    public TelegramBot(IDataSource iDataSource) {
        hashMap = iDataSource;
    }

    public void sendMsg(Message message, String text) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }


    public void onUpdateReceived(Update update) {//метод для приема сообщений
        if (update.hasMessage()) {
            Message message = update.getMessage();
            if (message.hasText()) {

                String command = message.getText();

//                sendMsg(message,message.getChatId().toString());

                CHAT_ID = message.getChatId().toString();


                sendMsg(message, stateMachine.doCommand(command));

            }
        }
    }

    public String getBotUsername() {
        return "tote_project_bot";
    }

    public String getBotToken() {
        return "1649189668:AAGDg8CYBi7FRQfzK34zWtAQub_WlsKK2Z4";
    }
}

