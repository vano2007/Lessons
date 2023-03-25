public class ClassesAndObjects {
       public static void main(String[] args) {

        Person person1 = new Person();
        /*person1.name = "Роман";
        person1.age = 50;*/
        //person1.setName("Роман", 50);
        //System.out.println("Меня зовут " + person1.name + ", " + "мне " + person1.age); //можно представиться отдельно, если в классе нет метода представления
        //person1.sayHello(); //у объекта можно вызвать разные(любой) метод из класса, например этот
        int years1 = person1.calculateYears();
        //   System.out.println("Колличество лет до пенсии: " + years1);
        person1.setName("");
        person1.setAge(-1);
           System.out.println("Выводим значение в main методе "+ person1.getName());
           System.out.println("Выводим значение в main методе "+ person1.getAge());
        //person1.speak();

        Person person2 = new Person();
        /*person2.name = "Вова";
        person2.age = 20;*/
        person2.setName("Вова", 20);
        //person2.speak(); // так вызывается метод speak из класса Person для этого конкретного объекта
        //System.out.println("Меня зовут " + person2.name + ", мне " + person2.age);
        person2.calculateYears();
        int years2 = person2.calculateYears();
        //   System.out.println("Колличество лет до пенсии: " + years2);

        }
}
class Person{
    private String name;
    private int age;

    public void setName(String userName){
        if (userName.isEmpty()){
            System.out.println("Ты вел пустое имя");
        } else {
            name = userName;
        }
    }
    public String getName(){
        return name;
    }

    public void setAge(int userAge) {
        if (userAge<0){
            System.out.println("Возраст должен быть положительный");
        } else {
            age = userAge;
        }
    }

    public int getAge() {
        return age;
    }

    void setName(String username, int userage){
        name = username;
        age = userage;

    }

    void speak(){
        for (int i=0; i<3; i++){  // можно создать цикл ввода представления объекта и это исполнится после вызова метода speak у объекта
            System.out.println("Меня зовут " + name + ", мне " + age + " лет"); // можно представить каждого в классе через вызов метода speak
        }                                                                    // но надо стереть представления каждого в отдельности
    }

    void sayHello(){
        System.out.println("Hello!");
    }

    int calculateYears(){
        int years = 65-age;
        return years; // После return метод сразу прекращает свою работу, программа выходит из этого метода и то что мы пишем код после return программа не читает
    }
    /*У класса могут быть:
    1. Данные (поля) - например цвет глаз, возраст, вес, имя и т.д;
    2. Действия, которые он может совершать(методы) - бегать, прыгать, плясать, говорить и т.д.;
     */

}