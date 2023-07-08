import java.util.Arrays;

public class Task1_3_1_3 {
    public static void main(String[] args) {
        System.out.println("Задание: \n3.\tСоздайте классы для описания языков программирования " +
                "(типизации, версии, массив ключевых слов..)\n\nРешение: ");

        System.out.println("Создаем класс Типизация (Typing).");
        Typing javaTyping = new Typing();
        javaTyping.javaTyping1 = "Жесткая";
        javaTyping.javaTyping2 = "Статическая";
        javaTyping.javaTyping3 = "Динамическая";

        Typing pytonTyping = new Typing();
        pytonTyping.pythonTyping1 = "Динамическая";
        pytonTyping.pythonTyping2 = "Неявная";
        pytonTyping.pythonTyping3 = "Строгая";

        Typing visualBasicTyping = new Typing();
        visualBasicTyping.visualBasicTyping1 = "Явная";
        visualBasicTyping.visualBasicTyping2 = "Неявная";
        visualBasicTyping.visualBasicTyping3 = "Строгая";

        System.out.print("Варианты типизации в Java: " + javaTyping.javaTyping1 + ", " + javaTyping.javaTyping2 +
                ", " + javaTyping.javaTyping3 + "\n" +
                "Варианты типизации в Python: " + pytonTyping.pythonTyping1 + ", " + pytonTyping.pythonTyping2 +
                ", " + pytonTyping.pythonTyping3 + "\n" +
                "Варианты типизации в Visual Basic: " + visualBasicTyping.visualBasicTyping1 + ", " + visualBasicTyping.visualBasicTyping2 +
                ", " + visualBasicTyping.visualBasicTyping3);
        System.out.println("\n"); //  перенос строки

        System.out.println("Создаем класс Версии (Versions).");
        Versions javaVersion = new Versions();
        javaVersion.javaVersion1 = "Java SE 7";
        javaVersion.javaVersion2 = "Java SE 8";
        javaVersion.javaVersion3 = "Java SE 9";

        Versions pythonVersion = new Versions();
        pythonVersion.pythonVersion1 = "Python 2";
        pythonVersion.pythonVersion2 = "Python 3";

        Versions visualBasicVersion = new Versions();
        visualBasicVersion.visualBasicVersion1 = "VBA";
        visualBasicVersion.visualBasicVersion2 = "VBScript";
        visualBasicVersion.visualBasicVersion3 = "Visual Basic .NET";

        System.out.print("Версии Java: " + javaVersion.javaVersion1 + ", " + javaVersion.javaVersion2 +
                ", " + javaVersion.javaVersion3 + "\n" +
                "Версии Python: " + pythonVersion.pythonVersion1 + ", " + pythonVersion.pythonVersion2 + "\n" +
                "Версии Visual Basic: " + visualBasicVersion.visualBasicVersion1 + ", " + visualBasicVersion.visualBasicVersion2 +
                ", " + visualBasicVersion.visualBasicVersion3);
        System.out.println("\n"); //  перенос строки

        System.out.println("Создаем класс для ключевых слов (KeyWords) с переменными и массивом.");
        KeyWords keyWords1 = new KeyWords();
        keyWords1.javaWord1 = "class";
        keyWords1.javaWord2 = "int";
        keyWords1.javaWord3 = "return";

        KeyWords keyWords2 = new KeyWords();
        keyWords2.pythonWord1 = "global";
        keyWords2.pythonWord2 = "pass";
        keyWords2.pythonWord3 = "elif";

        KeyWords keyWords3 = new KeyWords();
        keyWords3.visualBasic1 = "Get";
        keyWords3.visualBasic2 = "Next";
        keyWords3.visualBasic3 = "ParamArray";

        KeyWords keyWords4 = new KeyWords();
        KeyWords keyWords5 = new KeyWords();
        KeyWords keyWords6 = new KeyWords();
        keyWords4.array = new String[]{keyWords1.javaWord1, keyWords1.javaWord2, keyWords1.javaWord3};
        keyWords5.array = new String[]{keyWords2.pythonWord1, keyWords2.pythonWord2, keyWords2.pythonWord3};
        keyWords6.array = new String[]{keyWords3.visualBasic1, keyWords3.visualBasic2, keyWords3.visualBasic3};
        System.out.println("Печатаем элементы массивов ключевых слов:");
        System.out.print("Ключевые слова для Java: " + Arrays.toString(keyWords4.array) + "\n" +
                "Ключевые слова для Python: " + Arrays.toString(keyWords5.array) + "\n" +
                "Ключевые слова для Visual Basic: " + Arrays.toString(keyWords6.array));
        System.out.println(); //  перенос строки

    }
}