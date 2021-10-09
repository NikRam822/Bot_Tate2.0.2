package com.company.telegram.commands;

public enum Commands {

    ADD_BANK("/addBank", new GameAddBank()),
    EXIT("/exit", new GameExit()),
    GET_BANK("/getBank", new GameGetBank()),
    INSTRUCTION("/instrumentation", new GameInstruction()),
    PLAY("/play", new GamePlay()),
    START_GAME("/startGame", new GameStartGame()),
    HELP("/help", new MenuHelp()),
    INFORMATION("/information", new MenuInformation()),
    START("/start", new MenuStart());

    Commands(String command, ICommand realization) {
        this.command = command;
        this.realization = realization;
    }



    public  String command;
    public  ICommand realization;
}
