package com.company.telegram.games;


import com.company.module.User;
import com.company.module.Visualizer;

import static java.lang.Integer.parseInt;


public class Game2 extends Game {

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
