package com.company.module;


/**
 * Класс для описания сущности Visualizer.
 */
public class Visualizer {


    /**
     * Ошибочная ставка.Большое количество шагов.
     */
    private static final String ERROR_STEPS_MORE = "С 10> и я могу! Измени ставку на 10<!";

    /**
     * Ошибочная ставка. Количество шагов <0.
     */
    private static final String ERROR_STEPS_NO_MORE = "Какая интересная ставка...! Напиши положительное число!";

    /**
     * Создание ставки.
     */
    private static final String DO_TOTE = "Делай свою ставку и я загадываю число!\nВаша ставка?";

    /**
     * Ошибочная ставка. Не хватает денег из банка.
     */
    private static final String ERROR_TOTE_MORE = "У вас нет такой суммы! Измените ставку!";

    /**
     * Отрицательная ставка.
     */
    private static final String ERROR_TOTE_NO_MORE = "Ставка не может быть отрицательной! Измените ставку!";

    /**
     * Ставки сделаны корректно. Начало игры.
     */
    private static final String GOOD_TOTE_START_GAME = "Ставки сделаны, число загадано! Назови число!";

    /**
     * Проигрыш.
     */
    private static final String LOSER = "Вы проиграли! Повезет в следующий раз)\n/help\nЗагаданное число: ";

    /**
     * Слишком большое число.
     */
    private static final String MORE = "Много\nОсталось попыток: ";

    /**
     * Маленькое число.
     */
    private static final String NO_MORE = "Мало\nОсталось попыток: ";

    /**
     * Выигрыш.
     */
    private static final String WIN = "Победа,Спасибо за игру!Возвращайтесь еще.\n/help\nВаш Банк: ";

    /**
     * Начало игры. Пробная ставка.
     */
    private static final String TRY_CREATE = "Ставки сделаны! Ну,что же ,начнем!\nПопробуй угадать число!";

    /**
     * Начало  игры.
     */
    private static final String GAME_START = "Ну что? Поехали!\nС какого раза сможете угадать число?\nВаш Банк: ";

    /**
     * Выход из игры.
     */
    private static final String GAME_EXIT = "\nДля выхода:/exit";

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

    /**
     * Геттер для выхода из игры.
     *
     * @return Выход из игры.
     */
    public static String getGameExit() {
        return GAME_EXIT;
    }

    /**
     * Геттер начала игры.
     *
     * @return Начало игры.
     */
    public static String getGameStart() {
        return GAME_START;
    }

    /**
     * Геттер для доступа к информации о большом количсетве шагов.
     *
     * @return Слишком большое количество шагов.
     */
    public static String getErrorStepsMore() {
        return ERROR_STEPS_MORE;
    }

    /**
     * Геттер для доступа к информации об не положительном количестве шагов.
     *
     * @return Не положительное количество шагов для отгадования.
     */
    public static String getErrorStepsNoMore() {
        return ERROR_STEPS_NO_MORE;
    }

    /**
     * Геттер для визуализзации Ставки.
     *
     * @return Ставка пользователя.
     */
    public static String getDoTote() {
        return DO_TOTE;
    }

    /**
     * Геттер для визуализации слишком большой ставки.
     *
     * @return Информация о превышенной ставке.
     */
    public static String getErrorToteMore() {
        return ERROR_TOTE_MORE;
    }

    /**
     * Геттер для визуализации отрицательной ставки.
     *
     * @return Информация о невозможности потсавить ставку.
     */
    public static String getErrorToteNoMore() {
        return ERROR_TOTE_NO_MORE;
    }

    /**
     * Геттер для визуализации начала игры.
     *
     * @return Сообщение об успешном начале игры.
     */
    public static String getGoodToteStartGame() {
        return GOOD_TOTE_START_GAME;
    }

    /**
     * Геттер для визуализации проигрыша.
     *
     * @return Информация о проигрыше.
     */
    public static String getLOSER() {
        return LOSER;
    }

    /**
     * Геттер для визуализации слишком большого числа.
     *
     * @return Сообщение о слишком большом числе.
     */
    public static String getMORE() {
        return MORE;
    }

    /**
     * Геттер для визуализации слишком малого числа.
     *
     * @return Сообщение о слишком малом числе.
     */
    public static String getNoMore() {
        return NO_MORE;
    }

    /**
     * Геттер для визуализации победы.
     *
     * @return Сообщение о выигрыше.
     */
    public static String getWIN() {
        return WIN;
    }

    /**
     * Геттер для визуализации пробной ставки.
     *
     * @return Сообщение о пробной ставке.
     */
    public static String getTryCreate() {
        return TRY_CREATE;
    }
}
