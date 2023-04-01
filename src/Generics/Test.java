package Generics;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // так было до Java5
        List animals = new ArrayList();
        Animal ourAnimal = new Animal();
        animals.add("cat");// 0
        animals.add("dog");// 1
        animals.add("frog");// 2
        animals.add(ourAnimal); //не можем положить объект, т.к позже указали что должен лежать String


        String animal = (String) animals.get(2);
        System.out.println(animal);

        // так стало с появлением Genericов
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");
        //animals2.add(ourAnimal);  сразу обозначается ошибка, не можем положить объект, если указали что будет лежать String


        String animal2 = animals2.get(1);
        System.out.println(animal2);

        // так стало с появлением Java7
        List animals3 = new ArrayList<>(); // Этой записи достаточно

    }
}
class Animal{

}
