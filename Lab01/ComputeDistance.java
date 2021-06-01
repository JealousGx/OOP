import java.util.Scanner;
public class ComputeDistance {
    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("Author: JealousGx");
        System.out.println("*********************");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter the value of x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter the value of y1: ");
        double y1 = input.nextDouble();
        System.out.print("Enter the value of y2: ");
        double y2 = input.nextDouble();
        ////Computing the distance separately.
        double x = x2 - x1;
        double y = y2 - y1;
        double internalSum = (x * x) + (y * y);
        ////Computing the distance
        double pointDistance = Math.pow(internalSum, 0.5);
        System.out.println("The distance from (" + x1 + ", " + y1 + ") & (" + x2 + ", " + y2 + ") is: " + pointDistance);
        System.out.println("---------------------");
    }
}
