package com.company.main;

import com.company.speedbaccara.GameVisualizer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner input = new Scanner(System.in);
        GameVisualizer.getHello();
//        GameVisualizer.getNoRegistration();
        for (; ; ) {
            String command = input.nextLine();
            menu.doCommandOfRegistration(command);
        }
    }
}