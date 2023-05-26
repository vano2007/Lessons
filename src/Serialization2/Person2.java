package Serialization2;

import java.io.Serializable;

public class Person2 implements Serializable {
    private static final long serialVersionUID = -3381044105697501596L;
    private int id; // но если мы напишем напротив примитивного типа поля слово 'transient', то запишется "0", а не "null"
    private transient String name; // если мы не хотим записывать это поле в файл, то что делать?
                                   // пишем "private transient String name" напротив этого поля и тогда запишется "null" вместо этого поля

    public Person2(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return id + ":" + name;
    }
}
