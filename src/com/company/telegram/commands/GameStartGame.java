package com.company.telegram.commands;

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

                return GameStates.GREETING.realisation.execute(data, user);

            }
            case 1 -> {

                return GameStates.CREATE_STEPS.realisation.execute(data, user);
            }
            case 2 -> {

                return GameStates.DO_TOTE.realisation.execute(data, user);
            }
            case 3 -> {

                return GameStates.PLAY.realisation.execute(data, user);
            }
        }


        return "!";
    }


}
