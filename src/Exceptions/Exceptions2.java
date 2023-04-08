package Exceptions;

import java.io.IOException;
import java.util.Scanner;

public class Exceptions2 {
    public static void main(String[] args) throws ScannerException {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int x = Integer.parseInt(scanner.nextLine());

            if (x!=0){
                /*try {
                    throw new IOException();
                } catch (IOException e) {
                   System.out.println("Пользователь ввел что-то кроме нуля0"); можно так , без обработки исключения, а можно обработать с помощью создания нового класса ScannerException
                 */
                throw new ScannerException("Пользователь ввел что-то кроме нуля");

            }
        }

    }
}
