package com.company.database;

import com.company.module.User;

import java.util.HashMap;
import java.util.Map;

/**
 * Класс для realTime реализации Бота.
 */
public class HashMapSource implements IDataSource {
    private final static Map<String, User> dataUsers = new HashMap<>();

    /**
     * Класс для сохранения пользователя в HashMap.
     *
     * @param user пользователь.
     */
    @Override
    public void saveUser(User user) {

        dataUsers.put(user.getChatId(), user);

    }

    /**
     * Геттер для доступа к пользователю из HashMap
     *
     * @param chatId уникальный идентификатор пользователя.
     * @return Пользователь.
     */
    @Override
    public User getUser(String chatId) {
        return dataUsers.get(chatId);

    }


}
