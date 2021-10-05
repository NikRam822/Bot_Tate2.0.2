package com.company.telegram.commands;

import com.company.module.User;

import java.sql.SQLException;

public abstract class Command implements ICommand {

    @Override
    public String execute(String data, User user) throws SQLException { return null; }
}
