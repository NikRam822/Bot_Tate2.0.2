package com.company.telegram;

import com.company.telegram.commands.Command;
import com.company.telegram.commands.MenuHelp;
import com.company.telegram.commands.MenuInformation;
import com.company.telegram.commands.MenuStart;

import java.util.HashMap;
import java.util.Map;

public class StateMachine {
    public void setHashMap(){
        Map<String, Command> menuCommand = new HashMap<>();
        menuCommand.put("/information",new MenuInformation());
        menuCommand.put("/help",new MenuHelp());
        menuCommand.put("/start", new MenuStart());
    }
}
