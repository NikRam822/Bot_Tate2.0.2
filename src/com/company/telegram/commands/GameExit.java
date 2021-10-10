package com.company.telegram.commands;

import com.company.module.User;
import com.company.module.Visualizer;
import com.company.telegram.games.GameStates;

/**
 * Класс реализации программной логики команды /exit.
 */
public class GameExit implements ICommand {

    /**
     * Метод реализации програмной логики команды /exit.
     *
     * @param data Текст,введнный пользователем.
     * @param user Пользователь.
     * @return Прощание с пользователем.
     */
    @Override
    public String execute(String data, User user) {
        user.setGameCode(GameStates.GREETING.gameCode);
        return Visualizer.MENU_EXIT;
    }
}
