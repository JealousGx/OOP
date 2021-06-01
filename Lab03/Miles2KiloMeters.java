public class Miles2KiloMeters {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Author: JealousGx");
        System.out.println("-------------------");

        final double KILOMETERS_PER_MILE= 1.609;

        int j = 20;
        System.out.println("Miles      Kilometers   |   Kilometers     Miles     ");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%-13d%-8.3f", i, i * KILOMETERS_PER_MILE);
            System.out.print("   |   ");
            System.out.printf("%-15d%-11.3f\n", j, j / KILOMETERS_PER_MILE);
            j += 5;
        }
    }
}
