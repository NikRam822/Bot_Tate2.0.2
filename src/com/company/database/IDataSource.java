package com.company.database;

import com.company.module.User;

/**
 * Интерфейс для взаимодействия с бд\HashMap.
 */
public interface IDataSource {
    /**
     * Интерфейс для реализации метода сохранения пользователя в бд\HashMap.
     *
     * @param user Пользователь.
     */
    void saveUser(User user);

    /**
     * Интерфейс для реализации метода доступа к пользователю из бд\HashMap.
     *
     * @param chatId Уникальный идентификатор пользователя.
     * @return Пользователь.
     */
    User getUser(String chatId);

}
