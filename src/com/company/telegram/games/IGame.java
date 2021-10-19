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


}
