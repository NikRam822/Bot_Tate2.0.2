package com.company.module;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Сущности: Рука с Картами.
 */
public class CardHand {

    /**
     * Массив карт в руке.
     */
    ArrayList<Card> cardsInHand;

    /**
     * Конструктор для присваевания полей сущности Рука с Картами.
     * @param cardsInHand карты в руке
     */
    public CardHand(ArrayList<Card> cardsInHand) {
        this.cardsInHand = cardsInHand;
    }

    /**
     * Переопределенный метод для взятия элемента.
     * @param index индекс элемента массива
     * @return элемент массива
     */
    public Card get(int index) {
        return this.cardsInHand.get(index);
    }

    /**
     * Переопределенный метод для взятия размера массива.
     * @return размер массива
     */
    public int size() {
        return this.cardsInHand.size();
    }

    /**
     * Переопределнный метод для добавления карты в руку.
     * @param deck колода
     */
    private void addCard(Stack<Card> deck) {
        Deck newCard = new Deck();
        this.cardsInHand.add(newCard.getCard(deck));
    }

    /**
     * Метод для взятия суммы карт в руке.
     * @return сумма карт в руке
     */
    public int getSum() {
        int countA = 0;
        int sum = 0;
        for (Card value : this.cardsInHand) {
            String card = value.valueCards;
            if (card.equals("A")) { countA++; }
            sum = sum + toValueCard(card);
        }
        if (sum > 21) { sum = sum - 10 * countA; }
        return sum;
    }

    /**
     * Метод для перевода карт значения String в тип int.
     * @param card значение карты
     * @return значение карты типа int
     */
    private int toValueCard(String card) {
        return switch (card) {
            case "K", "Q", "J" -> 10;
            case "A" -> 11;
            default -> Integer.parseInt(card);
        };
    }




    /**
     * Метод принятия решения Игрока.
     * @return решение о взятие карты
     */
    private boolean doDecisionPlayer() {


          String takeCard = in.nextLine();

        if (takeCard.equals("/yes")) {
            return true;
        } else {
            if (!takeCard.equals("/no")) {
                System.out.println("Не понял команду!");
                doDecisionPlayer();
            }
            return false;
        }
    }

    /**
     * Метод принятия решения Банкира.
     * @param sumBanker сумма Банкира
     * @param sumPlayer сумма Игрока
     * @return решение о взятие карты
     */
    private boolean doDecisionBanker(int sumBanker, int sumPlayer) {
        if (sumPlayer > 21) { return false; }
        return ((sumBanker < sumPlayer) & sumBanker < 22);
    }
}