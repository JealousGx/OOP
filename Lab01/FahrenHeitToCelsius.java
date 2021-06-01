import java.util.Scanner;

public class FahrenHeitToCelsius {
    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("Author: JealousGx");
        System.out.println("*********************");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Fahreheit: ");
        double fahrenheitTemp = input.nextDouble();
        ///Conversion
        double celsiusTemp = (5.0/9) * (fahrenheitTemp - 32);
        System.out.println("The Celsius temperature at " + fahrenheitTemp + " Fahrenheit is " + celsiusTemp + " Celsius degree!");
        System.out.println("---------------------");
    }
}
