package com.company.telegram.games;


import com.company.module.User;
import com.company.telegram.commands.Commands;


/**
 * Абстрактный класс для реализации игровой логики.
 */
public abstract class Game implements IGame {

    /**
     * Метод, реализующий основную логику состояний.
     * @param user пользователь
     * @param response ответ пользователю.
     * @param gameCode игровой код.
     * @return ответ пользователю.
     */
    @Override
    public   String execute(User user, String response, GameStates gameCode) {
        user.setGameCode(gameCode);
        return response;
    }



    /**
     * Метод обработки введенных чисел.
     *
     * @param number число.
     * @return Число, или не число.
     */
    protected boolean  doProcessingOfNumber(String number){
        try {
            if( !number.equals(Commands.EXIT.command) && Integer.parseInt(number)>-1) {
                return true;

            }
             return true;

        } catch (NumberFormatException e) {
            return false;
        }

    }
}
