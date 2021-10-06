package com.company.database;

import com.company.module.User;

import java.util.HashMap;
import java.util.Map;

public class HashMapSource implements IDataSource {
    private final static Map<String, User> dataUsers = new HashMap<>();

    @Override
    public void saveUser(User user) {

        dataUsers.put(user.getChatId(), user);

    }

    @Override
    public User getUser(String chatId) {
        return dataUsers.get(chatId);

    }


}
