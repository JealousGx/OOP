import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("Author: JealousGx");
        System.out.println("*********************");
        ////Creating scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        ////Taking inputs
        double NUM1 = input.nextDouble();
        double NUM2 = input.nextDouble();
        double NUM3 = input.nextDouble();
        ///Taking average
        double AVERAGE = (NUM1 + NUM2 + NUM3)/3;
        ///Printing the average
        System.out.println("The average of " + NUM1 + " " + NUM2 + " " + NUM3 + " is " + AVERAGE);
        System.out.println("---------------------");
    }
}
