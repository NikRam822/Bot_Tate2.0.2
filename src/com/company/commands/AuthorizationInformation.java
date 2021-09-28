package com.company.commands;

import com.company.speedbaccara.GameVisualizer;

public class AuthorizationInformation extends Command {
    @Override
    public void execute() {
        GameVisualizer.getInformation();
    }
}
