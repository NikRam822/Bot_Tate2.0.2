package com.company.commands;

import com.company.module.User;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AuthorizationRegistration extends Command {
    public static User user = new User();
    public static List<User> usersBase = new ArrayList<>();

    @Override
    public void execute() {
        System.out.println("до");
        for (User value : usersBase) {
            System.out.println(value.login);
        }

       readAllUsersFromFile();

        //todo:для визулизации логинов в файле .Оставил на всякий случай
       // System.out.println(usersBase.size());
        System.out.println("после");
        for (User value : usersBase) {
            System.out.println(value.login);
        }

        Scanner in = new Scanner(System.in);
        System.out.print("Добро пожаловать в раздел Регистрации!\nПридумайте логин для своего аккаунта: ");
        String login = in.nextLine();
        login = checkRepeatLogin(login);
        String password = creatingAndCheckPassword();
        user.setLogin(login);
        user.setPassword(password);
        user.setBank(10000);

        recordUserInBase(user);
        System.out.println("Аккаунт зарегистрирован!\nНапишите /login, чтобы войти.");
    }

    /**
     * Метод для записи пользователя в базу данных.
     *
     * @param user пользователь.
     */
    public static void recordUserInBase(User user) {
        boolean userExistInBase=false;
        for (int i=0;i<usersBase.size();i++) {
            if (usersBase.get(i).login.equals(user.login)) {
                userExistInBase = true;
                usersBase.get(i).bank = user.bank;
                break;
            }
        }
        if (userExistInBase == false) {
            usersBase.add(user);
}
        try {
            FileOutputStream usersFile = new FileOutputStream("Users.bin");
            ObjectOutputStream objectUsersFile = new ObjectOutputStream(usersFile);

            objectUsersFile.write(usersBase.size());

            for (int i=0;i<usersBase.size();i++) {
                objectUsersFile.writeObject(usersBase.get(i));
            }

            objectUsersFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод для проверки уникальности введенного логина.
     *
     * @param login логин, введенный пользователм.
     */
    private String checkRepeatLogin(String login) {
        Scanner in = new Scanner(System.in);
        try {
            FileInputStream usersFile = new FileInputStream("Users.bin");
            ObjectInputStream objectUsersFile = new ObjectInputStream(usersFile);
            int usersCount = objectUsersFile.read();
            for (int i = 0; i < usersCount; i++) {
                if (usersBase.get(i).login.equals(login)) {
                    while (usersBase.get(i).login.equals(login)) {
                        System.out.print("Такой логин уже существует.\nВведите логин повторно: ");
                        login = in.nextLine();
                    }
                }
            }
            objectUsersFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return login;
    }

    /**
     * Метод создания и подтверждения пароля.
     *
     * @return пароль пользователя.
     */
    private String creatingAndCheckPassword() {
        Scanner in = new Scanner(System.in);
        System.out.print("Придумайте пароль для своего аккаунта: ");
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

    /**
     * Метод для чтения всех пользователей и записи их в usersBase.
     */
    public static void readAllUsersFromFile() {
        List<User> users = new ArrayList<>();
        try {
            FileInputStream usersFile = new FileInputStream("Users.bin");
            ObjectInputStream objectUsersFile = new ObjectInputStream(usersFile);

            int usersCount = objectUsersFile.read();
            //todo: Для визуализации кол-ва обьектов в файле.
            System.out.println("Обьекты в файле: " + usersCount);
            for (int i = 0; i < usersCount; i++) {
                users.add((User) objectUsersFile.readObject());
            }
            usersBase = users;

            objectUsersFile.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}