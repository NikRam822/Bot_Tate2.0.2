package com.company.commands;

import com.company.speedbaccara.GameVisualizer;

public class MenuInformation extends Command {
    @Override
    public void execute() {
        //System.out.println("/play - начать игру.\n/exit - закончить работу с ботом.");
        GameVisualizer.getInformation();
    }
}
