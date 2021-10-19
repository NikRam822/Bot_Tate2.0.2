package com.company.telegram.games;


import com.company.module.User;
import com.company.telegram.commands.Commands;


/**
 * Абстрактный класс для реализации игровой логики.
 */
public abstract class Game implements IGame {

    /**
     * Абстрактный метод интерфейса.
     *
     * @param data Текст, введенный пользовтаелем.
     * @param user Пользователь.
     * @return Ответ пользователю
     */
    @Override
    public abstract String execute(String data, User user);

    /**
     * Метод, отправляющий ответ пользователю, и устанавлювающий требуемый gameCode.
     *
     * @param user     Пользователь.
     * @param response Ответ пользовтаелю.
     * @param gameCode Игровой код состояния пользователя в игре.
     * @return ответ пользовтаелю.
     */
    protected String sendResponseAndSetGameCode(User user, String response, GameStates gameCode) {
        user.setGameCode(gameCode);
        return response;
    }

    /**
     * Метод обработки введенных чисел.
     *
     * @param number число.
     * @return Число, или не число.
     */
    protected boolean doProcessingOfNumber(String number) {
        try {
            if (!number.equals(Commands.EXIT.command) && Integer.parseInt(number) > -1) {
                return true;

            }
            return true;

        } catch (NumberFormatException e) {
            return false;
        }

    }
}
