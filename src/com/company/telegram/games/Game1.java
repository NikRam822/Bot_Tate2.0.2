package com.company.telegram.games;


import com.company.module.User;
import com.company.module.Visualizer;

import static java.lang.Integer.parseInt;

/**
 * Класс, реализующий логику ставок в игре.
 */
public class Game1 extends Game {



    @Override
    void doGameLogic(User user, String data) {

        if (!super.checkTypeOfNumber(data))
            super.dialogManager.setResponseAndGameCode("Введите число!" + Visualizer.GAME_EXIT,GameStates.CREATE_STEPS);


        if (parseInt(data) > 10) {
        super.dialogManager.setResponseAndGameCode(Visualizer.ERROR_STEPS_MORE + Visualizer.GAME_EXIT,GameStates.CREATE_STEPS);

        }
        if (parseInt(data) <= 0) {
super.dialogManager.setResponseAndGameCode(Visualizer.ERROR_STEPS_NO_MORE + Visualizer.GAME_EXIT,GameStates.CREATE_STEPS);

        }

        user.setSteps(Integer.parseInt(data));
    super.dialogManager.setResponseAndGameCode(Visualizer.DO_TOTE + Visualizer.GAME_EXIT,GameStates.DO_TOTE);

    }

}