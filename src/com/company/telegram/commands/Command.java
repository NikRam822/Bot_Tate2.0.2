package com.company.telegram.commands;

import java.sql.SQLException;

public abstract class Command implements ICommand {

    @Override
    public String execute() throws SQLException { return null; }
}
