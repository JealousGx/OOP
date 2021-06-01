package Lab2;

import java.util.*;
public class AdditionQuiz {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Author: JealousGx");
        System.out.println("-------------------");
        int num1 = (int)(System.currentTimeMillis() % 10);
        int num2 = (int)(System.currentTimeMillis() * 7 % 10);

        Scanner input = new Scanner(System.in);

        System.out.print("What does " + num1 + " + " + num2 + " equal? ");
        int ans = input.nextInt();
        System.out.println(num1 + " + " + num2 + " = " + ans + ", " + (num1 + num2 == ans));
    }
}
