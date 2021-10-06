package com.company.telegram.commands;

import com.company.module.User;
import com.company.module.Visualizer;

/**
 * Класс реализации программной логики команды /instruction.
 */
public class GameInstruction extends Command {
    /**
     * Метод реализации програмной логики команды /instruction.
     *
     * @param data Текст,введнный пользователем.
     * @param user Пользователь.
     * @return Инструкция к игре MagickNumber.
     */
    @Override
    public String execute(String data, User user) {
        return Visualizer.getHowPlay();
    }
}
