package ua.com.webcamp.javaStarter.lesson07;

/**
 * Created by WebCamp on 11.07.2015.
 */
public class C06_Methods {
    // Методы, которые возвращают логическое значение, называют методами-предикатами.

    static boolean and(boolean a, boolean b) {
        return a && b;
    }

    public static void main(String[] args) {
        boolean operand1 = true, operand2 = true;

        boolean result = and(operand1, operand2);

        System.out.println(operand1 + " && " + operand2 + " = " + result);
    }
}
