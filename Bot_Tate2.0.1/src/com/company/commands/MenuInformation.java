package com.company.commands;

public class MenuInformation extends Command {
    @Override
    public void execute() {
        //System.out.println("/play - начать игру.\n/exit - закончить работу с ботом.");
        GameVisualizer.getInformation();
    }
}
