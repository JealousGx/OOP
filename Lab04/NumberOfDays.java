public class NumberOfDays {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Author: JealousGx");
        System.out.println("-------------------");
        System.out.println("Year        Number of days");
        System.out.println("--------------------------");
        for (int year = 2000; year <= 2020; year++)
            System.out.printf("%-15d%d\n", year, numOfDays(year));
        
    }
    
    public static boolean isLeapYear(int year)  {
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }

    public static int numOfDays(int year) {
        if (isLeapYear(year))
            return 366;
        else
            return 365;
    }
}
