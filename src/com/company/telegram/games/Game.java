package com.company.telegram.games;


import com.company.module.User;
import com.company.telegram.commands.Commands;


/**
 * Абстрактный класс для реализации игровой логики.
 */
public abstract class Game implements IGame {

    /**
     * Метод для реализации игровой логики состояений.
     * @param data Текст, введенный пользователем.
     * @param user Пользователь.
     * @return Ответ пользователю.
     */
    @Override
    public   String execute(String data, User user) {
        return null ;
    }

    /**
     *Метод отправки ответа пользовтаелю.
     *
     * @param user пользователь.
     * @param response ответ пользователя.
     * @param gameCode код статуса.
     * @return ответ пользователю.
     */
    protected String sendResponse(User user, String response,  GameStates gameCode ){
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
