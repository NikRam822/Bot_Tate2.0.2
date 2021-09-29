package com.company.main;

import com.company.telegram.TelegramBot;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

public class Main {
    public static void main(String[] args) {

        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try{
            TelegramBot bot = new TelegramBot();
            telegramBotsApi.registerBot(bot);

        } catch (TelegramApiRequestException e){
            e.printStackTrace();
        }
    }
}