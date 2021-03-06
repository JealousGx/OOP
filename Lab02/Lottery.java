package Lab2;

import java.util.Scanner;
public class Lottery {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Author: JealousGx");
        System.out.println("-------------------");
        Scanner input = new Scanner(System.in);

        int lottery = (int)(Math.random() * 100);
        System.out.print("Enter your lottery pick (Two digits): ");
        int guess = input.nextInt();

        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;

        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println("Lottery number is: " + lottery);

        if (guess == lottery)
            System.out.println("Exact match: You win $10,000");
        else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2)
            System.out.println("Match all digits: you win $3,000");
        else if (guessDigit1 == lotteryDigit1 || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2)
            System.out.println("Match on digit: you win $1,000");
        else
            System.out.print("No match!");
    }
}
