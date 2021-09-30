package com.company.telegram.games;


import com.company.telegram.commands.GameStartGame;

public class Game0 extends Game {
    String gameCode = "g1";
    @Override
    public String execute() {
//        GameStartGame gameStartGame = new GameStartGame();
//        gameStartGame.gameCode="g1";
        return "Ну что? Поехали!\nДелай свою ставку и я загадываю число!";
    }
}
