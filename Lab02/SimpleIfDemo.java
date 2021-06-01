package Lab2;

import java.util.*;
public class SimpleIfDemo {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Author: JealousGx");
        System.out.println("-------------------");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        if (num % 5 == 0)
            System.out.println("HighFive");
        if (num % 2 == 0)
            System.out.println("HighEven");
    }
}
