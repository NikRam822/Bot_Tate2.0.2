package com.company.telegram.commands;

import com.company.module.User;
import com.company.module.Visualizer;
import com.company.telegram.games.*;


import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static java.lang.Integer.parseInt;

/**
 * Класс реализации программной логики команды /startGame.
 */
public class GameStartGame extends Command {
    /**
     * HashMap для реализации патерна интрефес-абстрктный класс, для описния логики команд.
     */
    static Map<String, Game> gameCommand = new HashMap<>();

    /**
     * Метод реализации програмной логики команды /startGame.
     *
     * @param data Текст,введнный пользователем.
     * @param user Пользователь.
     * @return Ответ пользовтелю.
     */
    @Override
    public String execute(String data, User user) {

        switch (user.getGameCode()) {
            case 0 -> {
                Random rn = new Random();
                user.setTargetNumber(rn.nextInt(100) + 1);
                user.setGameCode(1);
                return Visualizer.getGameStart() + user.getBank()+ Visualizer.getGameExit();
            }
            case 1 -> {
                if (parseInt(data) > 10) {
                    return "С 10> и я могу! Измени ставку н 10<!" + Visualizer.getGameExit();
                }
                if (parseInt(data) <= 0) {
                    return "Какая интересная ставка...! Напиши положительное число!" + Visualizer.getGameExit();
                }

                user.setSteps(Integer.parseInt(data));

                user.setGameCode(2);
                return "Делай свою ставку и я загадываю число!\nВаша ставка?" + Visualizer.getGameExit();
            }
            case 2 -> {
                if (parseInt(data) > user.getBank()) {
                    return "У вас нет такой суммы! Измените ставку!"+ Visualizer.getGameExit();
                }
                if (parseInt(data) < 0) {
                    return "Cтавка не может быть отрицательной! Измените ставку!"+ Visualizer.getGameExit();
                }
                user.setTote(parseInt(data));
                user.setGameCode(3);
                return "Ставки сделаны, число загадано! Назови число!"+ Visualizer.getGameExit();
            }
            case 3 -> {
                user.setSteps(user.getSteps() - 1);
                if (user.getSteps() == 0) {
                    user.setBank(user.getBank() - user.getTote());
                    user.setTote(0);
                    user.setGameCode(0);
                    return "Вы проиграли! Повезет в следующий раз)\n/help\nЗагаданное число: " + user.getTargetNumber() + Visualizer.getGameExit();
                }
                if (parseInt(data) != user.getTargetNumber() & parseInt(data) > user.getTargetNumber()) {
                    return "Много\nОсталось попыток: " + user.getSteps() + Visualizer.getGameExit();
                }
                if (parseInt(data) != user.getTargetNumber() & parseInt(data) < user.getTargetNumber()) {
                    return "Мало\nОсталось попыток: " + user.getSteps()+ Visualizer.getGameExit();
                }
                if (parseInt(data) == user.getTargetNumber()) {
                    user.setGameCode(0);
                    user.setBank(user.getBank() + user.getTote() * 2);
                    user.setSteps(0);
                    user.setTote(0);
                    return "Победа,Спасибо за игру!Возвращайтесь еще.\n/help\nВаш Банк: " + user.getBank();
                }
                user.setGameCode(4);
                return "Ставки сделаны! Ну,что же ,начнем!\nПопробуй угадать число!"+ Visualizer.getGameExit();
            }
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

    /**
     * Метод для выполнения команд в игре.
     *
     * @param gameCode Код состояние пользователя в игре.
     * @return Ответ пользователю.
     */
    public String doCommandGame(String gameCode) {
        try {
            IGame iGame = gameCommand.get(gameCode);
            return iGame.execute();
        } catch (Exception exception) {
            return "Не понял команду!";
        }
    }
}
