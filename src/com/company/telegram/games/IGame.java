package com.company.telegram.games;

import com.company.module.User;

/**
 * Интерфейс для реализации паттерна интерфейс - абстрактный класс.
 */
public interface IGame {
    /**
     * Метод для реализации логики игровых пооцессов.
     *
     * @param data Текст, введенный пользовтаелем.
     * @param user Пользователь.
     * @return Ответ пользовтаелю
     */
    String execute(String data, User user);

    /**
     * Перегружнный метод для реализации логики контрля состояний.
     *
     * @param user Пользовтатель.
     * @param response Ответ пользовтелю.
     * @param gameCode Код состояния пользователя.
     * @return Ответ пользовтелю
     */
    String execute(User user, String response, GameStates gameCode);
}
