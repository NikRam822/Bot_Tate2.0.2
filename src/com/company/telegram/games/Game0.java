package com.company.telegram.games;


import com.company.module.User;
import com.company.module.Visualizer;

import java.util.Random;

/**
 * Класс реализации начальной стадии игры.
 */
public class Game0 extends Game {

    @Override
    void doGameLogic(User user, String data) {
        Random rn = new Random();
        user.setTargetNumber(rn.nextInt(100) + 1);
super.dialogManager.setResponseAndGameCode(Visualizer.GAME_START + user.getBank() + Visualizer.GAME_EXIT,GameStates.CREATE_STEPS);

    }




}
