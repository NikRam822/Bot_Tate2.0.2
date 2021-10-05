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
    private static final String INFORMATION = "Игровой бот Tote. Бот включает в себя игры: MagickNumber.\nЭтот бот поможет скоротать время и разнообразить досуг!\n Напиши /play , чтобы начать игру";



    /**
     * Приветсвие бота.
     */
    private static final String GREETING_BOT = "Вас приветствует бот Tote!\nНапиши команду /information чтобы узнать, что я могу!\nНапишите /play чтобы начать игру MagickNumber\n";

    /**
     * Приветсвие в игре.
     */
    private static final String GREETING_SPEED_BACCARA = "Добро пожаловать в игру Magick Number!";

    /**
     * Опции.
     */
    private static final String INSTRUCTION_SPEED_BACCARA = "Опции:\n/startGame - начать игру\n/instrumentation - инстуркция к игре\n/exit - выход";

    /**
     * Ставки и коэффиценты в игре.
     */
    private static final String RATE_ODDS = """

            Делайте Ваши ставки!
                1. Число будет угадано с 1-го раза x100.
                2. Число будет угадано со 2-го , или с 3-го раза x10.
                
                               Для выхода напишите /exit
            Укажите номер исхода и ставку  через пробел (Пример: 4 5000)!
            """;
    /**
     * Инструкция к игре.
     */
    private static final String MANUAL = """
                MagicNumber — Простая игра, для победы нужна лишь удача и везение! 
                Правила следующие:
                Я загадываю число - вы отгадываете.
                После каждого предположения я буду говорить горячо,или холодно.
                Ну что, сыграем ?
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
