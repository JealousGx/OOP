import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Author: JealousGx");
        System.out.println("-------------------");
        Scanner input = new Scanner(System.in);

        System.out.print("Type a sentence: ");
        String sentence = input.nextLine();

        System.out.println("Your sentence has " + totalLetters(sentence) + " letters!");
    }

    public static int totalLetters(String sentence) {
        int letters = 0;
        for (int i = 0; i < sentence.length(); i++) 
            if (sentence.charAt(i) != ' ')
                letters++;
        return letters;
    }
}
