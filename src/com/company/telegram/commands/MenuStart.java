package com.company.telegram.commands;

import com.company.module.Visualizer;

public class MenuStart extends Command {

    @Override
    public String execute() {
        return Visualizer.getHello();
    }

}
