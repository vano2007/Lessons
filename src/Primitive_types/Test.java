package Primitive_types;

public class Test {
    public static void main(String[] args) {
        /*
        byte z=123; //от -128 до 127
        short y=123; //16бит или 2 байта
        int x=123; //32 бита или 4 байта
        long l=123; // 64 бита или 8 байт
        float a=12.3f; // 32 бита или 4 байта
        double d=12.3; // 64 бита или 8 байт

        float x=12.3F; // все вещественные числа в Java по умолчанию типа double
        long y=123123123123L; // все целые числа в Java по умолчанию типа integer

        int a=123;
        long l=a; // привидение типов неявное, любое число int поместится в long
        int i = (int)l; // в этом случае, явное (приходится указывать какое конкретное число),
                 // и поэтому из long в int мы не можем привести (не любое число long поместится в память int)
        System.out.println(i);

        int a=123; // все целые числа могут быть представлены в вещественном виде, но сделать наоборот мы не можем
        double x=a; //int меньше double, поэтому оно поместится в него
        System.out.println(x);

        double y=123.5;
        int b=(int)y;
        System.out.println(b); // вывод числа int на экран без вещественной части числа double

        long l=Math.round(y); // округление числа double
        System.out.println(l);
        */
        byte x = (byte) 128; // это число больше чем byte, но мы можем присвоить "x" это число, но вот что с этим числом произойдет
        System.out.println(x); // мы превысили максимальный порог, которое может вместить число byte


    }
}
