package com.javarush.cryptanalyzer.sharafutdinov.constants;

public class ConstantsForTheDialog {
    public static final String THE_TEXT_IS_ENCRYPTED = "Ваш текст зашифрован и находится в файле encoded.txt";
    public static final String IOEXCEPTION = "Что то пошло не так, проверьте существует ли файл ";
    public static final String THE_TEXT_IS_DECODED_BY_DEFAULT = "Ваш текст расшифрован и находится в файле output.txt";
    public static final String THE_TEXT_IS_DECODED = "Ваш текст расшифрован и находится в файле согласно указанному Вами пути: ";
    public static final String CHOOSING_AN_ENCRYPTION_KEY = "Введите ключ (от 0 до 84) или нажмите Enter для рандомной генерирования ключа ";
    public static final String YOUR_KEY = "Ваш ключ: ";
    public static final String FILE_SELECTION_FOR_ENCODED = "Укажите путь к файлу (в формате *.txt) с текстом, который необходимо зашифровать или нажмите Enter для выбора файла по умолчанию ";
    public static final String ATTENTION = "ВНИМАНИЕ! НЕ ЗАБУДЬТЕ ЗАПИСАТЬ ВАШ КЛЮЧ!";
    public static final String FILE_SELECTION_FOR_DECODED = "Укажите путь к файлу (в формате *.txt), куда необходимо расшифровать зашифрованный текст или нажмите Enter для выбора файла по умолчанию ";
    public static final String ENTERING_THE_KEY = "Введите Ваш ключ: ";
    public static final String WRONG_CHOICE = "Введены неправильный номер режима работы!";
    public static final String INCORRECT_FORMAT = "Введен неправильный формат номера выбора режима работы!";
    public static final String HACKING_DEFAULT_BRUTE_FORCE = "Ваш текст взломан методом BruteForce и находится в файле output.txt. ";
    public static final String HACKING_BRUTE_FORCE = "Ваш текст взломан методом BruteForce и находится в файле согласно указанному Вами пути: ";
    public static final String THE_TEXT_IS_DECODED_YES_OR_NO = "\nДанный текст похож на расшифрованный?\nЕсли Нет, введите \"N\". Если Да, введите \"Y\"\n";
    public static final String START_THE_PROGRAM = "Здравствуйте, это программа предназначена для шифрования, расшифровки и взлома шифра Цезаря.\n" +
            "1. Зашифровать текст в файле\n2. Расшифровать текст в файле с помощью ключа\n3. Расшифровать текст с помощью \"Грубой силы\"\n" +
            "Введите 1, 2 и 3 для выбора действия и нажмите Enter\n";
}
