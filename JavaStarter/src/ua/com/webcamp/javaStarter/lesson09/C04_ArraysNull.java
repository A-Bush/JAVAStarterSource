package ua.com.webcamp.javaStarter.lesson09;

/**
 * Created by WebCamp on 11.07.2015.
 */
public class C04_ArraysNull {
    // Массивы (одномерный массив).
    public static void main(String[] args) {
        int[] array = new int[5];

        // Вывод на экран значений элементов массива.
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
