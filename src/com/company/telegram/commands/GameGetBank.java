package com.company.telegram.commands;

import com.company.module.User;
import com.company.module.Visualizer;

/**
 *  Класс реализации программной логики команды /getBank.
 */
public class GameGetBank implements ICommand {
    /**
     * Метод реализации програмной логики команды /getBank.
     *
     * @param data Текст,введнный пользователем.
     * @param user Пользователь.
     * @return Банк пользователя.
     */
    @Override
    public String execute(String data, User user)  {
        return Visualizer.GET_BANK + user.getBank();
    }
}
