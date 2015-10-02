package ua.com.webcamp.javaStarter.lesson07;

/**
 * Created by WebCamp on 11.07.2015.
 */
public class C01_Methods {
    // Методы (Процедуры).

    // На 12-й строке, создаем метод с именем Procedure, который ничего не принимает и ничего не возвращает.
    // В теле метода, на 14-й строке выводим на экран строку - Hello!

    static void procedure() {
        System.out.println("Hello!");
    }

    public static void main(String[] args) {

        // В теле метода Main на 21-й строке, вызываем метод Procedure.

        procedure();

    }
}
