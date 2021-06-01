import java.util.Scanner;

public class DisplayPatterns {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Author: JealousGx");
        System.out.println("-------------------");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int num = input.nextInt();
        displayPattern(num);
    }

    public static void displayPattern(int num) {
        ////Function to display the pattern
        int padd = num - 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < padd; j++) {
                System.out.print("  ");
            }
            for (int k = i; k > 0; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
            padd--;
        }
    }
}
