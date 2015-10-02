package ua.com.webcamp.javaStarter.lesson07;
import java.util.Scanner;

/**
 * Created by WebCamp on 11.07.2015.
 */
public class C09_Methods {
    // Параметр, передаваемый по значению, уничтожается при возврате значения методом

    static void addTwo(int a) {
        a = a + 2;
        System.out.println("Значение int a = " + a);
    }

    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner in = new Scanner(System.in);

        // Принимаем ввод от пользователя и преобразуем его в целочисленное значение

        String number = in.next();
        int result = Integer.parseInt(number);

        System.out.println("Значение result = " + result);

        // В качестве аргумента передается не сама переменная - result, а её копия.
        addTwo(result);
        System.out.println("Значение result = " + result);
    }
}
