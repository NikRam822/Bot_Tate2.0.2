package com.company.telegram.commands;

import com.company.module.User;
import com.company.module.Visualizer;

public class GamePlay extends Command {
    @Override
    public String execute(String data, User user) {
        return Visualizer.getInstructionGreeting();
    }
}
