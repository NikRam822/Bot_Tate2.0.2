package com.company.module;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 4529685098267757690L; // для Сериализации
    public  String login;
    public  String password;
    public  int bank;


   /**
     * Метод для обращения к банку пользователя.
     * @return банк пользователя.
     */
    public  int getBank(){

        return this.bank;
    }

   /**
     * Метод для обращения к паролю пользователя.
     * @return пароль пользователя
     */
    public String getPassword(){
        return this.password;
    }

    /**
     * Метод для обращения к логину пользователя.
     * @return логин пользователя.
     */
    public String getLogin(){
        return this.login;
    }

    /**
     * Метод для установления банка.
     * @param bank банк пользователя.
     */
    public void setBank(int bank){
        this.bank = bank;
    }

    /**
     * Метод для установления логина пользователя.
     * @param login логин пользователь.
     */
    public void setLogin(String login){
       this.login =login;
    }

    /**
     * Метод для учтановление пароля пользователя.
     * @param password пароль пользователя.
     */
    public void setPassword(String password){
        this.password =password;
    }

}
