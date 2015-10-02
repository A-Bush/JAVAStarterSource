package ua.com.webcamp.javaStarter.lesson08;

/**
 * Created by WebCamp on 11.07.2015.
 */
public class C09_MethodsFactorial {
    // Нахождение факториала числа.
    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        int factorial = factorial(4);

        System.out.println(factorial);

    }
}
