package com.company.main;

import com.company.database.DBSource;
import com.company.database.HashMapSource;
import com.company.database.SQLiteConnection;
import com.company.telegram.StateMachine;
import com.company.telegram.TelegramBot;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

/**
 * Точка входа в прграмму.
 */
public class Main {

    public static void main(String[] args) throws Exception {


        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
//            StateMachine.setHashMap();
//            TelegramBot bot = new TelegramBot(new HashMapSource()); /*Код для RealTime реализации через HashMap.*/
            TelegramBot bot = new TelegramBot(new DBSource(new SQLiteConnection()));

            telegramBotsApi.registerBot(bot);

        } catch (TelegramApiRequestException e) {
            e.printStackTrace();
        }


    }
}