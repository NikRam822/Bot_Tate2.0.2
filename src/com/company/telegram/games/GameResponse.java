package com.company.telegram.games;

public class GameResponse {

    private String response;

    private GameStates gameCode;

    public String getResponse() {
        return response;
    }

    public GameStates getGameCode() {
        return gameCode;
    }
    GameResponse(String response, GameStates gameCode){
        this.response = response;
        this.gameCode = gameCode;
    }
    
}
