import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Insert the number to check");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number % 2 == 0)
        {
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }
    }
}
