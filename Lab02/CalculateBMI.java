import java.util.Scanner;

public class CalculateBMI {
    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("Author: JealousGx");
        System.out.println("---------------------");
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter weight in pounds: ");
        double weightLbs = input.nextDouble();

        System.out.print("Enter height in feet: ");
        int heightFeet = input.nextInt();

        System.out.print("Enter height in Inches: ");
        int heightIn = input.nextInt();

        double height = (((heightFeet * 12) + heightIn) * 0.0254);
        double weight = weightLbs * 0.453592;

        double BMI = (weight) / (Math.pow(height, 2.0));

        System.out.println("The BMI is: " + BMI);

        
        
    }
}
