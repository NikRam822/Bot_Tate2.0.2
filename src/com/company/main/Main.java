package com.company.main;

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

public class Main {
    public static void main(String[] args) throws Exception {

        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try{
            StateMachine.setHashMap();
            TelegramBot bot = new TelegramBot();
            telegramBotsApi.registerBot(bot);

        } catch (TelegramApiRequestException e){
            e.printStackTrace();
        }

        // this uses h2 by default but change to match your database
        String databaseUrl = "jdbc:sqlite:./mydatabase.db";
        // create a connection source to our database
        ConnectionSource connectionSource =
                new JdbcConnectionSource(databaseUrl);

        // instantiate the dao
        Dao<User, String> userDao =
                DaoManager.createDao(connectionSource, User.class);

        // if you need to create the 'accounts' table make this call
        TableUtils.createTable(connectionSource, User.class);

//        // retrieve the account from the database by its id field (name)
//        User searching_user = userDao.query("Jim Coakley");

        // get our query builder from the DAO
        QueryBuilder<User, String> queryBuilder =
                userDao.queryBuilder();
        // the 'password' field must be equal to "qwerty"
        queryBuilder.where().eq(User.BANK, 1000);
        // prepare our sql statement
        PreparedQuery<User> preparedQuery = queryBuilder.prepare();
        // query for all accounts that have "qwerty" as a password
        List<User> usersList = userDao.query(preparedQuery);

        for (User userBeg: usersList)
        {
            System.out.println("User with bank 1000 (hardcode)" + userBeg.getChatId());
        }

        // close the connection source
        connectionSource.close();
    }
}