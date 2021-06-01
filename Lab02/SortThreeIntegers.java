import java.util.Scanner;

public class SortThreeIntegers {
    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("Author: JealousGx");
        System.out.println("---------------------");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        System.out.print("Enter third integer: ");
        int num3 = input.nextInt();

        int temp;
        if (num2 < num1 || num3 < num1) {
			if (num2 < num1) {
				temp = num1;
				num1 = num2;
				num2 = temp; 
			}
			if (num3 < num1) {
				temp = num1;
				num1 = num3;
				num3 = temp;
			}
		}
		if (num3 < num2) {
			temp = num2;
			num2 = num3;
			num3 = temp;
        }
        System.out.println(num1 + " " + num2 + " " + num3);
    }
}
