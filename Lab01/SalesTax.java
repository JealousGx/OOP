import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("Author: JealousGx");
        System.out.println("*********************");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();
        double tax = purchaseAmount * 0.06;
        System.out.println("Sales tax: " + (int)(tax));
        System.out.println("---------------------");
    }
}
