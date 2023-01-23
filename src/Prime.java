import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the number");
        int num =sc.nextInt();
        boolean answer=true;
        if (answer == isPrime(num))
        {
            System.out.println(num+" is prime number");
        }
        else
        {
            System.out.println(num+ " isn't prime number");
        }
    }
    static boolean isPrime(int num)
    {
        if (num <= 1)
            return false;
        for (int i = 2; i < num ; i++) {
            if (num % i ==  0)
                return false;
        }
        return true;
    }
}
