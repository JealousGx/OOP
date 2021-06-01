import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("Author: JealousGx");
        System.out.println("---------------------");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an ASCII code: ");
        int ascii = input.nextInt();

        System.out.print("The character for ASCII code " + ascii + " is: " + (char)(ascii));
    }
}
