package com.company.telegram.commands;

import com.company.module.User;
import com.company.telegram.games.*;

import static com.company.telegram.games.GameStates.*;


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
            case  0 -> {

                return GREETING.realisation.execute(data, user);

            }
            case 1 -> {

                return CREATE_STEPS.realisation.execute(data, user);
            }
            case 2 -> {

                return DO_TOTE.realisation.execute(data, user);
            }
            case 3 -> {

                return PLAY.realisation.execute(data, user);
            }
        }


        return "!";
    }


}
