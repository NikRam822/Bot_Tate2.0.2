package com.company.telegram.games;


import com.company.module.User;

/**
 * Абстрактный класс для реализации игровой логики.
 */
public abstract class Game implements IGame {

    /**
     * Метод для реализации игровой логики состояений.
     * @param data Текст, введенный пользователем.
     * @param user Пользователь.
     * @return Ответ пользователю.
     */
    @Override
    public String execute(String data, User user) {
        return null;
    }
}
