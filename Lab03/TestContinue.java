public class TestContinue {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Author: JealousGx");
        System.out.println("-------------------");
        int sum = 0;
        int number = 0;
    
        while (number < 20) {
            number++;
            if (number == 10 || number == 11 || number == 12) continue;
            sum += number;
            System.out.println("The number is " + number);
            System.out.println("The sum is " + sum);
        }
    }
  }
  