package com.company.telegram.games;


import com.company.module.User;
import com.company.module.Visualizer;

import static java.lang.Integer.parseInt;

/**
 * Класс реализующий логику ставок в игре.
 */
public class Game2 extends Game {



    @Override
    void doGameLogic(User user,String data) {

        if (!super.checkTypeOfNumber(data)){
            super.dialogManager.setResponseAndGameCode("Введите число!" + Visualizer.GAME_EXIT,GameStates.DO_TOTE);
        return;
        }

        if (parseInt(data) > user.getBank()) {

          super.dialogManager.setResponseAndGameCode(Visualizer.ERROR_TOTE_MORE + Visualizer.GAME_EXIT,GameStates.DO_TOTE);
          return;

        }
        if (parseInt(data) <= 0) {
            super.dialogManager.setResponseAndGameCode(Visualizer.ERROR_TOTE_NO_MORE + Visualizer.GAME_EXIT,GameStates.DO_TOTE);

            return;
        }
        user.setTote(parseInt(data));
        super.dialogManager.setResponseAndGameCode(Visualizer.GOOD_TOTE_START_GAME + Visualizer.GAME_EXIT,GameStates.PLAY);

    }
}
