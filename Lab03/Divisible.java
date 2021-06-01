public class Divisible {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Author: JealousGx");
        System.out.println("-------------------");
        final int NUMBERS_PER_LINE = 10;

        int countNums = 0;
        int num = 100;
        System.out.println("The prime numbers between (100 - 1000) are: ");
        while (num <= 1000) {
            if ((num % 5 == 0) && (num % 6 == 0)) {
                countNums++;
                if (countNums % NUMBERS_PER_LINE == 0) 
                    System.out.println(num);
                else
                    System.out.print(num + " ");
            }
            num++;
        }
    }
}
