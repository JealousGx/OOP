// This program is specifically made for three-digit integers. Any attempt to try it on a number exceeding three-digit will result in wrong answers only!

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("Author: JealousGx");
        System.out.println("---------------------");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer (Three-digit): ");
        int num = input.nextInt();

        int temp = num;
        int reverseNum = 0;
        int num1 = temp % 10;
        temp /= 10;
        reverseNum = reverseNum * 10 + num1;
        int num2 = temp % 10;
        temp /= 10;
        reverseNum = reverseNum * 10 + num2;
        int num3 = temp % 10;
        temp /= 10;
        reverseNum = reverseNum * 10 + num3;
        boolean isPalindrome = (num == reverseNum);
        if (isPalindrome)
            System.out.print(num + " is a Palindrome number!");
        else
            System.out.print(num + " is not a Palindrome number!");
    }
}
