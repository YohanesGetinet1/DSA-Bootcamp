import java.util.Scanner;

public class ThreeNumbers {
    public static void main(String[] args) {
        System.out.println("Please Insert numbers to compare");
        Scanner sc = new Scanner(System.in);


        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println("Please to choose L for largest and S for smallest number");
        String choice = sc.next().toLowerCase();
        if(choice.equals("l"))
        {
            int max = maxChecker(num1,num2,num3);
            System.out.println("The largest Number is "+max);
        }
        else if (choice.equals("s")) {
            int min =minChecker(num1,num2,num3);
            System.out.println("The smallest Number is "+min);

        }

    }
    static int maxChecker(int num1,int num2, int num3)
    {
        if (num1 > num2 && num2 > num3)
            return num1;
        else if (num2 > num1 && num1 > num3)
            return num2;
        else
            return num3;
    }
    static int minChecker(int num1,int num2,int num3)
    {
        if (num1 < num2 && num2 < num3)
            return num1;
         else if (num2 < num1 && num1 < num3)
            return num2;
        else
            return num3;
    }
}
