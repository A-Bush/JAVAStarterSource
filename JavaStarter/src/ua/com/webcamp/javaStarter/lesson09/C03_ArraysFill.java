package ua.com.webcamp.javaStarter.lesson09;

/**
 * Created by WebCamp on 11.07.2015.
 */
public class C03_ArraysFill {
    // Массивы (одномерный массив).

    public static void main(String[] args) {
        // На 13 строке создаем массив целочисленных элементов с именем array
        // и заполняем его значениями 1,2,3,4,5

        int[] array = new int[]{ 1, 2, 3, 4, 5 };

        // Вывод на экран значений элементов массива.
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
