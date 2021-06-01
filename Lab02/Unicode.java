import java.util.Scanner;

public class Unicode {
    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("Author: JealousGx");
        System.out.println("---------------------");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);

        System.out.print("The Unicode for character " + ch + " is: " + (int)(ch));
    }
}
