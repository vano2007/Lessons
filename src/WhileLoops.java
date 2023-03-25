public class WhileLoops {
    public static void main(String[] args) {
        boolean t = 5==1;
        System.out.println(t);

        int x = 5;
        int value = 7;
        boolean m = x<=-value;
        System.out.println(m);

        int floor = 0;
        while(floor<3){

            System.out.println("Hello");
            floor = floor + 1;

        }

        int count = 1;
        float total = 1000 + 1000*5/12/100f;

        System.out.println(total+" "+ count+ " месяц");

        while(total<14000){
            total = total + (2500 + 2500*5/12/100f);
            count++;

            System.out.println(total+" "+ count+ " месяц");

        }

    }
}
