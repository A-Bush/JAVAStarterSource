package ua.com.webcamp.javaStarter.lesson04;

/**
 * Created by WebCamp on 02.07.2015.
 */
public class C01_If {
    public static void main(String[] args) {
        int a = 1, b = 2; // создаем две целочисленные переменные

        // На 15-й строке создаем условную конструкцию if, в условии которой проверяем: a меньше b

        if (a < b) {     // Если условие удовлетворяет истинности, выполняем тело условной конструкции.
            System.out.println("a < b");     // Ветвь 1
        }
    }
}
