package com.company.telegram.commands;
import com.company.telegram.games.Game0;
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
//    static Map<String, Game> gameCommand = new HashMap<>();

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
//                Random rn = new Random();
//                user.setTargetNumber(rn.nextInt(100) + 1);
//                user.setGameCode(1);
                return new Game0().execute(data,user);/*Visualizer.getGameStart() + user.getBank()+ Visualizer.getGameExit();*/
            }
            case 1 -> {
//                if (parseInt(data) > 10) {
//                    return Visualizer.getErrorStepsMore() + Visualizer.getGameExit();
//                }
//                if (parseInt(data) <= 0) {
//                    return Visualizer.getErrorStepsNoMore() + Visualizer.getGameExit();
//                }
//
//                user.setSteps(Integer.parseInt(data));
//
//                user.setGameCode(2);
                return new Game1().execute(data, user);/*Visualizer.getDoTote() + Visualizer.getGameExit();*/
            }
            case 2 -> {
//                if (parseInt(data) > user.getBank()) {
//                    return Visualizer.getErrorToteMore() + Visualizer.getGameExit();
//                }
//                if (parseInt(data) < 0) {
//                    return Visualizer.getErrorToteNoMore()+ Visualizer.getGameExit();
//                }
//                user.setTote(parseInt(data));
//                user.setGameCode(3);
//                return Visualizer.getGoodToteStartGame()+ Visualizer.getGameExit();
                return new Game2().execute(data, user);
            }
            case 3 -> {
//                user.setSteps(user.getSteps() - 1);
//                if (user.getSteps() == 0) {
//                    user.setBank(user.getBank() - user.getTote());
//                    user.setTote(0);
//                    user.setGameCode(0);
//                    return Visualizer.getLoser() + user.getTargetNumber() + Visualizer.getGameExit();
//                }
//                if (parseInt(data) != user.getTargetNumber() & parseInt(data) > user.getTargetNumber()) {
//                    return Visualizer.getMore() + user.getSteps() + Visualizer.getGameExit();
//                }
//                if (parseInt(data) != user.getTargetNumber() & parseInt(data) < user.getTargetNumber()) {
//                    return Visualizer.getNoMore() + user.getSteps()+ Visualizer.getGameExit();
//                }
//                if (parseInt(data) == user.getTargetNumber()) {
//                    user.setGameCode(0);
//                    user.setBank(user.getBank() + user.getTote() * 2);
//                    user.setSteps(0);
//                    user.setTote(0);
//                    return Visualizer.getWin() + user.getBank();
//                }
//                user.setGameCode(4);
//                return Visualizer.getTryCreate()+ Visualizer.getGameExit();
                return new Game3().execute(data, user);
            }
        }


        return "!";
    }


}
