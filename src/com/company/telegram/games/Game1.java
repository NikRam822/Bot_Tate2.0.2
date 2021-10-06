package com.company.telegram.games;


import com.company.module.User;
import com.company.module.Visualizer;

import static java.lang.Integer.parseInt;

/**
 * Класс, реализующий логику ставок в игре.
 */
public class Game1 extends Game {

    /**
     * Метод реализации игровых ставок на количество попыток для угадыаания числа.
     *
     * @param data Текст, введенный пользвателем.
     * @param user Пользовтаель.
     * @return Ответ пользователю об успешности\ не успешности введненной ставки.
     */
    @Override
    public String execute(String data, User user) {
        if (parseInt(data) > 10) {
            return Visualizer.getErrorStepsMore() + Visualizer.getGameExit();
        }
        if (parseInt(data) <= 0) {
            return Visualizer.getErrorStepsNoMore() + Visualizer.getGameExit();
        }

        user.setSteps(Integer.parseInt(data));

        user.setGameCode(2);
        return Visualizer.getDoTote() + Visualizer.getGameExit();
    }
}