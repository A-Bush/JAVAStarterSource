package ua.com.webcamp.javaStarter.lesson07;

/**
 * Created by WebCamp on 11.07.2015.
 */
public class C04_Methods {

    // На 13-й строке, создаем метод с именем function, который принимает один строковой аргумент и возвращает строковое значение.
    // В теле метода, строковой локальной переменной sentence, присваиваем конкатенацию строк и аргумента,
    // используя ключевое слово return, возвращаем значение переменной sentence.


    static String function(String name) {
        String sentence = "Hello " + name + "!";
        return sentence;
    }

    public static void main(String[] args) {

        // В теле метода Main на 25-й строке, создаем строковую локальную переменную с именем sentence,
        // присваиваем ей возвращаемое значение метода function, которому в качестве аргумента передаем строку - Onotole.

        String sentence = function("Onotole");
        System.out.println(sentence);
    }
}
