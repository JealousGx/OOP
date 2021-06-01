package Lab2;

import java.util.*;
public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Author: JealousGx");
        System.out.println("-------------------");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight (In lbs): ");
        double weightLbs = input.nextDouble();
        System.out.print("Enter height (In lnches): ");
        double heightIn = input.nextDouble();
        
        final double KGS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;
        
        double weight = weightLbs * KGS_PER_POUND;
        double height = heightIn * METERS_PER_INCH;
        double BMI = weight / (height * height);

        if (BMI < 18.5)
            System.out.println("BMI is " + BMI + ": Underweight!");
        else if (BMI < 25)
            System.out.println("BMI is " + BMI + ": Normal!");
        else if (BMI < 30)
            System.out.println("BMI is " + BMI + ": Overweight!");
        else
            System.out.println("BMI is " + BMI + ": Obese!");
    }
}
