package com.company.commands;

public class MenuGame extends Command {
    @Override
    public  void execute() {
        Menu menu = new Menu();
        System.out.println("Добро пожаловать в раздел игр!\nИгры ИИ против ИИ:\n   /SpeedBaccara - быстрая версия игры Баккара.\nОпции:\n   /exit - выход.");
        menu.doCommandOfGame();
    }
}
