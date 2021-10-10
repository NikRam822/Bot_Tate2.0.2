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
        if (parseInt(data) > user.getBank()) {
            return Visualizer.ERROR_TOTE_MORE + Visualizer.GAME_EXIT;
        }
        if (parseInt(data) < 0) {
            return Visualizer.ERROR_TOTE_NO_MORE + Visualizer.GAME_EXIT;
        }
        user.setTote(parseInt(data));
        user.setGameCode(GameStates.PLAY.gameCode);
        return Visualizer.GOOD_TOTE_START_GAME + Visualizer.GAME_EXIT;
    }
}
