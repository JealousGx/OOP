import java.util.Scanner;
public class ComputePKR {
    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("Author: JealousGx");
        System.out.println("*********************");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        double amount = input.nextDouble();
        int remainingAmount = (int)(amount * 100);
        ////Number of one dollars
        int numOfOneLacs = remainingAmount / 10000000;
        remainingAmount %= 10000000;
        ///Number of quarters in remainingAmount
        int numOfThousands = remainingAmount / 100000;
        remainingAmount %= 100000;
        int numOfHundreds = remainingAmount / 10000;
        remainingAmount %= 10000;
        ///Number of dimes in remainingAmount
        int numOfTens = remainingAmount / 1000;
        remainingAmount %= 1000;
        ///Number of nickles in remainingAmount
        int numOfPaisas = remainingAmount;
        System.out.println("Your amount " + amount + " consists of: ");
        System.out.println("- " + numOfOneLacs + " lacs!");
        System.out.println("- " + numOfThousands + " thousands!");
        System.out.println("- " + numOfHundreds + " hundreds!");
        System.out.println("- " + numOfTens + " tens!");
        System.out.println("- " + numOfPaisas + " paisas!");
        System.out.println("---------------------");}}