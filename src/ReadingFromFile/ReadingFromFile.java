package ReadingFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {

        String separator = File.separator;
        String path = separator+"Users"+separator+"Admin"+separator+"Desktop"+separator+"text.txt";
        File file = new File(path);

        //File file = new File("GUID"); если файл лежит в папке проекта, а не на компьютере где-то по конкретному пути, то можно указать это, а то что выше не надо


        Scanner scanner = new Scanner(file);
        /*
        while(scanner.hasNextLine()){  это цикл для считывания данных из файла построчно
            System.out.println(scanner.nextLine()); это вывод в консоль того что в файле
            }

        String line = scanner.nextLine();
        String[] words = line.split(" "); для вывода в массив слов из файла, которые разделяются пробелом и которые остаются String

        System.out.println(Arrays.toString(words));
        */
        String line = scanner.nextLine();
        String[] numbersString = line.split(" "); // здесь числа остаются String
        int[] numbers = new int[12];
        int counter = 0;

        for (String number : numbersString){
            numbers[counter++] = Integer.parseInt(number);
        }

        System.out.println(Arrays.toString(numbers));

        scanner.close();

    }
}
