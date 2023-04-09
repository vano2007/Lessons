package Exceptions;

public class Exceptions3 {
    public static void main(String[] args) {
        //Checked Exception (Compile Time Exception) - Проверенные исключения, исключения которые возникают во время компиляции. = исключительный случай в работе программы
        //Unchecked Exception (Runtime Exceptions) - это исключения, которые возникают во время выполнения программы. = ошибка в работе программы, их надо устранять
        // популярные ошибки в программе следующие
        /*
        int a = 1/0; - деление на ноль

        String name = null;
        name.length(); вызвать метод на "ничто" невозможно
        */
        int[] arr = new int[2];
        System.out.println(arr[2]);
    }
}
