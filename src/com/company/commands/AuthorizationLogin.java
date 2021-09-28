package com.company.commands;

import com.company.main.Menu;
import com.company.module.User;

import java.util.Arrays;
import java.util.Scanner;

public class AuthorizationLogin extends Command {
    @Override
    public void execute() {
       // if(AuthorizationRegistration.usersBase.isEmpty()){AuthorizationRegistration.readAllUsersFromFile();}
        System.out.println("до");
        for (User value : AuthorizationRegistration.usersBase) {
            System.out.println(value.login + ": " + value.getBank());
        }
        AuthorizationRegistration.readAllUsersFromFile();

        System.out.println("после");
        System.out.println("Кол-во обьектов :" + AuthorizationRegistration.usersBase.size());
        for (User value : AuthorizationRegistration.usersBase) {
            System.out.println(value.login + ": " + value.getBank());
        }


        Scanner in = new Scanner(System.in);
        System.out.print("Введите логин для входа в аккаунт: ");
        String login = in.nextLine();
        checkExistLoginInUsersBase(login);
    }

    /**
     * Метод для проверки логина в базе пользователей.
     *
     * @param login введенный пользователем логин.
     */
    private void checkExistLoginInUsersBase(String login) {
        Menu menu = new Menu();
        Scanner in = new Scanner(System.in);
        boolean loginIsExist = false;
        for (int i = 0; i < AuthorizationRegistration.usersBase.size(); i++) {
            if (AuthorizationRegistration.usersBase.get(i).login.equals(login)) {
                loginIsExist = true;
                AuthorizationRegistration.user = AuthorizationRegistration.usersBase.get(i);

                System.out.print("Введите пароль для входа в аккаунт: ");
                String password = in.nextLine();
                enterAndCheckPassword(password);
                break;
            }
        }
        if (loginIsExist == false) {
            String[] authorizationCommands = {"/registration", "/login", "/guest", "/information", "/help"};
            System.out.println("Введенного вами логина не существует!\nПовторите попытку,или введите /help для получения справки о возможных командах!");
            String newLoginOrCommand = in.nextLine();
            if (Arrays.asList(authorizationCommands).contains(newLoginOrCommand)) {

                menu.doCommandOfRegistration(newLoginOrCommand);
            } else {
                checkExistLoginInUsersBase(newLoginOrCommand);
            }

        }
    }

    /**
     * Метод для ввода и проверки пароля.
     * @param password пароль пользователя.
     */
    private void enterAndCheckPassword(String password) {
       Menu menu = new Menu();
        Scanner in = new Scanner(System.in);

            if (AuthorizationRegistration.user.password.equals(password)) {
                System.out.println("Добро пожаловать, " + AuthorizationRegistration.user.login + "!");
                System.out.println("Ваш банк: " + AuthorizationRegistration.user.bank + " руб.");
                 System.out.println("Добро пожаловать в пользовательское меню!\nОпции:\n/play - начать игру.\n/exit - закончить работу с ботом и перейти в раздел авторизации.");
            for(;;){
                menu.doCommandOfMenu(in.nextLine());
            }

            }
            else{
                String[] authorizationCommands = {"/registration", "/login", "/guest", "/information", "/help"};
                System.out.println("Неверный пароль!\nПовторите попытку,или введите /help для получения справки о возможных командах!");
                String newPasswordOrCommand = in.nextLine();
                if (Arrays.asList(authorizationCommands).contains(newPasswordOrCommand)) {

                    menu.doCommandOfRegistration(newPasswordOrCommand);
                } else {
                    enterAndCheckPassword(newPasswordOrCommand);
                }
            }

        }
    }
