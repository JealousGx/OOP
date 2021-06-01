import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Author: JealousGx");
        System.out.println("-------------------");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        reverse(num);
    }

    public static void reverse(int num) {
        ///Function to reverse the entered number
        String reverseNum = "";
        int temp = num;
        while (temp != 0) {
            reverseNum += temp % 10;
            temp /= 10;
        }
        System.out.println("The reverse of the number " + num + " is: " + reverseNum);
    }
}
