import java.util.Random;
import java.util.Scanner;

public class HeadsOrTail {
    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("Author: JealousGx");
        System.out.println("---------------------");
        // Random rand = new Random();
        // int randomNum = rand.nextInt(1);
        int randomNum = (int)(Math.random() * 2);
        Scanner input = new Scanner(System.in);
        System.out.print("Coin has flipped...\n0 - Heads\n1 - Tails\nGuess the right answer: ");
        int userGuess = input.nextInt();
        
        if (userGuess == randomNum)
            System.out.println("Right guess!");
        else 
            System.out.println("Wrong guess!");
    }
}
