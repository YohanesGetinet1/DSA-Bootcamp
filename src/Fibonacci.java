import java.util.Scanner;

public class Fibonacci {
    /*
        The Fibonacci numbers are the numbers in the following integer sequence.
        0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,...

    In mathematical terms, the sequence Fn of Fibonacci numbers is defined by the recurrence relation

        Fn = Fn-1 + Fn-2 where
        F0 = 0 and F1 = 1.
        *
        * */
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int fib;
        System.out.println("Please Insert the number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number == 0) {
            System.out.println("The fibonacci of Zero is 0");
        } else if (number == 1 || number == 2) {
            System.out.println("The fibonacci value is 1");
        }
        else
            for (int i = 2; i <= number ; i++) {
                fib = a + b;
                a = b;
                b = fib;
            }
        System.out.println("The Fibonacci value for the given number is "+b);
    }
}
