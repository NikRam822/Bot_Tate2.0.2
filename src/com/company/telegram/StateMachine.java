package com.company.telegram;

import com.company.module.User;
import com.company.telegram.commands.*;
import com.company.telegram.games.GameStates;

import java.util.HashMap;
import java.util.Map;

/**
 * Класс для реализации програмной логики команд.
 */
public class StateMachine {

    /**
     * HashMap комманд.
     */
    static Map<String, ICommand> menuCommand = new HashMap<>();


    static {

        for (Commands command : Commands.values()) {
            menuCommand.put(command.command, command.realization);
        }
    }

    /**
     * Метод для выполнения команд меню.
     *
     * @param command Текст,введенный пользователем.
     * @return Ответ пользователю.
     */
    public String doCommand(String command, User user) {

        try {
            ICommand iCommand = menuCommand.get(command);
            if (user.getGameCode() != GameStates.GREETING.gameCode && !command.equals("/exit")) {
                return new GameStartGame().execute(command, user);
            }
            return iCommand.execute(command, user);
        } catch (Exception exception) {
            return "Не понял команду!";
        }
    }
}
