import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Author: JealousGx");
        System.out.println("-------------------");

        Scanner input = new Scanner(System.in);

        double sum = 0;
        for (double i = 1.0; i < 98.0; i += 2) 
            sum += i / (i + 2);
        
            System.out.println("Series: 1 / 3 + 3 / 5 + 5 / 7 + 7 / 9 + 9 / 11 + 11 / 13 + ... + 95 / 97 + 97 / 99");
            System.out.printf("Sum of the above series is: %.3f\n", sum);
    }
}
