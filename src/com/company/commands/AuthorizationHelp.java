package com.company.commands;

import com.company.speedbaccara.GameVisualizer;

public class AuthorizationHelp extends Command {
    @Override
    public void execute() {
        GameVisualizer.getAuthorizationHelp();
    }
}
