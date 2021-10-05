package com.company.database;

import com.company.module.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBSource implements IDataSource{

    private final SQLiteConnection sqLiteConnection;

    public DBSource(SQLiteConnection sqLiteConnection) throws SQLException {
        this.sqLiteConnection = new SQLiteConnection();
    }

    @Override
    public void saveUser(User user) {
        try (PreparedStatement statement = sqLiteConnection.getConnection().prepareStatement(
                "INSERT INTO user(id, bank, game_code, number) " +
                        "VALUES(?, ?, ?, ?)")) {
            statement.setObject(1, user.getChatId());
            statement.setObject(2, user.getBank());
            statement.setObject(3, user.getGameCode());
            statement.setObject(4, user.getTargetNumber());
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User getUser(String chatId) {
        try (Statement statement = sqLiteConnection.getConnection().createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users WHERE id="+chatId);
            return new User(resultSet.getString("id"),
                    resultSet.getInt("bank"),
                    resultSet.getInt("game_code"),
                    resultSet.getInt("number"));
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
