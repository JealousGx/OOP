public class Break {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Author: JealousGx");
        System.out.println("-------------------");
        int sum = 0;
        int number = 0;

        while (number < 20) {
        number++;
        sum += number;
        if (sum >= 100) break;
        }

        System.out.println("The number is " + number);
        System.out.println("The sum is " + sum);

    }
}
