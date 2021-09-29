package com.company.module;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Сущность ставка.
 */
public class Bet {

    /**
     * Метод для обработки введнных ставок.
     * @param userLine введенные ставки
     * @return ставки в значении int
     */
    public static ArrayList<Integer> takeBet(String userLine, int bank) {
        int sumBet = 0;
        try {
            ArrayList<Integer> betsValue = new ArrayList<>();
            String[] bets = userLine.split(" ");
            for (String bet : bets) {
                betsValue.add(Integer.parseInt(bet));
                sumBet = sumBet + Integer.parseInt(bet);
            }
            if (sumBet > bank || betsValue.size()!=5) {
                Visualizer.getDistributionError();
                return new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0));
            }
            return betsValue;
        } catch (Exception exception) {
            Visualizer.getDistributionError();
            return new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0));
        }
    }

}