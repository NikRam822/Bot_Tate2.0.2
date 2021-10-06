package com.company.telegram.commands;

import com.company.module.User;

import java.sql.SQLException;

/**
 * Абстрактный класс для реализации паттерна интерфейс-абстрактный класс
 */
public abstract class Command implements ICommand {

    /**
     * Метод для реализации логики команд.
     *
     * @param data Текст,введнный пользователем.
     * @param user Пользователь.
     * @return null. Пустое значение пользователя.
     * @throws SQLException ошибки взаимодействия с бд.
     */
    @Override
    public String execute(String data, User user) throws SQLException {
        return null;
    }
}
