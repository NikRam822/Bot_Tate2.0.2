package com.company.telegram.games;


import com.company.module.User;
import com.company.telegram.commands.Commands;


/**
 * Абстрактный класс для реализации игровой логики.
 */
public abstract class Game implements IGame {

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public GameStates getGameCode() {
        return gameCode;
    }

    public void setGameCode(GameStates gameCode) {
        this.gameCode = gameCode;
    }

    private String response;

    private GameStates gameCode;

    /**
     * Абстрактный метод интерфейса.
     *
     * @param data Текст, введенный пользовтаелем.
     * @param user Пользователь.
     * @return Ответ пользователю
     */
    @Override
    public  String execute(String data, User user){
        user.setGameCode(gameCode);
        return response;

    }


//    /**
//     * Метод, отправляющий ответ пользователю, и устанавлювающий требуемый gameCode.
//     *
//     * @param user     Пользователь.
//     * @param response Ответ пользовтаелю.
//     * @param gameCode Игровой код состояния пользователя в игре.
//     * @return ответ пользовтаелю.
//     */
//    private String sendResponseAndSetGameCode(User user, String response, GameStates gameCode) {
//
//    }

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
