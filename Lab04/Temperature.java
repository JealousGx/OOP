public class Temperature {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Author: JealousGx");
        System.out.println("-------------------");

        System.out.println("Celcius     Fahrenheit  |  Fahrenheit     Celcius");
        System.out.println("-------------------------------------------------");
        double celcius = 40.0;
        for (double fahrenheit = 120.0; fahrenheit >= 30.0; fahrenheit -= 10) {
            System.out.printf("%-13.1f", celcius);
            System.out.printf("%-11.1f|   ", celciusToFahrenheit(celcius));

            System.out.printf("%-15.1f", fahrenheit);
            System.out.printf("%-12.2f\n", fahrenheitToCelcius(fahrenheit));
            celcius--;
        }
    }
    
    public static double celciusToFahrenheit(double celcius) {
        return ((9.0 / 5) * celcius + 32);
    }

    public static double fahrenheitToCelcius(double fahrenheit) {
        return ((5.0 / 9) * (fahrenheit - 32));
    }
}
