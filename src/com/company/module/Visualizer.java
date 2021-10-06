package com.company.module;


/**
 * Класс для описания сущности Visualizer.
 */
public class Visualizer {

    /**
     * Прощание бота.
     */
    private static final String MENU_EXIT = "Возвращайтесь еще!\n /play - начать игру.\n/information - получить информацию о работе бота.";

    /**
     * Вспомогательное меню пользователя.
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
    private static final String GREETING_MAGICK_NUMBER = "Добро пожаловать в игру Magick Number!";

    /**
     * Опции.
     */
    private static final String INSTRUCTION_MAGICK_NUMBER = "Опции:\n/startGame - начать игру\n/instrumentation - инстуркция к игре\n/exit - выход";


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
                Угадываешь - получаешь в 2 раза больше!
                Не угадываешь - теряешь ставку :(!
                
                /startGame - начать игру
                /exit - выход
            """;

    /**
     * Метод для визуализации инструкции пользователю.
     *
     * @return Привествие и инструкция к игре.
     */
    public static String getInstructionGreeting() {

        return GREETING_MAGICK_NUMBER + "\n" + INSTRUCTION_MAGICK_NUMBER;
    }


    /**
     * Метод для визуализации правил игры MagickNumber
     *
     * @return Инструкция по общему функционалу и ставкам.
     */
    public static String getHowPlay() {
        return MANUAL;
    }


    /**
     * Метод для визуализации команд бота.
     *
     * @return Приветствие игры.
     */
    public static String getHello() {
        return GREETING_BOT;
    }


    /**
     * Метод для визуализации информации о работе бота.
     *
     * @return Информация о боте.
     */
    public static String getInformation() {
        return INFORMATION;
    }

    /**
     * Метод для визуализации опций команд.
     *
     * @return Вспомогательное меню.
     */
    public static String getMenuHelp() {
        return MENU_HELP;
    }

    /**
     * Метод для визуализации выхода игры.
     *
     * @return Информация о выходе из игры.
     */
    public static String getMenuExit() {
        return MENU_EXIT;
    }
}
