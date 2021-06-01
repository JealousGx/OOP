package Lab2;

import java.util.Scanner;

public class OrderTwoCities {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Author: JealousGx");
        System.out.println("-------------------");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();
        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();

        if (city1.compareTo(city2) < 0)
            System.out.println("The cities in alphabetical order " + city1 + ", " + city2);
        else
            System.out.println("The cities in alphabetical order " + city1 + ", " + city2);
    }
}
