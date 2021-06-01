

import java.util.Scanner;
public class RandomMonth {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Author: JealousGx");
        System.out.println("-------------------");
        Scanner input = new Scanner(System.in);

        int randomNum = (int)(Math.random() * 12);
        switch (randomNum) {
            case 1:
                System.out.printf("%d - Janurary", randomNum);
                break;
            case 2:
                System.out.printf("%d - February", randomNum);
                break;
            case 3:
                System.out.printf("%d - March", randomNum);
                break;
            case 4:
                System.out.printf("%d - April", randomNum);
                break;
            case 5:
                System.out.printf("%d - May", randomNum);
                break;
            case 6:
                System.out.printf("%d - June", randomNum);
                break;
            case 7:
                System.out.printf("%d - July", randomNum);
                break;
            case 8:
                System.out.printf("%d - August", randomNum);
                break;
            case 9:
                System.out.printf("%d - September", randomNum);
                break;
            case 10:
                System.out.printf("%d - October", randomNum);
                break;
            case 11:
                System.out.printf("%d - November", randomNum);
                break;
            case 12:
                System.out.printf("%d - December", randomNum);
                break;
            default:
                
        }
    }
}
