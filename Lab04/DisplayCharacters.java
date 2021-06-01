import java.util.Scanner;

public class DisplayCharacters {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Author: JealousGx");
        System.out.println("-------------------");
        Scanner input = new Scanner(System.in);
        final int NUMBER_OF_CHARS_PER_LINE = 10;

        // In case, this program needs to be changed to prompting the user for the input..
        // System.out.print("Enter the first character: ");
        // char ch1 = input.next().charAt(0);
        // System.out.print("Enter the second character: ");
        // char ch2 = input.next().charAt(0);
        
        char ch1 = '1', ch2 = 'Z';
        printChars(ch1, ch2, NUMBER_OF_CHARS_PER_LINE);

    }

    public static void printChars(char ch1, char ch2, int numberPerLine) {
        char numOfLines = 1;
        for (char ch = ch1; ch <= ch2; ch++) {
            if (numOfLines % numberPerLine == 0)
                System.out.println(ch);
            else
                System.out.print(ch + " ");
            numOfLines++;
        }
    }
}
