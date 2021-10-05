package com.company.telegram.commands;

import com.company.module.User;
import com.company.module.Visualizer;
import com.company.telegram.TelegramBot;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

import java.sql.SQLException;

public class MenuStart extends Command {

    @Override
    public String execute(String data) throws SQLException {
//        String chatId = TelegramBot.CHAT_ID;
//
//        // create an instance of Account
//        User user = new User();
//        user.setChatId(chatId);
//        user.setBank(10000);
//
//        // this uses h2 by default but change to match your database
//        String databaseUrl = "jdbc:sqlite:./mydatabase.db";
//        // create a connection source to our database
//        ConnectionSource connectionSource =
//                new JdbcConnectionSource(databaseUrl);
//
//        Dao<User, String> userDao =
//                DaoManager.createDao(connectionSource, User.class);
//
//        // persist the account object to the database
//        userDao.create(user);

        return Visualizer.getHello();
    }
}





