package com.company.telegram.games;


import com.company.module.User;
import com.company.module.Visualizer;

import static java.lang.Integer.parseInt;


public class Game3 extends Game {

    @Override
    public String execute(String data, User user) {
        user.setSteps(user.getSteps() - 1);
        if (user.getSteps() == 0) {
            user.setBank(user.getBank() - user.getTote());
            user.setTote(0);
            user.setGameCode(0);
            return Visualizer.getLoser() + user.getTargetNumber() + Visualizer.getGameExit();
        }
        if (parseInt(data) != user.getTargetNumber() & parseInt(data) > user.getTargetNumber()) {
            return Visualizer.getMore() + user.getSteps() + Visualizer.getGameExit();
        }
        if (parseInt(data) != user.getTargetNumber() & parseInt(data) < user.getTargetNumber()) {
            return Visualizer.getNoMore() + user.getSteps() + Visualizer.getGameExit();
        }
        if (parseInt(data) == user.getTargetNumber()) {
            user.setGameCode(0);
            user.setBank(user.getBank() + user.getTote() * 2);
            user.setSteps(0);
            user.setTote(0);
            return Visualizer.getWin() + user.getBank();
        }
        user.setGameCode(4);
        return Visualizer.getTryCreate() + Visualizer.getGameExit();
    }
}
