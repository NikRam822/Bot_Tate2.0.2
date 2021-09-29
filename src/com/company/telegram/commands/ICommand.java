package com.company.telegram.commands;

import java.sql.SQLException;

public interface ICommand {

    String execute() throws SQLException;
}
