import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("Author: JealousGx");
        System.out.println("---------------------");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an alphabetical character: ");
        char ch = input.next().charAt(0);
        
        switch (ch) {
            case 'A':
            case 'a':
            case 'e':
            case 'E':
            case 'I':
            case 'i':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.print(ch + " is vowel.");
                break;
            case 'b':
            case 'B':
            case 'C':
            case 'c':
            case 'D':
            case 'd':
            case 'f':
            case 'F':
            case 'G':
            case 'g':
            case 'h':
            case 'H':
            case 'j':
            case 'J':
            case 'k':
            case 'K':
            case 'l':
            case 'L':
            case 'M':
            case 'm':
            case 'n':
            case 'N':
            case 'p':
            case 'Q':
            case 'q':
            case 'r':
            case 'R':
            case 's':
            case 'S':
            case 'T':
            case 't':
            case 'v':
            case 'V':
            case 'w':
            case 'W':
            case 'X':
            case 'x':
            case 'y':
            case 'Y':
            case 'z':
            case 'Z':
                System.out.print(ch + " is a consonant.");
                break;
            default:
                System.out.print("Invalid input");
        }
    }
}
