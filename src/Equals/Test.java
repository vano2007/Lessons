package Equals;

public class Test {
    public static void main(String[] args) {
//        int x = 1;
//        int y = 1;
//        System.out.println(x==y);

        // animal1   ->    {1}  сравнение идет не по сути(полям) объекта, а по указателям на эти объекты, а они не одинаковые, поэтому результат сравнения false
        // animal2   ->    {1}
        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(2);
        System.out.println(animal1.equals(animal2));

    }
}
class Animal{
    private int id;

    public Animal(int id){
        this.id = id;
    }
    public boolean equals(Object obj){
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;
    }
}
