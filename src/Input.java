import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        String s = "string"; // класс String, а у него конкретный объект "s" с данными.
        String st = new String("new string"); // коасс String, у которого создан новый объект String с данными,
                                                     // а переменная "st" ссылается на новый объект new String.
        Scanner scan = new Scanner(System.in); // класс Scanner, его объект новый new Scanner и у него
                                               // стандартный поток входных данных (System.in)
        System.out.println("Введите что-нибудь");
        String string = scan.nextLine(); // сканирует, что мы вводим в следующей строке, строка (не число).
                                         // ссылается на объект scan класса Scanner.
        System.out.println("Вы ввели "+string);
        System.out.println("Введите какое-нибудь число");
        int x = scan.nextInt(); // а здесь сканирует вводимое нами число, ссылаясь на объект scan класса Scanner
        System.out.println("Вы ввели "+x);
     }
}
