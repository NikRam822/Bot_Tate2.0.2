package com.company.telegram.commands;

import com.company.module.Visualizer;

public class GamePlay extends Command {
    @Override
    public String execute(String data) {
        return Visualizer.getInstructionGreeting();
    }
}
