package ua.com.webcamp.javaStarter.lesson08;

/**
 * Created by WebCamp on 11.07.2015.
 */
public class C07_MethodsBinaryDigit {
    // Вывод в двоичном формате числа, переданного в десятичном формате

    static void converter(int n) {
        int temp;

        temp = n % 2;

        if (n >= 2)
            converter(n / 2);

        System.out.print(temp);
    }

    public static void main(String[] args) {

        int n = 4;

        converter(n);

    }
}
