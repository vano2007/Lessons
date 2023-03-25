import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введи 5"); // это с помощью цикла while, но повторяется код внутри цикла и вне его - это не правильно...
        int value = scanner.nextInt();
        while (value!=5){
            System.out.println("Введи 5");
            value = scanner.nextInt();
        }
        System.out.println("Вы ввели 5");*/
        // сделаем код проще, который будет выполнять тоже самое.

        Scanner scanner = new Scanner(System.in);
        int value;
        do {
            System.out.println("Введи 5");
            value = scanner.nextInt();
        } while(value!=5);
        System.out.println("Вы ввели 5");

    }
}

