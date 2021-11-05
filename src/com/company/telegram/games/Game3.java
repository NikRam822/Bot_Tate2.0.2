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
        if (user.getSteps() == 0 && parseInt(data) != user.getTargetNumber()) {
            user.setBank(user.getBank() - user.getTote());
            user.setTote(0);
            setResponse( Visualizer.LOSER + user.getTargetNumber() + Visualizer.GAME_EXIT);
            setGameCode(GameStates.GREETING);
            return super.execute(data,user);//sendResponseAndSetGameCode(user, Visualizer.LOSER + user.getTargetNumber() + Visualizer.GAME_EXIT, GameStates.GREETING);
        }
        if (parseInt(data) != user.getTargetNumber() & parseInt(data) > user.getTargetNumber()) {
            setResponse(Visualizer.MORE + user.getSteps() + Visualizer.GAME_EXIT);
            setGameCode(GameStates.PLAY);
            return super.execute(data, user);//sendResponseAndSetGameCode(user, Visualizer.MORE + user.getSteps() + Visualizer.GAME_EXIT, GameStates.PLAY);
        }
        if (parseInt(data) != user.getTargetNumber() & parseInt(data) < user.getTargetNumber()) {
            setResponse(Visualizer.NO_MORE + user.getSteps() + Visualizer.GAME_EXIT);
            setGameCode(GameStates.PLAY);
            return super.execute(data, user);//sendResponseAndSetGameCode(user, Visualizer.NO_MORE + user.getSteps() + Visualizer.GAME_EXIT, GameStates.PLAY);
        }
        if (parseInt(data) == user.getTargetNumber()) {
            user.setBank(user.getBank() + user.getTote() * 2);
            user.setSteps(0);
            setResponse(Visualizer.WIN + user.getBank());
            setGameCode(GameStates.GREETING);
            return super.execute(data, user);//sendResponseAndSetGameCode(user, Visualizer.WIN + user.getBank(), GameStates.GREETING);
        }
        setResponse(Visualizer.TRY_CREATE + Visualizer.GAME_EXIT);
        setGameCode(GameStates.GREETING);
        return super.execute(data, user);//sendResponseAndSetGameCode(user, Visualizer.TRY_CREATE + Visualizer.GAME_EXIT, GameStates.GREETING);
    }
}
