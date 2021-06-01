import java.util.Scanner;

public class computeE {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Author: JealousGx");
        System.out.println("-------------------");

        Scanner input = new Scanner(System.in);
        
        double e = 1.0;
        System.out.print("Enter the power of e: ");
        double item = input.nextDouble();

        for (double i = 1; i <= item; i++) {
            double denom = i;
            for (double index = i - 1; index >= 1; index--) {
                denom *= index;
            }
            e += (1 / denom);
        }

        System.out.printf("The value for (e)^(%.2f) is: %.16f", item, e);
    }
}
