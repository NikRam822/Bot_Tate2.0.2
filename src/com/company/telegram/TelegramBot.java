package com.company.telegram;

import com.company.database.IDataSource;
import com.company.module.User;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class TelegramBot extends TelegramLongPollingBot {


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
                User user;
                if (hashMap.getUser(message.getChatId().toString()) == null) {
                    user = new User(message.getChatId().toString(), 10000, 0, null);
                    hashMap.saveUser(user);
                } else {
                    user = hashMap.getUser(message.getChatId().toString());
                }
                String command = message.getText();

//                sendMsg(message,message.getChatId().toString());


                sendMsg(message, stateMachine.doCommand(command, user));
                hashMap.saveUser(user);

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

