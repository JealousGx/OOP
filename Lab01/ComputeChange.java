import java.util.Scanner;
public class ComputeChange {
    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("Author: JealousGx");
        System.out.println("*********************");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        double amount = input.nextDouble();
        int remainingAmount = (int)(amount * 100);
        ////Number of one dollars
        int numOfOneDolls = remainingAmount / 100;
        remainingAmount %= 100;
        ///Number of quarters in remainingAmount
        int numOfQuarts = remainingAmount / 25;
        remainingAmount %= 25;
        ///Number of dimes in remainingAmount
        int numOfDimes = remainingAmount / 10;
        remainingAmount %= 10;
        ///Number of nickles in remainingAmount
        int numOfNicks = remainingAmount / 5;
        remainingAmount %= 5;
        ////Number of pennies
        int numOfPennies = remainingAmount;
        System.out.println("Your amount " + amount + " consists of: ");
        System.out.println("- " + numOfOneDolls + " dollars!");
        System.out.println("- " + numOfQuarts + " quarters!");
        System.out.println("- " + numOfDimes + " dimes!");
        System.out.println("- " + numOfNicks + " nickels!");
        System.out.println("- " + numOfPennies + " pennies!");
        System.out.println("---------------------");}}
