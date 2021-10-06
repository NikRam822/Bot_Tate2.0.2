package com.company.telegram.commands;

import com.company.module.User;
import com.company.module.Visualizer;

public class GameExit extends Command {
    @Override
    public String execute(String data, User user) {
        return Visualizer.getMenuExit();
    }
}
