package com.company.main;

import com.company.database.HashMapSource;
import com.company.module.User;
import com.company.telegram.StateMachine;
import com.company.telegram.TelegramBot;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.*;
import java.sql.*;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {


        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try{
            StateMachine.setHashMap();
            TelegramBot bot = new TelegramBot(new HashMapSource());
            telegramBotsApi.registerBot(bot);

        } catch (TelegramApiRequestException e){
            e.printStackTrace();
        }


    }
}