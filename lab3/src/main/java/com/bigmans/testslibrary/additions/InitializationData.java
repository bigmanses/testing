package com.bigmans.testslibrary.additions;

/**
 * Вспомогательный класс для тестирования
 * @author mismailov
 */
public class InitializationData {
    /** Главнfя страница библиотеки Военмеха */
    private final String url1 = "http://library.voenmeh.ru/";
    /** Страница библиотеки Военмеха с открой вкладкой - Катаог учебной литераты */
    private final String url2 = "http://library.voenmeh.ru/jirbis2/index.php?option=com_irbis&view=irbis&Itemid=456";
    /** Логин пользователя */
    private final String lastName = "Исмаилов";
    /** Пароль пользователя */
    private final String password = "022736";
    /** Автор книги, которую мы ищем */
    private final String searchBook = "ФАЙНШМИДТ, В. Л.";
    /** Сообщение при успешном выполнении всех действий в тесте 1 */
    private final String checkTextTest1 = "Авторизован Исмаилов Мансур Рахымжанович";
    /** Сообщение при успешном выполнении всех действий в тесте 2 */
    private final String checkTextTest2 = "Найдено документов:21; Показаны документы с 1 по 10.\nЗапрос: ";

    public String getUrl1() {
        return url1;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getSearchBook() {
        return searchBook;
    }

    public String getUrl2() {
        return url2;
    }

    public String getCheckTextTest1() {
        return checkTextTest1;
    }

    public String getCheckTextTest2() {
        return checkTextTest2;
    }
}
