package com.company.commands;

public class MenuExit extends Command {
    @Override
    public void execute() {
        System.out.println("Всего хорошего! Возвращайтесь скорее!");
        System.out.println("Напиши команду /help чтобы узнать, что я могу!");
    }
}
