package Serialization2;

import Serialization1.Person1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {

        Person2 person= new Person2(1,"Mike");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))){ // можно в параметры потока прописать создание закомментированного кода ниже
            /*FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);*/

            oos.writeObject(person);

            //oos.close();  если создание объекта происходит в параметрах потока , то закрывать его в теле потока не надо

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
