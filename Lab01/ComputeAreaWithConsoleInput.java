import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("Author: JealousGx");
        System.out.println("*********************");
        ////Creating scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        ////Taking input
        double radius = input.nextDouble();
        double area = radius * radius * 3.14159;
        ///Printing inline
        System.out.println("The area of circle with radius " + radius + " is " + area);
        System.out.println("---------------------");
    }
}
