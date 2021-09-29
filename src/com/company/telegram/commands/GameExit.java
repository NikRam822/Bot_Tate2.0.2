package com.company.telegram.commands;

import com.company.module.Visualizer;

public class GameExit extends Command {
    @Override
    public String execute() {
        return Visualizer.getMenuExit();
    }
}
