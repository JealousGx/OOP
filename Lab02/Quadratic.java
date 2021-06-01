import java.util.*;
public class Quadratic {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Author: JealousGx");
        System.out.println("-------------------");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        double aValue = input.nextDouble();
    
        System.out.print("Enter the value of b: ");
        double bValue = input.nextDouble();
    
        System.out.print("Enter the value of c: ");
        double cValue = input.nextDouble();

        /////Finding the discriminant
        double disc = (bValue) * (bValue) - (4 * aValue * cValue);

        if (disc > 0) {
            double quad1 = (-bValue + Math.sqrt((bValue * bValue) - 4*(aValue)*(cValue)) / 2 * aValue);
            double quad2 = (-bValue - Math.sqrt((bValue * bValue) - 4*(aValue)*(cValue)) / 2 * aValue);
            System.out.println("Roots are positive: " + quad1 + " & " + quad2 + "...");
        }
        else if (disc < 0) {
            double quad1 = (-bValue / 2 * aValue);
            System.out.println("Discriminant is negative therefore, neglecting the square root part!");
            System.out.println("Only one root exists: " + quad1 + "...");
        }
        else {
            System.out.println("Roots are equal and zero!");
        }
    }
}