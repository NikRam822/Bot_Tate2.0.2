package com.company.telegram.games;


import com.company.module.User;
import com.company.module.Visualizer;

import static java.lang.Integer.parseInt;

/**
 * Класс реализующий логику ставок в игре.
 */
public class Game2 extends Game {

    /**
     * Метод для реализации создания ставок на победу.
     *
     * @param data Текст,введенный пользователем.
     * @param user Пользователь.
     * @return Ответ пользовтаелю об успешности\ не успешности созздания ставки.
     */
    @Override
    public String execute(String data, User user) {

        if (!super.checkTypeOfNumber(data)) return "Введите число!" + Visualizer.GAME_EXIT;

        if (parseInt(data) > user.getBank()) {

            return getResponseAndSetGameCode(
                    super.initResponse(Visualizer.ERROR_TOTE_MORE + Visualizer.GAME_EXIT),
                    super.initGameCode(GameStates.DO_TOTE, user));
        }
        if (parseInt(data) <= 0) {

            return getResponseAndSetGameCode(
                    super.initResponse(Visualizer.ERROR_TOTE_NO_MORE + Visualizer.GAME_EXIT),
                    super.initGameCode(GameStates.DO_TOTE, user));
        }
        user.setTote(parseInt(data));
        return getResponseAndSetGameCode(
                super.initResponse(Visualizer.GOOD_TOTE_START_GAME + Visualizer.GAME_EXIT),
                super.initGameCode(GameStates.PLAY, user));
    }

    @Override
    String getResponseAndSetGameCode(String response, GameStates gameCode) {

        return response;
    }
}
