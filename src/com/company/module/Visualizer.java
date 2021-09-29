package com.company.module;

import java.util.Map;

public class Visualizer {
    /**
     *
     */
    private static final String MENU_EXIT ="Возвращайтесь еще!\n /play - начать игру.\n/information - получить информацию о работе бота.";
    /**
     * Класс для описания сущности GameVisualizer.
     */

    private static final String MENU_HELP =
            """
                    Опции:
                      /play - начать игру.
                      /information - получить информацию о работе бота.
                    """;
    /**
     * Информация о работе бота.
     */
    private static final String INFORMATION = "Игровой бот Tote. Бот включает в себя игры: SpeedBaccara.\nЭтот бот помогает симуллировать игру в азартные игры, не тратя свои деньги!\n Напиши /play , чтобы начать игру";


    /**
     * Некорректный ввод ставки.
     */
    private static final String ERROR_BET = "В этой раздаче ставка не действительна!";

    /**
     * Приветсвие бота.
     */
    private static final String GREETING_BOT = "Вас приветствует бот Tote!\nНапиши команду /information чтобы узнать, что я могу!\nНапишите /play чтобы начать игру SpeedBaccara\n";

    /**
     * Приветсвие в игре.
     */
    private static final String GREETING_SPEED_BACCARA = "Добро пожаловать в игру Baccara - быстрая версия!";

    /**
     * Опции.
     */
    private static final String INSTRUCTION_SPEED_BACCARA = "Опции:\n/startGame - начать игру\n/instrumentation - инстуркция к игре\n/exit - выход";

    /**
     * Ставки и коэффиценты в игре.
     */
    private static final String RATE_ODDS = """

            Делайте Ваши ставки!
                1. Выиграет раздачу - Банкир: x2.00.
                2. Выиграет разадчу - Никто: x21.00.
                3. Выиграет раздачу - Игрок: x2.00.
                4. Будет натуральная победа - Банкир: x10.00.
                5. Будет натуральная победа - Игрок: x10.00.
                Для выхода напишите /exit
            Укажите суммы через пробел (Пример: 10 5 0 25 30)!
            """;
    /**
     * Инструкция к игре.
     */
    private static final String MANUAL = """
                Баккара — карточная игра, в которой игроки стремятся набрать как можно больше очков.
                В быстрой Баккаре используются только две карты.
                Цель игры — набрать комбинацию карт с общим числом очков 9 или как можно более близким к 9.
                Масти роли в игре не играют. Значения карт:
                A - 1 очко, K - 0 очков, Q - 0 очков, J - 0 очков, 10 - 0 очков.
                Остальные значения соотвествуют значениям карт.
                Если общая сумма равна 10 или более, из неё читается 10.
                Остаток учитывается при подсчетах результатов. Например: 7+6=13=3 или 4+6=10=0.
                Игрок или Банкир, набравший 9 очков, выигрывает, это называется «Натуральная победа».
                Игрок, набравший 8 очков, при условии, что противник набрал меньше, выигрывает.
                В остальных играх выигрывает то, кто окажется ближе к 9.
                Пользователь может сделать ставку на победу Игрока или Банкира, и/или Ничью.
                Также пользователь может поставить на исход натуральной победы Банкира и/или Игрока.
                За всю игру Банкир и Игрок получают по две карты.
                Коэффициенты ставок:
                1. Выиграет раздачу - Банкир: x2.00
                2. Выиграет разадчу - Никто: x21.00
                3. Выиграет раздачу - Игрок: x2.00
                4. Будет натуральная победа - Банкир: x10.00
                5. Будет натуральная победа - Игрок: x10.00
                В случае ничьи ставки на победу Игрока и Банкира возвращаются с коэфициентом x1.00.
                
                /startGame - начать игру
                /exit - выход
            """;

    /**
     * Метод для визуализации инструкции пользователю.
     */
    public static String getInstructionGreeting() {

        return GREETING_SPEED_BACCARA +"\n"+ INSTRUCTION_SPEED_BACCARA ;
    }

    /**
     * Метод для визуализации возможных ставок.
     **/
    public static String getBet() {
        System.out.print(RATE_ODDS);
        return RATE_ODDS;
    }

    /**
     * Метод для визуализации правил игры SpeedBaccara.
     */
    public static String getHowPlay() {
        return MANUAL;
    }

    /**
     * Метод для визуализации раздачи.
     */
    public static void getDistributionNumber(int numberGame) {
        System.out.println("\nРаздача №" + numberGame + ".");
    }

    /**
     * Метод для визуализации команды меню.
     */
    public static void getMenuCommand(Map<String, String> menuCommand, String command) {
        System.out.println(menuCommand.get(command));
    }

    /**
     * Метод для визуализации команды игры.
     */
    public static void getMenuGame(Map<String, String> gameCommand, String command) {
        System.out.println(gameCommand.get(command));
    }

    /**
     * Метод для визуализации команд бота.
     *
     * @return
     */
    public static String getHello() {
        return GREETING_BOT;
    }

    /**
     * Метод для визуализации ошибок раздачи.
     */
    public static void getDistributionError() {
        System.out.println(ERROR_BET);
    }

    /**
     * Метод для визуализации сущностей рука Банкира и рука Игрока.
     *
     * @param handBanker рука Банкира
     * @param handPlayer рука Игрока
     */
    public static void getDistributionHands(CardHand handBanker, CardHand handPlayer) {
        System.out.print("Banker: " + handBanker.get(0).valueCards + handBanker.get(0).suit + " " + handBanker.get(1).valueCards + handBanker.get(1).suit + " | " + handPlayer.get(0).valueCards + handPlayer.get(0).suit + " " + handPlayer.get(1).valueCards + handPlayer.get(1).suit + " :Player\n");
    }



    /**
     * Метод для визуализации информации о работе бота.
     */
    public static String getInformation() {
        return INFORMATION;
    }

    /**
     * Метод для визуализации опций команд авторизации.
     *
     * @return
     */
    public static String getMenuHelp() {
        return MENU_HELP;
    }

    /**
     *
     * @return
     */
    public static String getMenuExit(){
        return MENU_EXIT;
    }
}
