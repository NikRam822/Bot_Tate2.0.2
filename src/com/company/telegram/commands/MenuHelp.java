package com.company.telegram.commands;

import com.company.module.User;
import com.company.module.Visualizer;

/**
 * Класс реализации программной логики команды /help.
 */
public class MenuHelp implements ICommand {

    /**
     * Метод реализации програмной логики команды /help.
     *
     * @param data Текст,введнный пользователем.
     * @param user Пользователь.
     * @return Вспомогательное меню.
     */
    @Override
    public String execute(String data, User user) {
        return Visualizer.MENU_HELP;
    }
}
