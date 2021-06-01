package Lab2;

import java.util.Scanner;
public class TestBooleanOperators {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Author: JealousGx");
        System.out.println("-------------------");
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        if (num % 2 ==0 && num % 3 == 0)
            System.out.println(num + " is divisible by both, 2 and 3.");
        if (num % 2 ==0 || num % 3 == 0)
            System.out.println(num + " is divisible 2 or 3.");
        if (num % 2 ==0 ^ num % 3 == 0)
            System.out.println(num + " is divisible by 2 or 3 but not both.");
    }
}
