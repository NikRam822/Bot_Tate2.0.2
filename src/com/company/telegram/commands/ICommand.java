package com.company.telegram.commands;

import java.sql.SQLException;

public interface ICommand {

    String execute(String data) throws SQLException;
}
