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
  abstract   public  String execute(String data, User user);

    protected String initResponse(String response){
        return response;
}

protected GameStates initGameCode(GameStates gameCode,User user){
        user.setGameCode(gameCode);
        return gameCode;
}

abstract String getResponseAndSetGameCode(String response, GameStates gameCode);
    /**
     * Метод обработки введенных чисел.
     *
     * @param number число.
     * @return Число, или не число.
     */
    protected boolean checkTypeOfNumber(String number) {
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
