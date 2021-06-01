package Lab2;

import java.util.*;
public class SubtractionQuiz {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Author: JealousGx");
        System.out.println("-------------------");
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);
        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.print("What's " + num1 + " - " + num2 + "? ");
        Scanner input = new Scanner(System.in);
        int ans = input.nextInt();

        if (num1 - num2 == ans) 
            System.out.println("Correct answer!");
        else
            System.out.println("Wrong answer! " + num1 + " - " + num2 + " = " + (num1 - num2));
    }
}
