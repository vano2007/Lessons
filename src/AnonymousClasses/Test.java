package AnonymousClasses;

class Animal{
    public void eat(){
        System.out.println("Animal is eating...");
    }
}
/*
class OtherAnimal extends Animal{ // можно переопределить метод и вызвать его в объекте otherAnimal, но что если этот метод мне нужно использовать один раз
    public void eat(){
        System.out.println("Other Animal is eating...");
    }
}
*/

interface AbleToEat{
    public void eat();
}
/*
class Animal1 implements AbleToEat{

    @Override
    public void eat() {
        System.out.println("Animal1 is eating...");
    }
}
*/
public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
     // OtherAnimal otherAnimal = new OtherAnimal();   // Это нужно для созданного нового класса, наследования и переопределения метода, то что сверху создавал
     // otherAnimal.eat();
         Animal animal2 = new Animal(){   // можно в этом объекте переопределить метод "eat", не создавая для этого целый класс, наследоваться и т.д
          public void eat(){              // то есть эта запись тоже самое что создавать класс и наследоваться, но только для одного метода переопределить
              System.out.println("Other Animal is eating...");
          }
         };
         animal2.eat();
      //  AbleToEat ableToEat = new Animal1(); // Это нужно для переопределения метода "eat" через создание интерфейса и класса Animal1, а что если опять надо использовать один раз
      //  ableToEat.eat();

        AbleToEat ableToEat = new AbleToEat() {    //создали объект ableToEat на один раз, для одного использования, для переопределения одного метода
            @Override
            public void eat() {
                System.out.println("AbleToEat is eating...");  //переопределенный метод на один раз
            }
        };
        ableToEat.eat();
    }
}
