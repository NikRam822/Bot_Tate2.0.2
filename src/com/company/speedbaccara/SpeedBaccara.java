package com.company.speedbaccara;

import com.company.commands.AuthorizationGuest;
import com.company.commands.AuthorizationRegistration;
import com.company.main.IGame;
import com.company.module.Card;
import com.company.module.Deck;
import com.company.module.Exodus;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

import static com.company.speedbaccara.GameVisualizer.getBet;

/**
 * Класс для реализации игры SpeedBaccara.
 */
public class SpeedBaccara implements IGame, ISpeedBaccara {

    @Override
    public void updateBankOfUser() {
        System.out.println("Ваш банк: "+ AuthorizationRegistration.user.getBank() + ".");
        if(!AuthorizationRegistration.user.login.equals("Dbr3{gnsTmP{8bJhX*I{Cgf*72EkH|qDL7TMn~$*ymNbXIJ$Kt$o|O?bSVTjmEXD%vu4r#G4*RRoAlAdt?XEHQ*GkVmlFwm@@*N48*N?hxnz4x~~L{rCnl9{pSG88L#uLPGOjfjA6H@~aTA#c?%$r0N75o~yHB|9") && !AuthorizationRegistration.user.password.equals("Dbr3{gnsTmP{8bJhX*I{Cgf*72EkH|qDL7TMn~$*ymNbXIJ$Kt$o|O?bSVTjmEXD%vu4r#G4*RRoAlAdt?XEHQ*GkVmlFwm@@*N48*N?hxnz4x~~L{rCnl9{pSG88L#uLPGOjfjA6H@~aTA#c?%$r0N75o~yHB|9"+ AuthorizationGuest.dynamicPartOfPasswordGuest)){
            AuthorizationRegistration.recordUserInBase(AuthorizationRegistration.user);
        }

    }

    @Override
    public String isGameOver(int Player, int Banker) {
        if (Banker > Player) {
            System.out.println("Банкир выиграл!");
            return String.valueOf(com.company.module.Exodus.Banker);
        } else if (Banker < Player) {
            System.out.println("Игрок выиграл!");
            return String.valueOf(Exodus.Player);
        } else {
            System.out.println("Ого! Ничья!");
            return String.valueOf(Exodus.Draw);
        }
    }

    @Override
    public void countinuationResolution(Stack<Card> deckBanker, Stack<Card> deckPlayer, String text) {
        if (text.equals("/exit")) {
            System.out.println("До свидания! Возвращайтесь еще!");
            updateBankOfUser();
            GameVisualizer.getInstructionGreeting();
            deckBanker.clear();
            deckPlayer.clear();
        }
    }

    @Override
    public  String paymentNaturalWin(int sumPlayer, int sumBanker) {
        if (sumBanker == 9) {
            System.out.println("Вау! Натуральная победа у Банкира!");
            return String.valueOf(Exodus.Banker);
        } else if (sumPlayer == 9) {
            System.out.println("Вау! Натуральная победа у Игрока!");
            return String.valueOf(Exodus.Player);
        } else { return String.valueOf(Exodus.None); }
    }

    @Override
    public int countOfBank(ArrayList<Integer> bets, String exodus, String exodusNaturalWin) {
        int win = 0;
        AuthorizationRegistration.user.setBank(AuthorizationRegistration.user.getBank()-(bets.get(0) + bets.get(1) + bets.get(2) + bets.get(3) + bets.get(4)));
        switch (exodus) {
            case "Banker" -> win = win + (bets.get(0) * 2);
            case "Player" -> win = win + (bets.get(2) * 2);
            case "Draw" -> win = win + (bets.get(3) * 21) + bets.get(0) + bets.get(2);
        }
        switch (exodusNaturalWin) {
            case "Banker" -> win = win + (bets.get(3) * 10);
            case "Player" -> win = win + (bets.get(4) * 10);
        }
        AuthorizationRegistration.user.setBank(AuthorizationRegistration.user.getBank()+win);
        return AuthorizationRegistration.user.getBank();
    }

    @Override
    public void realizationGame(Stack<Card> deckBanker, Stack<Card> deckPlayer) {
        Deck deck = new Deck();
        Scanner scan = new Scanner(System.in);
        int numberGame = 0;
        while (deckBanker.size() + deckPlayer.size()>21 ) {
            numberGame++;
            getBet();
            String textAct = scan.nextLine();
            countinuationResolution(deckBanker,deckPlayer,textAct);
            if (!deckBanker.isEmpty() & !deckPlayer.isEmpty()) {
                int[] banks = deck.giveCards(deckBanker, deckPlayer, numberGame);
                String exodus = isGameOver(banks[1], banks[0]);
                String exodusNaturalWin = paymentNaturalWin(banks[1], banks[0]);
                ArrayList<Integer> takeBets = com.company.module.Bet.takeBet(textAct,AuthorizationRegistration.user.getBank());
                int win = (-1)*AuthorizationRegistration.user.getBank()+countOfBank(takeBets, exodus, exodusNaturalWin) ;
               if (win < 0) { win = 0; }
                System.out.println("Выигрыш: " + win + " руб.");
                updateBankOfUser();
            } else {
                deckBanker.clear();
                deckPlayer.clear();
            }
        }
        if ( numberGame == 21) {
            System.out.println("Колода закончилась! Начнем заново?\n/start - да\n/exit - нет");
        }
    }

    @Override
    public void play() {
        GameVisualizer.getInstructionGreeting();
        doCycle();
    }

    @Override
    public void doCycle() {
        Deck deck = new Deck();
        Scanner scan = new Scanner(System.in);
        boolean heartGame = true;
        while (heartGame) {
            String text = scan.nextLine();
            String textStartRepeat = "/start";
            String textStopNoRepeat = "/exit";
            if (textStartRepeat.contains(text) & !text.equals("")) {
                System.out.println("Хорошо! Колоды перетасованы!\nБанк: " + AuthorizationRegistration.user.getBank() + " руб.");
                realizationGame(deck.creatingDeck(), deck.creatingDeck());
            } else if (textStopNoRepeat.contains(text)) {
                System.out.println("Хорошо! Захочешь поиграть, заходи!");
                System.out.println("Добро пожаловть в пользовательсоке меню!\nОпции:\n/play - начать игру.\n/exit - закончить работу с ботом и перейти в раздел авторизации.");
                heartGame = false;
            } else if (text.equals("/instrumentation")) {
                System.out.println("Хорошо! Вот инструкция!");
                GameVisualizer.getHowPlay();
            } else {
                System.out.println("Не понял команду!");
            }

        }
    }
}