package ua.com.webcamp.javaStarter.lesson06;

/**
 * Created by WebCamp on 08.07.2015.
 */
public class C01_While {
    // Циклическая конструкция - while.
    public static void main(String[] args) {
        int counter = 0;

        while (counter < 3) {
            counter++;
            System.out.println("Counter " + counter);
        }

        System.out.println("Произведено " + counter + " итераций.");
    }
}
