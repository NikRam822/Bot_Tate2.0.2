package com.company.commands;

import com.company.module.User;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AuthorizationRegistration extends Command{
   public User user =new User();
   List<User> usersBase=new ArrayList<>();
    @Override
    public void execute() {
        readAllUsersFromFile();
        System.out.println(usersBase.size());
        for(int i=0;i<usersBase.size();i++){
            System.out.println(usersBase.get(i).login);
        }
        //TODO: РЕГИСТРАЦИЯ ПОЛЬЗОВАТЕЛЯ И ПЕРЕХОД В ПОВТОРНОЕ ЛОГИРОВАНИЕ.

        Scanner in = new Scanner(System.in);
        System.out.print("Добро пожаловать в раздел Регистрации!\nПридумайте логин для своего аккаунта: ");
        //TODO: СДЕЛАТЬ ПРОВЕРКУ НА СОВПАДАЮЩИЕ ЛОГИНЫ
        String login = in.nextLine();
        login=checkRepeatLogin(login);
        String password = creatingAndCheckPassword();
        user.setLogin(login);
        user.setPassword(password);
        user.setBank(10000);

        recordUserInBase(user);
        //checkRepeatLogin(login);
        System.out.println("Аккаунт зарегистрирован!\nНапишите /login, чтобы войти.");
    }

    /**
     * Метод для записи пользователя в бузу данных.
     * @param user пользователь.
     */
    private void recordUserInBase(User user){
        usersBase.add(user);
        try {
            FileOutputStream fos = new FileOutputStream("Users.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeInt(usersBase.size());

            for (User user1 : usersBase) {
                oos.writeObject(user1);
            }

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*try {
            FileOutputStream usersFile=new FileOutputStream("Users.bin");
            ObjectOutputStream objectUsersFile=new ObjectOutputStream(usersFile);
            for (int i = 0; i < usersBase.size(); i++) {
                objectUsersFile.writeObject(usersBase.get(i));
            }
            objectUsersFile.writeObject(user);
                usersBase.add(user);
            objectUsersFile.close();
            System.out.println("Аккаунт в базе");
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }

    /**
     * Метод для проверки уникальности введенного логина.
     * @param login логин, введенный пользователм.
     */
    private String checkRepeatLogin(String login){
        Scanner in = new Scanner(System.in);
        boolean loginIsRepeat=false;
       // List<User> usersBase=new ArrayList<>();
        try {
            FileInputStream usersFile = new FileInputStream("Users.bin");
            ObjectInputStream objectUsersFile = new ObjectInputStream(usersFile);
        //int usersCount = objectUsersFile.readInt();

            for(int i=0;i<objectUsersFile.readInt();i++){
                usersBase.add((User) objectUsersFile.readObject());
                //Формирование листа пользователя.
               // System.out.println(usersBase.get(i));
               // System.out.println("Идет проверка");
            }
           // if(usersBase.)
            for(int i=0;i<objectUsersFile.readInt();i++){
                if (usersBase.get(i).login.equals(login)) {
                    while (usersBase.get(i).login.equals(login)){
                        System.out.println("Такой логин уже существует.\nВведите логин повторно:");
                        login=in.nextLine();

                    }
                    break;
                   // loginIsRepeat = true;
                    //break;
                }
            }
                objectUsersFile.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return login;
    }

    /**
     * Метод создания и подстверждения пароля.
     * @return пароль пользователя.
     */
    private String creatingAndCheckPassword(){
        Scanner in = new Scanner(System.in);
        System.out.print("Придумайте пароль для своего аккаунта:  ");
        String firstPassword = in.nextLine();
        System.out.print("Повторите пароль: ");
        String secondPassword = in.nextLine();
        while (!firstPassword.equals(secondPassword)) {
            System.out.println("Пароли не совпадают! Повторите попытку!");
            System.out.print("Новый пароль: ");
            firstPassword = in.nextLine();
            System.out.print("Повторите пароль: ");
            secondPassword = in.nextLine();
        }
        return secondPassword;
    }

    private void readAllUsersFromFile(){
        try {
            FileInputStream usersFile = new FileInputStream("Users.bin");
            ObjectInputStream objectUsersFile = new ObjectInputStream(usersFile);

            int userSize = objectUsersFile.readInt();
            System.out.println("Обьекты в файле:"+ userSize);
            for (int i = 0; i < userSize; i++) {
                usersBase.add((User) objectUsersFile.readObject());
            }
            objectUsersFile.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    }
