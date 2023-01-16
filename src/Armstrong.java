import java.util.Scanner;

public class Armstrong {
/*
An Armstrong number is a number that is equal to the sum of its own
digits each raised to the power of the number of digits in the number.
Test case - 153 = 1^3 + 5^3 + 3^3 = 153
Test case - 9474 = 9^4 + 4^4 + 7^4 + 4^4 = 9474
* */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int digits ;
        int sum =0;
        int temp = number;
        int numOfDigits = String.valueOf(number).length();

        for (int i = 0; i < numOfDigits ; i++) {
            digits = number % 10;
            sum += Math.pow(digits, numOfDigits);
            number = number / 10;
        }
        if (sum == temp)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
        System.out.println(number);
    }

}
