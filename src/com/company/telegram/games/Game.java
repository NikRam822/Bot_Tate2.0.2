package com.company.telegram.games;


import com.company.module.User;
import com.company.telegram.commands.Commands;


/**
 * Абстрактный класс для реализации игровой логики.
 */
public abstract class Game implements IGame {

//DialogManager dialogManager = new DialogManager();


    /**
     * Абстрактный метод интерфейса.
     *
     * @param data Текст, введенный пользовтаелем.
     * @param user Пользователь.
     * @return Ответ пользователю
     */
    @Override
     public  String execute(String data, User user){
        GameResponse dialogSettings = doGameLogic(user, data);
        String response= dialogSettings.getResponse();
        GameStates gameCode=dialogSettings.getGameCode();
        user.setGameCode(gameCode);
        return response;
    };





abstract GameResponse doGameLogic(User user, String data);
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
