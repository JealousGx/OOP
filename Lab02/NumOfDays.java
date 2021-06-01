import java.util.Scanner;
public class NumOfDays {
    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("Author: JealousGx");
        System.out.println("---------------------");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int currentYear = input.nextInt();
        System.out.print("Enter the month: ");
        int currentMonth = input.nextInt();

        boolean isLeapYear = ((currentYear % 4 == 0 && currentYear % 100 != 0) || (currentYear % 400 == 0));

        if (currentMonth == 1)
            System.out.println("January " + currentYear + " has 31 days!");
        else if (currentMonth == 2)
            if (isLeapYear)
                System.out.println("February " + currentYear + " has 29 days!");
            else
                System.out.println("February " + currentYear + " has 28 days!");
        else if (currentMonth == 3)
            System.out.println("March " + currentYear + " has 31 days!");
        else if (currentMonth == 4)
            System.out.println("April " + currentYear + " has 30 days!");
        else if (currentMonth == 5)
            System.out.println("May " + currentYear + " has 31 days!");
        else if (currentMonth == 6)
            System.out.println("June " + currentYear + " has 30 days!");
        else if (currentMonth == 7)
            System.out.println("July " + currentYear + " has 31 days!");
        else if (currentMonth == 8)
            System.out.println("August " + currentYear + " has 31 days!");
        else if (currentMonth == 9)
            System.out.println("September " + currentYear + " has 30 days!");
        else if (currentMonth == 10)
            System.out.println("October " + currentYear + " has 31 days!");
        else if (currentMonth == 11)
            System.out.println("November " + currentYear + " has 30 days!");
        else if (currentMonth == 12)
            System.out.println("December " + currentYear + " has 31 days!");
    }
}
