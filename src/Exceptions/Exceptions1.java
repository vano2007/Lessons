package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args){
        File file = new File("test");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        System.out.println("После блока try catch");
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Обработка в методе main");
        }
    }
    public static void readFile() throws FileNotFoundException {
        File file = new File("test111");
        Scanner scanner = new Scanner(file);
    }
}
