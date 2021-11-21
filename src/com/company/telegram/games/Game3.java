package com.company.telegram.games;


import com.company.module.User;
import com.company.module.Visualizer;

import static java.lang.Integer.parseInt;

/**
 * Класс для реализации основного процесса игры.
 */
public class Game3 extends Game {

    @Override
    void doGameLogic(User user,String data) {

        user.setSteps(user.getSteps() - 1);
        if (user.getSteps() == 0 && parseInt(data) != user.getTargetNumber()) {
            user.setBank(user.getBank() - user.getTote());
            user.setTote(0);
            super.dialogManager.setResponseAndGameCode(Visualizer.LOSER + user.getTargetNumber() + Visualizer.GAME_EXIT,GameStates.GREETING);
            return ;
        }
        if (parseInt(data) != user.getTargetNumber() & parseInt(data) > user.getTargetNumber()) {
            super.dialogManager.setResponseAndGameCode(Visualizer.MORE + user.getSteps() + Visualizer.GAME_EXIT,GameStates.PLAY);
            return ;
        }
        if (parseInt(data) != user.getTargetNumber() & parseInt(data) < user.getTargetNumber()) {
            super.dialogManager.setResponseAndGameCode(Visualizer.NO_MORE + user.getSteps() + Visualizer.GAME_EXIT,GameStates.PLAY);
            return ;
        }
        if (parseInt(data) == user.getTargetNumber()) {
            user.setBank(user.getBank() + user.getTote() * 2);
            user.setSteps(0);
            super.dialogManager.setResponseAndGameCode(Visualizer.WIN + user.getBank(),GameStates.GREETING);
            return ;
        }
        super.dialogManager.setResponseAndGameCode(Visualizer.TRY_CREATE + Visualizer.GAME_EXIT,GameStates.GREETING);

    }

}
