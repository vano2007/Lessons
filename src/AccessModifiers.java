import Packet1.Person1;

public class AccessModifiers extends Person1 {
    /*public int id; //поле которое может быть использовано во всех классах нашего API
    private int id1; // поле которое мы используем только внутри нашего класса и оно не видно в других класса API
    int id2; // модификатор доступа по умолчанию default - доступно в пределах этого пакета
    protected int id3;//тоже что и default, но шире (не только в пределах пакета, но и в классах за пределами пакета
                      //если используются в классах наследеющих этот класс в котором это поле декларированно )*/
    public AccessModifiers(){
        name1 = "Tom1";//получили доступ к полю name1 запределами пакета Packet1, потому что унаследовались от него.
    }

    public static void main(String[] args) {
        // public, private, default, protected

        Person1 person1 = new Person1();
        person1.name = "Bob";
        //person1.age = "Age"  - не можем вывести , т.к. поле age приватное в отличии от публичного поля name
        System.out.println(Person1.CONSTANT); //доступ к константам отовсюду

        //System.out.println(person1.name1); - к полю protected нет доступа, т.к действие его внутри пакета Packet1, но
        //если мы унаследуемся от класса "extends Person1", то мы получим поля protected из этого класса

    }
    /*private void tehnicalMethod(){ //метод который может использоваться только внутри нашего класса AccessModifiers

    }*/
}
