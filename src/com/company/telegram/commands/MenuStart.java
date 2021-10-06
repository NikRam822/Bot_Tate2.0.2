package com.company.telegram.commands;

import com.company.module.User;
import com.company.module.Visualizer;

import java.sql.SQLException;

/**
 * Класс реализации программной логики команды /start.
 */
public class MenuStart extends Command {
    /**
     * Метод реализации програмной логики команды /start.
     *
     * @param data Текст,введнный пользователем.
     * @param user Пользователь.
     * @return Приветсвие бота.
     */
    @Override
    public String execute(String data, User user) {
        return Visualizer.getHello();
    }
}





