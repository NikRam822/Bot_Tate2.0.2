package com.company.commands;

public class SpeedBaccaraGame extends Command {
    @Override
    public  void execute() {
        SpeedBaccara speedBaccara = new SpeedBaccara();
        speedBaccara.play();
    }
}
