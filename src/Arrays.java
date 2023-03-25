public class Arrays {
    public static void main(String[] args) {
        /*int number = 10; // это примитивный тип данных
        char character = 'a';
        String s = "Hello!"; // облегченный способ создания объект класса String, он полностью равен нижнему - это ссылочный тип данных
        String s1 = new String("Hello!"); // стандартный способ создания объект класса String

        int number = 10; // это коробка в которой лежит целочисленное число 10 , [10] - это примитивный тип данных
        int[] numbers = new int[5];// а здесь есть переменная 'numbers' , которая ссылается на новый объект [массив] из 5 ячеек - это ссылочный тип данных
        System.out.println(numbers[1]); // в массиве отчет идет с нуля и в нем пять ячеек 0,1,2,3,4  до четырех, хотя индекс массива 5

        // инициализируем массив, можно каждую ячейку, а можно циклом for

        numbers[0]=10;
        numbers[1]=20;
        numbers[2]=30;
        numbers[3]=40;
        numbers[4]=50;

        // ещё можно, если мы заранее знаем какие будут числа в массиве задать его так
        int[] numbers = {12,35,21,20};*/

        // а можно циклом 'for'

        int[] numbers = new int[5];

        for (int i=0; i<numbers.length ; i++){
            numbers[i] = i*10+10;
            System.out.println(numbers[i]);
        }
        System.out.println(); // пустая строка между выводом на экран двух массивов
        int[] numbers1 = {12,35,21,20};
        for (int i=0 ; i< numbers1.length; i++){
            System.out.println(numbers1[i]);
        }

    }
}
