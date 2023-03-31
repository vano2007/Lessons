package Douncasting_Upcasting;

public class Test {
    public static void main(String[] args) {
        /*
        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.eat();// один метод
        dog.eat();
        dog.bark();//два метода

        // Upcasting - восходящее преобразование, потому что объект Dog мы рассматриваем как его родителя Animal(Dog наследуется от Animal)
        Animal animal = new Dog();
        animal.eat();
        //это же, но более понятно, разжевано будет выглядеть так
        Dog dog1 = new Dog();
        // строчка внизу и есть восходящее преобразование
        Animal animal1 = dog1;
        animal1.eat();

        // Douncasting - нисходящее преобразование, от родителя Animal к потомку Dog
        Dog dog2 = (Dog) animal;
        dog2.eat();
        dog2.bark();
        */
        // моделирование ошибки при Douncasting, подтверждение того, что этот процесс не безопасен

        Animal a = new Animal();
        Dog dog = (Dog) a;
        dog.bark();// в этой переменной нет этого метода, т.к. "а" класса Animal и он приравнен классу Dog, но ошибка не указывается в Java



    }

}
