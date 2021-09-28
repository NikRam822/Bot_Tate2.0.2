package com.company.commands;

import com.company.main.Menu;
import java.util.Scanner;

public class MenuExit extends Command {
    @Override
    public void execute() {
        Scanner in = new Scanner(System.in);
        Menu menu = new Menu();
        System.out.println("Всего хорошего! Возвращайтесь скорее!");
        System.out.println("Добро пожаловать в раздел авторизации!");
        System.out.println("Напиши команду /help чтобы узнать, что я могу!");
        for(;;) {
            menu.doCommandOfRegistration(in.nextLine());
        }
    }
}
