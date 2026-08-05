package method;
import java.util.Scanner;
public class Palindrome {
    static boolean isPalindrome(int num) {

        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPalindrome(n)) {
            System.out.println(n + " is a Palindrome Number.");
        } else {
            System.out.println(n + " is not a Palindrome Number.");
        }
    }
}
