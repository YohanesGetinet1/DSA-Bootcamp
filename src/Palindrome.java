import java.util.Scanner;

public class Palindrome {
    /* A string is said to be a palindrome  when the string read from left to right is equal
    to the string read from right to left, ignoring the difference between uppercase and lowercase characters.
    Example - Madam , Radar
    *
    *
    *
    * */
    public static void main(String[] args) {
        System.out.println("Insert the Word to check");
        Scanner sc =new Scanner(System.in);
        String word = sc.next().toLowerCase();
        String rev = "";
        for (int i = word.length() -1; i >=0 ; i--) {
            rev += word.charAt(i);
        }
        if (word.equals(rev))
            System.out.println("The word is Palindrome");
        else
            System.out.println("The word is not Palindrome");
    }
}
