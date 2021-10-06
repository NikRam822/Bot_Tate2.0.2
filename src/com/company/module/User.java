package com.company.module;


public class User {


    private String chatId;

    private int bank;

    private int gameCode;

    private Integer targetNumber;
    private int tote;

    public User() {
    }

    public User(String chatId, int bank, int gameCode, Integer targetNumber, int tote, int steps) {
        this.chatId = chatId;
        this.bank = bank;
        this.gameCode = gameCode;
        this.targetNumber = targetNumber;
        this.tote = tote;
        this.steps = steps;
    }


    public User(String chatId, int bank, int gameCode, Integer targetNumber) {
        this.chatId = chatId;
        this.bank = bank;
        this.gameCode = gameCode;
        this.targetNumber = targetNumber;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    private int steps;


    public int getTote() {
        return tote;
    }

    public void setTote(int tote) {
        this.tote = tote;
    }


    public void setTargetNumber(Integer targetNumber) {
        this.targetNumber = targetNumber;
    }

    public Integer getTargetNumber() {
        return targetNumber;
    }


    /**
     * @return
     */
    public int getGameCode() {
        return gameCode;
    }

    /**
     * @param gameCode
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
     * Метод для обращения к логину пользователя.
     *
     * @return логин пользователя.
     */
    public String getChatId() {
        return this.chatId;
    }

    /**
     * Метод для установления банка.
     *
     * @param bank банк пользователя.
     */
    public void setBank(int bank) {
        this.bank = bank;
    }

    /**
     * @param chatId
     */
    public void setChatId(String chatId) {
        this.chatId = chatId;
    }


}
