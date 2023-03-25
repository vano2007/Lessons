public class Format {
    public static void main(String[] agrs){
        System.out.print("Hello! \n");
        System.out.println("Hello again!");
        System.out.printf("This is a string, %s ; \n", "Nice");
        System.out.printf("This is a digital, %d ; \n", 10);
        System.out.printf("%f This is a %s digital, %d ; \n", 10.3, "Nice", 20);
        System.out.printf("String %10d \n", 234);
        System.out.printf("String %-10d \n", 234);
        System.out.printf("String %.2f \n", 234.3);
    }
}
