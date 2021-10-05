package com.company.telegram.commands;

import com.company.module.User;
import com.company.module.Visualizer;

import java.sql.SQLException;

public class MenuStart extends Command {

    @Override
    public String execute(String data, User user) throws SQLException {
        return Visualizer.getHello();
    }
}





