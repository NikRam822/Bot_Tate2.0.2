package com.company.telegram.commands;

import com.company.module.User;
import com.company.module.Visualizer;

/**
 * Класс реализации программной логики команды /exit.
 */
public class GameExit extends Command {

    /**
     * Метод реализации програмной логики команды /exit.
     *
     * @param data Текст,введнный пользователем.
     * @param user Пользователь.
     * @return Прощание с пользователем.
     */
    @Override
    public String execute(String data, User user) {
        user.setGameCode(0);
        return Visualizer.getMenuExit();
    }
}
