import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст");
        //int age = scanner.nextInt();
        /*if (age==10){
            System.out.println("Ты учишься в школе");
        } else if (age==18){
            System.out.println("Ты закончил школу");
        } else if(age==22){
            System.out.println("Ты закончил институт");// и т.д. можно написать кучу условий (их может быть 10, 100), а можно...
        }*/
        /*switch(age){
            case 1:
                System.out.println("Ты только родился");
                break;
            case 7:
                System.out.println("Ты пошел в школу");
                break;
            case 18:
                System.out.println("Ты закончил школу");
                break;
            default:
                System.out.println("Ни одно из предыдущих условий не подошло");// Это код для числовой переменной
        }*/
        String age = scanner.nextLine();
        switch (age){
            case "один":
                System.out.println("Ты только родился");
                break;
            case "семь":
                System.out.println("Ты пошел в школу");
                break;
            case "восемнадцать":
                System.out.println("Ты закончил школу");
                break;
            default:
                System.out.println("Ни одно из предыдущих условий не подошло"); // Это код для строковой переменной
        }


    }
}
