import java.util.*;
public class CostOfDriving {
    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("Author: JealousGx");
        System.out.println("*********************");
        Scanner input = new Scanner(System.in);
        ///Taking inputs
        System.out.print("Enter the distance (In miles): ");
        double distance = input.nextDouble();
        System.out.print("Enter fuel efficiency (In miles per gallon): ");
        double milesPerGallon = input.nextDouble();
        System.out.print("Enter the price per gallon: ");
        double pricePerGallon = input.nextDouble();
        ///Calculating the cost of the trip.
        double costOfTrip = (distance / milesPerGallon) * pricePerGallon;
        System.out.println("\nThe cost of the trip is $" + costOfTrip + "...");
        System.out.println("---------------------");
    }
}
