public class NumOfPrimes {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Author: JealousGx");
        System.out.println("-------------------");
        final int NUMBERS_LESS_THAN = 10000;
        int count = 0;
        int num = 2;
        while (num < 10000) {
            if (PrimeNumberMethod.isPrime(num))
                count++;
            num++;
        }
        System.out.printf("Total number of prime numbers (1-10000): %d", count);
    }
}
