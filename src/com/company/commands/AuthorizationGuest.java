package com.company.commands;

import com.company.main.Menu;
import com.company.module.User;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AuthorizationGuest extends Command{
    public static String dynamicPartOfPasswordGuest;
    @Override
    public void execute() {
        Menu menu = new Menu();
        Scanner in = new Scanner(System.in);
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd"+" "+"hh:mm:ss a zzz");
        dynamicPartOfPasswordGuest = formatForDateNow.format(dateNow);
        User guest = new User();
        guest.setLogin("Dbr3{gnsTmP{8bJhX*I{Cgf*72EkH|qDL7TMn~$*ymNbXIJ$Kt$o|O?bSVTjmEXD%vu4r#G4*RRoAlAdt?XEHQ*GkVmlFwm@@*N48*N?hxnz4x~~L{rCnl9{pSG88L#uLPGOjfjA6H@~aTA#c?%$r0N75o~yHB|9");
        guest.setPassword("Dbr3{gnsTmP{8bJhX*I{Cgf*72EkH|qDL7TMn~$*ymNbXIJ$Kt$o|O?bSVTjmEXD%vu4r#G4*RRoAlAdt?XEHQ*GkVmlFwm@@*N48*N?hxnz4x~~L{rCnl9{pSG88L#uLPGOjfjA6H@~aTA#c?%$r0N75o~yHB|9" + dynamicPartOfPasswordGuest);
        guest.setBank(15000);
        AuthorizationRegistration.user = guest;
        //TODO:ИНФОРМАЦИЯ О ГОСТЕВОМ ВХОДЕ И ВОЗМОЖНОСТЬ ИГРАТЬ
        System.out.println("""
                Добро пожаловать в гостевой аккаунт!
                Возможности гостевого аккаунта:
                1) Демо-банк: Вам выдается 15000.
                2) Вы не учититываетесь в рейтинге игроков.
                3) Прогресс не сохраняется, достижения не будут получены, банк не сохранен.
                4) Вам достпуны все игры, кроме игр из раздела Slots.
                Узнать возможности авторизированного аккаунта /accounts.
                """);
        System.out.println("Добро пожаловть в пользовательсоке меню!\nОпции:\n/play - начать игру.\n/exit - закончить работу с ботом и перейти в раздел авторизации.");
        for(;;) {
            menu.doCommandOfMenu(in.nextLine());
        }
    }
}
