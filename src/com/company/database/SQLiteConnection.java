package com.company.database;

import org.sqlite.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Класс подключения БД.
 */
public class SQLiteConnection {
    /**
     * Путь к бд.
     */
    private static final String CONNECTION_STRING = "jdbc:sqlite:./mydatabase.db";

    /**
     * Подключение к бд.
     */
    private final Connection connection;

    /**
     * Конструктор класса.
     *
     * @throws SQLException Возможные ошибки пдключения.
     */
    public SQLiteConnection() throws SQLException {
        DriverManager.registerDriver(new JDBC());
        this.connection = DriverManager.getConnection(CONNECTION_STRING);
    }

    /**
     * Геттер данных о подключении.
     *
     * @return Данные о подключении.
     */
    public Connection getConnection() {
        return connection;
    }
}
