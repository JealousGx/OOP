public class EstimatePI {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Author: JealousGx");
        System.out.println("-------------------");

        System.out.println("i       m(i)");
        System.out.println("-------------------");
        for (int i = 1; i <= 901; i += 100) {
            System.out.printf("%-8d", i);
            System.out.printf("%-8.4f\n", computePI(i));
        }
    }

    public static double computePI(double num) {
        double pi = 0;
        for (int i = 1; i <= num; i++) 
            pi += Math.pow(-1, i + 1) / ((2 * i) - 1);
        pi *= 4;
        return pi;
    }
}
