import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Author: JealousGx");
        System.out.println("-------------------");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        int index = 2; // Numbers to test as factors 

		// Find and display all the smallest factors in increasing order
		while (num / index != 1) {
			// Test as a factor of number
			if (num % index  == 0) {
				System.out.print(index + ", ");
				num /= index; 
			}
			else
				index++; // Increment index
		}
		System.out.println(num + ".");
    }
}
