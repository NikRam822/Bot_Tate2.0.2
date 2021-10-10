package com.company.module;

import com.company.telegram.commands.Commands;
import com.company.telegram.games.GameStates;

import java.util.Arrays;

/**
 * Класс, описывающий сущность Пользователь
 */
public class User {

    /**
     * Уникальный индентификатор.
     */
    private String chatId;

    /**
     * Банк пользователя.
     */
    private int bank;

    /**
     * Игровой код, для конторля состояния пользователя в игре.
     */
    private int gameCode;

    /**
     * Загаданное ботом число.
     */
    private Integer targetNumber;

    /**
     * Ставка пользователя.
     */
    private int tote;

    /**
     * Кол-во попыток на угадывание числа.
     */
    private int steps;

    /**
     * Конструктор по умолчанию.
     */
    public User() {
    }

    /**
     * Полный конструктор для создания пользователя.
     *
     * @param chatId       Уникальный идентификатор.
     * @param bank         Банк пользователя.
     * @param gameCode     Игровой код.
     * @param targetNumber Загаданное число.
     * @param tote         Ставка пользователя.
     * @param steps        Кол-во попыток на угадывания числа.
     */
    public User(String chatId, int bank, int gameCode, Integer targetNumber, int tote, int steps) {
        this.chatId = chatId;
        this.bank = bank;
        this.gameCode = gameCode;
        this.targetNumber = targetNumber;
        this.tote = tote;
        this.steps = steps;
    }

    /**
     * Частичный конструктор для создания пользователя.
     *
     * @param chatId       Уникальный идентификатор.
     * @param bank         Банк пользователя.
     * @param gameCode     Игровой код.
     * @param targetNumber Загаданное число.
     */
    public User(String chatId, int bank, int gameCode, Integer targetNumber) {
        this.chatId = chatId;
        this.bank = bank;
        this.gameCode = gameCode;
        this.targetNumber = targetNumber;
    }

    /**
     * Геттер для доступа к кол-ву попыток на угадыания числа.
     *
     * @return Кол-во попыток на угадыания числа.
     */
    public int getSteps() {
        return steps;
    }

    /**
     * Сеттер для установления кол-ва попыток на угадывание.
     *
     * @param steps Кол-во попыток на угадыания числа.
     */
    public void setSteps(int steps) {
        this.steps = steps;
    }


    /**
     * Геттер для получения ставки.
     *
     * @return Ставка пользователя.
     */
    public int getTote() {
        return tote;
    }

    /**
     * Сеттер для установления ставки.
     *
     * @param tote Ставка пользователя.
     */
    public void setTote(int tote) {
        this.tote = tote;
    }

    /**
     * Сеттер для установления загаданного ботом числа.
     *
     * @param targetNumber Загаданное ботом число.
     */
    public void setTargetNumber(Integer targetNumber) {
        this.targetNumber = targetNumber;
    }

    /**
     * Геттер для доступа к загадонному ботом числу.
     *
     * @return Загаданное ботом число.
     */
    public Integer getTargetNumber() {
        return targetNumber;
    }


    /**
     * Геттер для доступа к игровому коду пользователя.
     *
     * @return Игровой код пользователя для контроля состояния пользователя в игре.
     */
    public GameStates getGameCode() {
        return Arrays.stream(GameStates.values()).filter((t)->t.gameCode ==gameCode).findFirst().get();
    }

    /**
     * Сеттер для установления игрвого кода пользователя.
     *
     * @param gameCode Игровой код пользователя для контроля состояния пользователя в игре.
     */
    public void setGameCode(int gameCode) {
        this.gameCode = gameCode;
    }


    /**
     * Метод для обращения к банку пользователя.
     *
     * @return банк пользователя.
     */
    public int getBank() {

        return this.bank;
    }

    /**
     * Геттер для обращения к уникальному идентификатору пользоватля.
     *
     * @return Уникальный идентификатор пользоватля.
     */
    public String getChatId() {
        return this.chatId;
    }

    /**
     * Сеттер для установления банка.
     *
     * @param bank банк пользователя.
     */
    public void setBank(int bank) {
        this.bank = bank;
    }

    /**
     * Сеттер для установления уникального идентификатора доступа.
     *
     * @param chatId Уникальный идентификатор пользоватля.
     */
    public void setChatId(String chatId) {
        this.chatId = chatId;
    }


}
