package com.company.telegram.commands;

import com.company.module.User;

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
            case  GREETING -> {

                return GREETING.realisation.execute(data, user);

            }
            case CREATE_STEPS -> {

                return CREATE_STEPS.realisation.execute(data, user);
            }
            case DO_TOTE -> {

                return DO_TOTE.realisation.execute(data, user);
            }
            case PLAY -> {

                return PLAY.realisation.execute(data, user);
            }
        }


        return "!";
    }


}
