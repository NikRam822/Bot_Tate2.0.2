package com.company.telegram.commands;

/**
 * Enum для добавления комманд.
 */
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

    /**
     * Команда для пользователя.
     */
    public  String command;

    /**
     * Реализация программной логики команды.
     */
    public  ICommand realization;

    /**
     * Конструктор класса
     *
     * @param command команда для пользователя.
     * @param realization реализации прогрммной логики команды.
     */
    Commands(String command, ICommand realization) {
        this.command = command;
        this.realization = realization;
    }




}
