import java.util.Scanner;

public class ComputeAreaWithConstant {
    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("Author: JealousGx");
        System.out.println("*********************");
        final double PI = 3.14159; ///Constant variable
        Scanner input = new Scanner(System.in);
        ///Taking radius from the user
        System.out.println("Enter the radius: ");
        double radius = input.nextDouble();
        ////Computing the area
        double area = radius * radius * PI;
        ///Printing the area
        System.out.println("The area of circle with radius " + radius + " is " + area);
        System.out.println("---------------------");
    }
}
