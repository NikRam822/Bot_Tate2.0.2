package com.company.telegram.commands;

import com.company.module.User;
import com.company.module.Visualizer;

/**
 * Класс реализации программной логики команды /information.
 */
public class MenuInformation extends Command {

    /**
     * Метод реализации програмной логики команды /information.
     *
     * @param data Текст,введнный пользователем.
     * @param user Пользователь.
     * @return Информация о боте.
     */
    @Override
    public String execute(String data, User user) {
        return Visualizer.getInformation();
    }
}
