package com.company.telegram.games;


import com.company.module.User;
import com.company.module.Visualizer;

import java.util.Random;


public class Game0 extends Game {

    @Override
    public String execute(String data, User user) {
        Random rn = new Random();
        user.setTargetNumber(rn.nextInt(100) + 1);
        user.setGameCode(1);
        return Visualizer.getGameStart() + user.getBank()+ Visualizer.getGameExit();
    }
}
