import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("Author: JealousGx");
        System.out.println("*********************");
        Scanner input = new Scanner(System.in);
        /////Taking seconds as input
        System.out.println("Enter total seconds: ");
        int seconds = input.nextInt();
        ////Conversion
        int mins = seconds / 60;
        int remainingSecs = seconds % 60;
        ////Printing
        System.out.println(seconds + " seconds is " + mins + " minutes and " + remainingSecs + " seconds!");
        System.out.println("---------------------");
    }
}
