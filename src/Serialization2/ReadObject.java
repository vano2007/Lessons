package Serialization2;

import Serialization2.Person2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))){ // вот так прописать в параметры
            /*FileInputStream fis = new FileInputStream("people.bin"); // этот код можно прописать в параметрах "try" и все будет работать
            ObjectInputStream ois = new ObjectInputStream(fis);*/

            Person2 person = (Person2) ois.readObject();

            System.out.println(person);

            //ois.close(); это тоже можно убрать т.к. закрытие потока происходит в самом классе ObjectInputStream

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
