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
            return Visualizer.getErrorToteMore() + Visualizer.getGameExit();
        }
        if (parseInt(data) < 0) {
            return Visualizer.getErrorToteNoMore() + Visualizer.getGameExit();
        }
        user.setTote(parseInt(data));
        user.setGameCode(3);
        return Visualizer.getGoodToteStartGame() + Visualizer.getGameExit();
    }
}
