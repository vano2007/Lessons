package Primitive_types;

public class Wrapper {
    public static void main(String[] args) {
        int x=1;
        System.out.println(x);
        //Integer x2 = new Integer(123); Java сама упаковывает в класс, следующей записью
        Integer x3 = 123;
        System.out.println(x3);
        int y = x3; // это мы класс распаковали и теперь он является обычным примитивом

        Boolean.getBoolean("True");

        //Классы Double, Float, Long, Integer, Short, Byte, Character, Boolen и у каждого из них есть соответствующий примитивный тип данных

    }
}
