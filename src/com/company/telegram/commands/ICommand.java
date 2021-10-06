package com.company.telegram.commands;

import com.company.module.User;

import java.sql.SQLException;

/**
 * Интерфейс для реализации паттерна интерфейс-абстрактный класс.
 */
public interface ICommand {
    /**
     * Метод реализации програмной логики коммнад.
     *
     * @param data Текст, введенный пользователем.
     * @param user Пользователь.
     * @return Ответ пользователю.
     * @throws SQLException ошибки взаимодействия с бд.
     */
    String execute(String data, User user) throws SQLException;
}
