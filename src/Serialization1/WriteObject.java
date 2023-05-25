package Serialization1;

import Serialization.Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {

        Person1[] people = {new Person1(1,"Bob"), new Person1(2,"Mike"), new Person1(3, "Tom")};//надо этот массив с объектами записать в файл

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
                // первый вариант - поочередно записываем в массив объекты
            /*oos.writeInt(people.length); // сначала записываем длину массива

            for (Person1 person : people){ // с помощью цикла записываем в файл число , количество объектов и сами объекты
                oos.writeObject(person);
            }*/

            // второй вариант - целиком объект массива people

            oos.writeObject(people);

            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
