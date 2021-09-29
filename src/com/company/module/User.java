package com.company.module;

public class User {
    private   String chatId;
    private int bank;


    /**
     * Метод для обращения к банку пользователя.
     * @return банк пользователя.
     */
    public  int getBank(){

        return this.bank;
    }



    /**
     * Метод для обращения к логину пользователя.
     * @return логин пользователя.
     */
    public String getChatId(){
        return this.chatId;
    }

    /**
     * Метод для установления банка.
     * @param bank банк пользователя.
     */
    public void setBank(int bank){
        this.bank = bank;
    }




}
