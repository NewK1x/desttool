package main;

public enum MenuOption {
    SLOT1("                                                          \u001B[38;2;255;89;89m[1] - Поиск                   :       [6] - Спам атака"),
    SLOT2("                                                          \u001B[38;2;255;89;89m[2] - Инструменты (OSINT)     :       [7] - IP logger "),
    SLOT3("                                                          \u001B[38;2;255;89;89m[3] - Чекеры                  :       [8] - Проверить Обновления"),
    SLOT4("                                                          \u001B[38;2;255;89;89m[4] - Логи                    :       [9] - Proxy"),
    SLOT5("                                                          \u001B[38;2;255;89;89m[5] - Добавить Скрипт         :       [10] - Полезные инструменты\u001B[0m");
                              
    private final String displayText;

    MenuOption(String displayText){
        this.displayText = displayText;
    }

    public String getDisplayText(){
        return displayText;
    }
}
