package com.company.telegram.commands;

import com.company.telegram.games.Game0;
import com.company.module.User;
import com.company.telegram.games.*;


/**
 * Класс реализации программной логики команды /startGame.
 */
public class GameStartGame implements ICommand {


    /**
     * Метод реализации програмной логики команды /startGame.
     *
     * @param data Текст,введнный пользователем.
     * @param user Пользователь.
     * @return Ответ пользовтелю.
     */
    @Override
    public String execute(String data, User user) {

        switch (user.getGameCode()) {
            case 0 -> {

                return new Game0().execute(data, user);
            }
            case 1 -> {

                return new Game1().execute(data, user);
            }
            case 2 -> {

                return new Game2().execute(data, user);
            }
            case 3 -> {

                return new Game3().execute(data, user);
            }
        }


        return "!";
    }


}
