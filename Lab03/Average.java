import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Author: JealousGx");
        System.out.println("-------------------");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userNum = input.nextInt();
        double sum = 0, negativeValue = 0, positiveValue = 0, averageValue = 0, totalNums = 0;
        while (userNum != 0) {
            System.out.print("Enter an integer: ");
            userNum = input.nextInt();
            sum += userNum;
            if (userNum < 0)
                negativeValue++;
            else if (userNum >= 0)
                positiveValue++; 
            if (userNum != 0)
                totalNums++;
        }
        if (totalNums != 0) {
            averageValue = sum / totalNums;
            System.out.printf("Total positive integers: %.1f\n", positiveValue);
            System.out.printf("Total negative integers: %.1f\n", negativeValue);
            System.out.printf("The sum of the entered integers: %.1f\n", sum);
            System.out.printf("The average of the numbers: %.2f", averageValue);
        }
        else
            System.out.printf("Total integers entered: 0");
    }
}