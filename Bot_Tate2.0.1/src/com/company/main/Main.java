package com.company.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner input = new Scanner(System.in);
        GameVisualizer.getHello();
        GameVisualizer.getNoRegistration();
        for (; ; ) {
            String command = input.nextLine();
            menu.doCommandOfRegistration(command);
            menu.doCommandOfMenu(command);
        }
    }
}