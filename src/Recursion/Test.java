package Recursion;

public class Test {
    public static void main(String[] args) {
        counter(3);
    }

    // counter(3) -> counter(2) -> counter(1)
    private static void counter(int n){

        if (n==0)
            return;

        System.out.println(n);

        counter(n-1); // 3, 2, 1

    }
}
