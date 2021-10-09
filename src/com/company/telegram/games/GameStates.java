package com.company.telegram.games;

/**
 * Enum состояний игры пользователя.
 */
public enum GameStates {

    GREETING(new Game0()),
    CREATE_STEPS(new Game1()),
    DO_TOTE(new Game2()),
    PLAY(new Game3());

    /**
     * Реализация програмной логики игры.
     */
    public IGame realisation;

    /**
     * Конструктор класса.
     *
     * @param realisation Реализация програмной логики игры.
     */
    GameStates(IGame realisation) {
        this.realisation = realisation;
    }

}
