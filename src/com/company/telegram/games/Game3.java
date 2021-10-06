package com.company.telegram.games;


import com.company.module.User;
import com.company.module.Visualizer;

import static java.lang.Integer.parseInt;

/**
 * Класс для реализации основного процесса игры.
 */
public class Game3 extends Game {

    /**
     * Метод реализации основной игровой логики.
     *
     * @param data Текст, введенный пользователем.
     * @param user Пользователь.
     * @return Игровые данные. Ответ пользователю.
     */
    @Override
    public String execute(String data, User user) {
        user.setSteps(user.getSteps() - 1);
        if (user.getSteps() == 0) {
            user.setBank(user.getBank() - user.getTote());
            user.setTote(0);
            user.setGameCode(0);
            return Visualizer.LOSER + user.getTargetNumber() + Visualizer.GAME_EXIT;
        }
        if (parseInt(data) != user.getTargetNumber() & parseInt(data) > user.getTargetNumber()) {
            return Visualizer.MORE + user.getSteps() + Visualizer.GAME_EXIT;
        }
        if (parseInt(data) != user.getTargetNumber() & parseInt(data) < user.getTargetNumber()) {
            return Visualizer.NO_MORE + user.getSteps() + Visualizer.GAME_EXIT;
        }
        if (parseInt(data) == user.getTargetNumber()) {
            user.setGameCode(0);
            user.setBank(user.getBank() + user.getTote() * 2);
            user.setSteps(0);
            user.setTote(0);
            return Visualizer.WIN + user.getBank();
        }
        user.setGameCode(4);
        return Visualizer.TRY_CREATE + Visualizer.GAME_EXIT;
    }
}
