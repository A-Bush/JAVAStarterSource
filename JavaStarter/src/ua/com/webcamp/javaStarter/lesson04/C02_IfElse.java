package ua.com.webcamp.javaStarter.lesson04;

/**
 * Created by WebCamp on 02.07.2015.
 */
public class C02_IfElse {
    public static void main(String[] args) {
        int a = 1, b = 2;

        if (a < b) { // Если условие удовлетворяет истинности, выполняем тело блока if.

            System.out.println("a < b");               // Ветвь 1

        } else {       // Иначе, выполняем тело блока else.

            System.out.println("a не меньше b");       // Ветвь 2
        }
    }
}
