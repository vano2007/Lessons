public class ToString {
    public static void main(String[] args) {
        String string = "Hello";
        System.out.println(string);

        Human2 human2 = new Human2("Bob", 40);
        human2.toString();
        System.out.println(human2);
    }
}
class Human2 {
    private String name;
    private int age;

    public Human2(String name, int age){
        this.name = name;
        this.age = age;
    }
    /*public String toString(){
        return name +","+ age;
    }*/

}
