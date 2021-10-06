package com.company.telegram.commands;

import com.company.module.User;
import com.company.module.Visualizer;

/**
 *  Класс реализации программной логики команды /addBank.
 */
public class GameAddBank extends Command {
    /**
     * Метод реализации програмной логики команды /addBank.
     *
     * @param data Текст,введнный пользователем.
     * @param user Пользователь.
     * @return Ответ пользователю на запрос добавления банка.
     */
    @Override
    public String execute(String data, User user) {
        if (user.getBank() <= 0) {
            user.setBank(100);
            return Visualizer.ADD_BANK + user.getBank();
        } else {
            return Visualizer.NO_ADD_BANK;
        }

    }
}
