import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Author: JealousGx");
        System.out.println("-------------------");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter another integer: ");
        int num2 = input.nextInt();

        int gcd = num1 < num2 ? num1:num2;

        while (num1 % gcd != 0 || num2 % gcd != 0)
            gcd--;
        System.out.println("The greatest common divisor of " + num1 + " & " + num2 + " is: " + gcd);
    }
}
