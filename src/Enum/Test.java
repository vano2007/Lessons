package Enum;

public class Test {

    /*private static final int DOG = 0;
    private static final int CAT = 1;
    private static final int FROG = 2;*/

    public static void main(String[] args) {
       Animal animal = Animal.CAT;
        System.out.println(animal);
//
//        switch (animal){
//            case CAT:
//                System.out.println("It's a cat");
//                break;
//            case DOG:
//                System.out.println("It's a dog");
//                break;
//        }

        Season season = Season.WINTER;
        System.out.println(season.getTemperature());

        // Object -> Enum -> Season
        System.out.println(season instanceof Enum);
        System.out.println(season. getClass());

        switch (season){
            case SUMMER:
                System.out.println("it's warm outside");
                break;
            case WINTER:
                System.out.println("it's cold outside");
                break;
        }


        /*int animal = DOG;

        switch (animal){
            case DOG:
                System.out.println("It's a dog");   такой код был до перечисления, до добавления в Java Enum
                break;
            case FROG:
                System.out.println("It's a frog");
                break;
            default:
                System.out.println("It's not an animal");
        }*/

    }
}
