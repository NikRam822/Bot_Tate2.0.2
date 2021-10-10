package com.company.database;

import com.company.module.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Класс для создания Бд.
 */
public class DBSource implements IDataSource {
    /**
     * Подключение к бд.
     */
    private final SQLiteConnection sqLiteConnection;

    /**
     * Конструктор класса.
     *
     * @param sqLiteConnection подключение к бд
     * @throws SQLException возможные ошибки при подключении.
     */
    public DBSource(SQLiteConnection sqLiteConnection) throws SQLException {
        this.sqLiteConnection = new SQLiteConnection();
    }

    /**
     * Сохранение ползователя в бд.
     *
     * @param user Пользователь.
     */
    @Override
    public void saveUser(User user) {
        try (PreparedStatement statement = sqLiteConnection.getConnection().prepareStatement(
                "INSERT OR REPLACE INTO users(id, bank, game_code, number, tote, steps) " +
                        "VALUES(?, ?, ?, ?,?,?)")) {
            statement.setObject(1, user.getChatId());
            statement.setObject(2, user.getBank());
            statement.setObject(3, user.getGameCode().gameCode);
            statement.setObject(4, user.getTargetNumber());
            statement.setObject(5, user.getTote());
            statement.setObject(6, user.getSteps());
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Геттер для доступа к пользователю из бд.
     *
     * @param chatId Уникальный идентификатор чата.
     * @return Пользователь(id, банк пользователя, игровой код, загаданное число, ставка, кол - во попвыток для угадывания числа)
     */
    @Override
    public User getUser(String chatId) {
        try (Statement statement = sqLiteConnection.getConnection().createStatement()) {
            ResultSet resultSet = statement.executeQuery(String.format("SELECT * FROM users WHERE id='%s'", chatId));
            return new User(resultSet.getString("id"),
                    resultSet.getInt("bank"),
                    resultSet.getInt("game_code"),
                    resultSet.getInt("number"),
                    resultSet.getInt("tote"),
                    resultSet.getInt("steps"));

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
