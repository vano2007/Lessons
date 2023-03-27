package Polymorphism;

public class Test {
    public static void main(String[] args) {
        /*Animal animal = new Animal();
        Dog dog = new Dog();

        animal.eat();
        dog.eat();*/

        /*Animal animal = new Dog();
        animal.eat();
      //animal.bark(); - этого метода нет в объекте animal типа класса Animal в классе Dog, то есть мы наследуем только методы класса Animal
        //попросту, мы рассматриваем собаку, как животное
        Dog dog = new Dog();
        dog.eat();
        dog.bark(); //в этом же объекте мы имеем доступ к обоим методам
                    //рассматриваем собаку, как собаку*/
        /*Animal animal = new Dog();
        animal.eat();*/

        Animal animal =new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        test(animal);
        test(dog);
        test(cat);
    }
    public static void test(Animal animal){
        animal.eat();
    }
}
