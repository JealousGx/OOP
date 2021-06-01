package Lab2;

import java.util.Scanner;
public class LotteryUsingStrings {
  public static void main(String[] args) {
    System.out.println("-------------------");
    System.out.println("Author: JealousGx");
    System.out.println("-------------------");
    String lottery = "" + (int)(Math.random() * 10)
      + (int)(Math.random() * 10);

    Scanner input = new Scanner(System.in);
    System.out.print("Enter your lottery pick (two digits): ");
    String guess = input.nextLine();

    int lotteryDigit1 = lottery.charAt(0); 
    int lotteryDigit2 = lottery.charAt(1); 

    int guessDigit1 = guess.charAt(0);
    int guessDigit2 = guess.charAt(1);

    System.out.println("The lottery number is " + lottery);

    if (guess.equals(lottery))
      System.out.println("Exact match: you win $10,000");
    else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2)
      System.out.println("Match all digits: you win $3,000");
    else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2)
      System.out.println("Match one digit: you win $1,000");
    else
      System.out.println("Wrong guess..."); 
  }
}
