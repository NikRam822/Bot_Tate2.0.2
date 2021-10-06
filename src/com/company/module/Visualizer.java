package com.company.module;


/**
 * Класс для описания сущности Visualizer.
 */
public class Visualizer {

    /**
     * Отказ добавления банка.
     */
    public static final String NO_ADD_BANK="Банк поплняется только в том случае, если у вас 0 на счету.\n/help";

    /**
     * Добавление банка.
     */
    public static final String ADD_BANK="/help\nВаш банк тепрь составляет: ";

    /**
     * Банк пользователя.
     */
    public static final String GET_BANK="Ваш банк: ";

    /**
     * Ошибочная ставка.Большое количество шагов.
     */
    public static final String ERROR_STEPS_MORE = "С 10> и я могу! Измени ставку на 10<!";

    /**
     * Ошибочная ставка. Количество шагов <0.
     */
    public static final String ERROR_STEPS_NO_MORE = "Какая интересная ставка...! Напиши положительное число!";

    /**
     * Создание ставки.
     */
    public static final String DO_TOTE = "Делай свою ставку и я загадываю число!\nВаша ставка?";

    /**
     * Ошибочная ставка. Не хватает денег из банка.
     */
    public static final String ERROR_TOTE_MORE = "У вас нет такой суммы! Измените ставку!";

    /**
     * Отрицательная ставка.
     */
    public static final String ERROR_TOTE_NO_MORE = "Ставка не может быть отрицательной! Измените ставку!";

    /**
     * Ставки сделаны корректно. Начало игры.
     */
    public static final String GOOD_TOTE_START_GAME = "Ставки сделаны, число загадано! Назови число!";

    /**
     * Проигрыш.
     */
    public static final String LOSER = "/getBank\nВы проиграли! Повезет в следующий раз)\n/help\nЗагаданное число: ";

    /**
     * Слишком большое число.
     */
    public static final String MORE = "Много\nОсталось попыток: ";

    /**
     * Маленькое число.
     */
    public static final String NO_MORE = "Мало\nОсталось попыток: ";

    /**
     * Выигрыш.
     */
    public static final String WIN = "Победа,Спасибо за игру!Возвращайтесь еще.\n/help\nВаш Банк: ";

    /**
     * Начало игры. Пробная ставка.
     */
    public static final String TRY_CREATE = "Ставки сделаны! Ну,что же ,начнем!\nПопробуй угадать число!";

    /**
     * Начало  игры.
     */
    public static final String GAME_START = "Ну что? Поехали!\nС какого раза сможете угадать число?\nВаш Банк: ";

    /**
     * Выход из игры.
     */
    public static final String GAME_EXIT = "\nДля выхода:/exit";

    /**
     * Прощание бота.
     */
    public static final String MENU_EXIT = "Возвращайтесь еще!\n /play - начать игру.\n/information - получить информацию о работе бота.\n/addBank-пополнить банк\n/getBank - показать банк";

    /**
     * Вспомогательное меню пользователя.
     */
    public static final String MENU_HELP =
            """
                    Опции:
                      /getBank - посмотреть банк.
                      /addBank - пополнить банк.
                      /play - начать игру.
                      /information - получить информацию о работе бота.
                    """;

    /**
     * Информация о работе бота.
     */
    public static final String INFORMATION = "Игровой бот Tote. Бот включает в себя игры: MagickNumber.\nЭтот бот поможет скоротать время и разнообразить досуг!\n Напиши /play , чтобы начать игру";


    /**
     * Приветсвие бота.
     */
    public static final String GREETING_BOT = "Вас приветствует бот Tote!\nНапиши команду /information чтобы узнать, что я могу!\nНапишите /play чтобы начать игру MagickNumber\n";

    /**
     * Приветсвие в игре.
     */
    public static final String GREETING_MAGICK_NUMBER = "Добро пожаловать в игру Magick Number!\n";

    /**
     * Опции.
     */
    public static final String INSTRUCTION_MAGICK_NUMBER = "Опции:\n/startGame - начать игру\n/instrumentation - инстуркция к игре\n/exit - выход\n/addBank - пополнить банк\n/getBank - показать банк";


    /**
     * Инструкция к игре.
     */
    public static final String MANUAL = """
                MagicNumber — Простая игра, для победы нужна лишь удача и везение! 
                Правила следующие:
                Я загадываю число - вы отгадываете.
                После каждого предположения я буду говорить горячо,или холодно.
                Ну что, сыграем ?
                Коэффициенты ставок:
                Угадываешь - получаешь в 2 раза больше!
                Не угадываешь - теряешь ставку :(!
                /addBank - пополнить банк
                /getBank - показать банк
                /startGame - начать игру
                /exit - выход
            """;

}
