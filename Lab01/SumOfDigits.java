import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("Author: JealousGx");
        System.out.println("*********************");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any integer between 1-1000: ");
        int num = input.nextInt();
        int num1 = num % 10;
        num /= 10;
        int num2 = num % 10;
        num /= 10; 
        int num3 = num % 10;
        num /= 10;
        int sum = num1 + num2 + num3;
        System.out.println("The sum of " + num3 + ", " + num2 + " & " + num1 + " is: " + sum + ".");

    }
}
