package com.company.telegram.games;


import com.company.module.User;
import com.company.module.Visualizer;

import java.util.Random;

/**
 * Класс реализации начальной стадии игры.
 */
public class Game0 extends Game {


    /**
     * Метод, реализующий логику начальной стадии игры.
     *
     * @param data Текст, введенный пользователем.
     * @param user Пользователь.
     * @return Приветсвие в игре и банк пользователя.
     */
    @Override
    public String execute(String data, User user) {
        Random rn = new Random();
        user.setTargetNumber(rn.nextInt(100) + 1);

        return getResponseAndSetGameCode(
                super.initResponse(Visualizer.GAME_START + user.getBank() + Visualizer.GAME_EXIT),
                super.initGameCode(GameStates.CREATE_STEPS, user));//super.execute(data,user);
    }

    @Override
    String getResponseAndSetGameCode(String response, GameStates gameCode) {

        return response;
    }
}
