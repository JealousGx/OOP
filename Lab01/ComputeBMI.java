import java.util.Scanner;
public class ComputeBMI {
    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("Author: JealousGx");
        System.out.println("*********************");
        Scanner input = new Scanner(System.in);
        ///Taking user weight in lbs
        System.out.print("Enter your weight in pounds: ");
        double userWeightInLB = input.nextDouble();
        ///Taking user height in inches
        System.out.print("Enter your height in inches: ");
        double userHeightInIn = input.nextDouble();
        ///Converting height and weight into meters and kgs respectively.
        double userWeight = userWeightInLB * 0.45359237;
        double userHeight = userHeightInIn * 0.0254;
        ///Calculating BMI
        double userBMI = (userWeight) / (userHeight * userHeight);
        System.out.println("Your BMI is: " + userBMI);
        System.out.println("---------------------");
    }
}
