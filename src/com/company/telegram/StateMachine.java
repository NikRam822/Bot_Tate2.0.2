package com.company.telegram;

import com.company.telegram.commands.*;

import java.util.HashMap;
import java.util.Map;

public class StateMachine {
    static Map<String, Command> menuCommand = new HashMap<>();

    /**
     *
     */
    public static void setHashMap() {
        menuCommand.put("/startGame", new GameStartGame());
        menuCommand.put("/exit", new GameExit());
        menuCommand.put("/instrumentation", new GameInstruction());
        menuCommand.put("/play", new GamePlay());
        menuCommand.put("/information", new MenuInformation());
        menuCommand.put("/help", new MenuHelp());
        menuCommand.put("/start", new MenuStart());
    }

    /**
     * @param command
     * @return
     */
    public String doCommand(String command) {
        try {
            ICommand iCommand = menuCommand.get(command);
            if(GameStartGame.gameCode!=0){return new GameStartGame().execute(command);}
            return iCommand.execute(command);
        } catch (Exception exception) {
            return "Не понял команду!";
        }
    }
}
