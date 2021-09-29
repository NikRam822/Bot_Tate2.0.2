package com.company.telegram;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class TelegramBot extends TelegramLongPollingBot {

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
                sendMsg(message,message.getChatId().toString());

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

