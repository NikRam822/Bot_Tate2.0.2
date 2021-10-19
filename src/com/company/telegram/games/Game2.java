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

        if (super.doProcessingOfNumber(data) == false) return "Введите число!" + Visualizer.GAME_EXIT;

        if (parseInt(data) > user.getBank()) {
            return super.sendResponseAndSetGameCode(user, Visualizer.ERROR_TOTE_MORE + Visualizer.GAME_EXIT, GameStates.DO_TOTE);
        }
        if (parseInt(data) <= 0) {
            return super.sendResponseAndSetGameCode(user, Visualizer.ERROR_TOTE_NO_MORE + Visualizer.GAME_EXIT, GameStates.DO_TOTE);
        }
        user.setTote(parseInt(data));
        return super.sendResponseAndSetGameCode(user, Visualizer.GOOD_TOTE_START_GAME + Visualizer.GAME_EXIT, GameStates.PLAY);
    }
}
