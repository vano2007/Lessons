package NestedClasses;

public class Electrocar {
    private int id;
    private static int test;

    // не статический вложенный класс, его нельзя использовать извне
    private class Motor{//он относится к объекту Electrocar (он входит в состав Electrocar и поэтому он приватный) и имеет доступ к нестатическим полям этого объекта
        public void startMotor(){
            System.out.println("Motor " + id + " is starting...");
        }
    }
    // статический вложенный класс, его можно использовать во вне класса Electrocar
    public static class Battery{//не имеет доступ к не статическим полям объекта Electrocar, но имеет доступ к статическим полям объекта
        public void charge(){
            System.out.println("Battery" + test + " is charging...");
        }

    }

    public Electrocar(int id){
        this.id = id;
    }
    public void start(){
        Motor motor = new Motor();
        motor.startMotor();

        final int x = 5;
        // вложенные классы в методе, имеет доступ к нестатическим полям класса Electrocar и к полям метода start, если они константы
        class SomeClass{
            public void someMetod(){
                System.out.println(x);
                System.out.println(id);

            }
        }

        System.out.println("Electrocar " + id + " starting...");
    }
}
