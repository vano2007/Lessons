package Equals;

public class Test1 {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "Hello";
        // но если мы создадим строки с другим синтаксисом, создавая строки как объекты, то такое сравнение не сработает
        String string3 = new String("Hello!");
        String string4 = new String("Hello!");

        System.out.println(string1.equals(string2));// строки в Java сравнивать можно и так и так в отличии от объектов, хотя они тоже как и объекты имеют ссылочную запись
        System.out.println(string1==string2); // Просто в Java есть String Pool, то есть две разные ссылки (string1 и string2) указывают на один и тот же объект {"Hello"}

        System.out.println(string3.equals(string4));
        System.out.println(string3==string4);// такая запись сравнения не сработала
    }
}

