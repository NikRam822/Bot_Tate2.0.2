package com.company.telegram.games;

/**
 * Enum состояний игры пользователя.
 */
public enum GameStates {

    GREETING(0,new Game0()),
    CREATE_STEPS(1,new Game1()),
    DO_TOTE(2,new Game2()),
    PLAY(3,new Game3());

    /**
     * Реализация програмной логики игры.
     */
    public IGame realisation;

    public int gameCode;
    /**
     * Конструктор класса.
     *
     * @param realisation Реализация програмной логики игры.
     */
    GameStates(int gameCode,IGame realisation) {
        this.gameCode=gameCode;
        this.realisation = realisation;
    }

}
