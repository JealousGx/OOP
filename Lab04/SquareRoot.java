import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Author: JealousGx");
        System.out.println("-------------------");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = input.nextDouble();

        System.out.printf("The square root of %.1f is: %.6f", num, sqrt(num));
    }

    public static double sqrt(double num) {
        double lastGuess = 1;
        double nextGuess = ((lastGuess + num / lastGuess) / 2);
        while (nextGuess - lastGuess > 0.0001) {
            lastGuess = nextGuess;
            nextGuess = ((lastGuess + num / lastGuess) / 2);
        }
        lastGuess = nextGuess;
        nextGuess = ((lastGuess + num / lastGuess) / 2);
        return nextGuess;
    }
}
