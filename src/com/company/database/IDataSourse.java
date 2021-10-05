package com.company.database;

import com.company.module.User;

public interface IDataSourse {

    void saveUser(User user);

    User getUser(String chatId);

}
