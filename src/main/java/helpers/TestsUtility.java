package helpers;

/**
 * Класс, в котором описаны хелперы для тестов.
 */
public class TestsUtility {

    // Ожидания.
    public static final long TIMEOUT_LARGE_SEC = 30; // Ожидание увеличенное. (секунды)
    public static final long TIMEOUT_LARGE_MS = 30000; // Ожидание увеличенное. (миллисекунды)
    public static final long TIMEOUT_DEFAULT_SEC = 15; // Ожидание стандартное. (секунды)
    public static final long TIMEOUT_SHORT_SEC = 5; // Ожидание короткое. (секунды)
    public static final long TIMEOUT_EXIST_METHODS_MS = 2500; // Ожидание для boolean проверок 'Существует или нет'. (миллисекунды)

    // Скроллы.
    public static final long SPEED_SCROLL_FAST_MS = 500; // Скорость быстрого скролла. (количество миллисекунд с момента начала и до окончания скролла)
    public static final long COUNT_SCROLL_DEFAULT = 10; // Количество повторений скролла.
}
