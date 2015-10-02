package ua.com.webcamp.javaStarter.lesson07;

/**
 * Created by WebCamp on 11.07.2015.
 */
public class C02_Methods {
    // Методы (Функции).

    // На 12-й строке, создаем метод с именем function, который ничего не принимает и возвращает строковое значение.
    // В теле метода, используя ключевое слово return, возвращаем строку - Hello!

    static String function() {
        return "Hello!";
    }

    public static void main(String[] args) {

        // В теле метода Main на 22-й строке, создаем строковую локальную переменную с именем string
        // и присваиваем ей возвращаемое значение метода function.

        String string = function();
        System.out.println(string);
    }
}
