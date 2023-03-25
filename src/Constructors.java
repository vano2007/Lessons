public class Constructors {
    public static void main(String[] args) {
        Human1 human1 = new Human1();
        Human1 h = new Human1("Bob", 48);
        h.setName("Tom");

        Human1.description = "Nice";
        Human1.getDescription();
    }
}
class Human1{
    private String name;
    private int age;

    public static String description;
    public static int x;

    public Human1(){
        System.out.println("Привет из первого конструктора");
    }

    public Human1(String name){
        System.out.println("Привет из второго конструктора");
        this.name = name;
    }
    public Human1(String name, int age){
        System.out.println("Привет из третьего конструктора");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void getDescription(){
        System.out.println(description);
    }
}
