import java.util.Scanner;

public class SumTheDigits {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Author: JealousGx");
        System.out.println("-------------------");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer (Two or more digits): ");
        int num = input.nextInt();
        System.out.println("The sum of the digits in " + num + " is: " + sumDigits(num));
    }

    public static int sumDigits(long num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
