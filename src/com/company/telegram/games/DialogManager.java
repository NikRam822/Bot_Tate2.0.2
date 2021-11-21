package com.company.telegram.games;

public class DialogManager {

    private String response;

    private GameStates gameCode;

    public String getResponse() {
        return response;
    }

    public GameStates getGameCode() {
        return gameCode;
    }

    public void setResponseAndGameCode(String response, GameStates gameCode) {
        this.response = response;
        this.gameCode = gameCode;
    }

}
