import java.util.Scanner;

public class CheckPassword {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Author: JealousGx");
        System.out.println("-------------------");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a password (Length: 8): ");
        String password = input.nextLine();

        if (checkPass(password))
            System.out.println(password + " is valid!");
        else
            System.out.println(password + " is not valid!");
    }

    public static boolean checkPass(String password) {
       return (isLengthValid(password, 8) && isLettersAndDigitsOnly(password) && hasDigits(password, 2));
    }

    public static boolean isLengthValid(String password, int length) {
        return password.length() >= length;
    }

    public static boolean hasDigits(String password, int minDigits) {
        int digitCount = 0;
        for (int i = 0; i < password.length(); i++)
            if (Character.isDigit(password.charAt(i)))
                digitCount++;
            if (digitCount >= minDigits)
                return true;
            else
                return false;
    }

    public static boolean isLettersAndDigitsOnly(String password) {
        for (int i = 0; i < password.length(); i++)
            if (!Character.isLetterOrDigit(password.charAt(i)))
                return false;
        return true;
    }
}
