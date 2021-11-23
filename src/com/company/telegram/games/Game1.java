package com.company.telegram.games;


import com.company.module.User;
import com.company.module.Visualizer;

import static java.lang.Integer.parseInt;

/**
 * Класс, реализующий логику ставок в игре.
 */
public class Game1 extends Game {



    @Override
    GameResponse doGameLogic(User user, String data) {

        if (!super.checkTypeOfNumber(data)){
            return new GameResponse("Введите число!" + Visualizer.GAME_EXIT,GameStates.CREATE_STEPS);
        }


        if (parseInt(data) > 10) {
            return new GameResponse(Visualizer.ERROR_STEPS_MORE + Visualizer.GAME_EXIT,GameStates.CREATE_STEPS);

        }
        if (parseInt(data) <= 0) {
            return new GameResponse(Visualizer.ERROR_STEPS_NO_MORE + Visualizer.GAME_EXIT,GameStates.CREATE_STEPS);


        }

        user.setSteps(Integer.parseInt(data));
        return new GameResponse(Visualizer.DO_TOTE + Visualizer.GAME_EXIT,GameStates.DO_TOTE);


    }

}