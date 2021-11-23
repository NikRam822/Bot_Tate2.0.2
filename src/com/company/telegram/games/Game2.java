package com.company.telegram.games;


import com.company.module.User;
import com.company.module.Visualizer;

import static java.lang.Integer.parseInt;

/**
 * Класс реализующий логику ставок в игре.
 */
public class Game2 extends Game {



    @Override
    GameResponse doGameLogic(User user, String data) {

        if (!super.checkTypeOfNumber(data)){

        return new GameResponse("Введите число!" + Visualizer.GAME_EXIT,GameStates.DO_TOTE);
        }

        if (parseInt(data) > user.getBank()) {

          return new GameResponse(Visualizer.ERROR_TOTE_MORE + Visualizer.GAME_EXIT,GameStates.DO_TOTE);

        }
        if (parseInt(data) <= 0) {

            return new GameResponse(Visualizer.ERROR_TOTE_NO_MORE + Visualizer.GAME_EXIT,GameStates.DO_TOTE);
        }
        user.setTote(parseInt(data));
        return new GameResponse(Visualizer.GOOD_TOTE_START_GAME + Visualizer.GAME_EXIT,GameStates.PLAY);


    }
}
