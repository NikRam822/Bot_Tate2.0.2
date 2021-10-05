package com.company.telegram.commands;

import com.company.module.User;
import com.company.telegram.games.*;


import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static java.lang.Integer.parseInt;

public class GameStartGame extends Command {

    static Map<String, Game> gameCommand = new HashMap<>();
//    public static int gameCode = 0;

    @Override
    public String execute(String data, User user) {

        switch (user.getGameCode()) {
            case 0:
                Random rn = new Random();

//        setHashMap();

            user.setTargetNumber(rn.nextInt(100) + 1);

        user.setGameCode(1);
//                System.out.println(answer);
//                gameCode = 1;
                return "Ну что? Поехали!\nДелай свою ставку и я загадываю число!";
            case 1:
                user.setGameCode(2);
//                gameCode = 2;
                return "Ставки сделаны! Ну,что же ,начнем!\nПопробуй угадать число!";
            case 2:
                if (parseInt(data) != user.getTargetNumber() & parseInt(data) > user.getTargetNumber()) {

//                    gameCode = 2;
                    return "Больше";
                }
                if (parseInt(data) != user.getTargetNumber() & parseInt(data) < user.getTargetNumber()) {
//                    gameCode = 2;
                    return "Меньше";
                }
                if (parseInt(data) == user.getTargetNumber()) {
                    user.setGameCode(0);
//                    gameCode = 0;
                    return "Победа,Спасибо за игру!Возвращайтесь еще.";
                }
                user.setGameCode(3);
//                gameCode = 3;
                return "Ставки сделаны! Ну,что же ,начнем!\nПопробуй угадать число!";
        }


        return "!";/*Game0().execute();*/
    }

//    public static void setHashMap() {
//        gameCommand.put("g1", new Game1());
//        gameCommand.put("g1.1", new Game1_1());
//        gameCommand.put("g2", new Game2());
//        gameCommand.put("g3", new Game3());
//        gameCommand.put("g4", new Game4());
//        gameCommand.put("g5", new Game5());
//        gameCommand.put("g6", new Game6());
//        gameCommand.put("g7", new Game7());
//        gameCommand.put("g8", new Game8());
//        gameCommand.put("g9", new Game9());
//        gameCommand.put("g10", new Game10());
//        gameCommand.put("g11", new Game11());
//        gameCommand.put("g12", new Game12());

    //}

    public String doCommandGame(String gameCode) {
        try {
            IGame iGame = gameCommand.get(gameCode);
            return iGame.execute();
        } catch (Exception exception) {
            return "Не понял команду!";
        }
    }
}
