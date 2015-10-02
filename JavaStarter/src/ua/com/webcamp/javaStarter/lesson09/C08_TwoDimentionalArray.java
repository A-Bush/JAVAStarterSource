package ua.com.webcamp.javaStarter.lesson09;

/**
 * Created by WebCamp on 11.07.2015.
 */
public class C08_TwoDimentionalArray {
    // Массивы состоящие из одного элемента.

    public static void main(String[] args) {
        int[] vector = new int[1];
        vector[0] = 100;
        System.out.println(vector[0]);


        int[][] matrix = new int[1][1];
        matrix[0][0] = 200;
        System.out.println(matrix[0][0]);
    }
}
