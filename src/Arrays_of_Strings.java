public class Arrays_of_Strings {
    public static void main(String[] args) {
        /*int[] numbers = new int[5]; // Числовой массив
        numbers[0] = 10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        System.out.println();// пустая строка
        String [] strings = new String[3]; // Строковый массив класса String. Переменная strings ссылается на 3 объекта класса String, которые лежат в ячейках массива
        strings[0] = "Привет!";
        strings[1] = "Пока";
        strings[2] = "Джава";
        System.out.println(strings[0]);
        System.out.println(strings[2]);

        System.out.println();// пустая строка
        for (int i = 0; i< strings.length; i++){ // вывод на экран объектов класса String, содержимое ячеек массива strings
            System.out.println(strings[i]);
        }

        System.out.println();
        for (String string:strings){ // тип данных String - имя переменной string - массив данных по которому мы будем проходить
            System.out.println(string);
        }*/
        int[] numbers1 = {1,2,3};
        int sum = 0;
        for (int x:numbers1){
            sum = sum+x;
        }
        System.out.println(sum);

        int value = 0; // выделяем память под целое число, т.е. 32бит под int.
        String s; // мы не знаем какой размер памяти будет занимать переменная 's' в момент декларирования переменной, поэтому это ссылка на объект, в котором уже есть понимание сколько он занимает места

    }
}
