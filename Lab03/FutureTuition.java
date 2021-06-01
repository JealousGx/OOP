public class FutureTuition {
    public static void main(String[] args) { 
      System.out.println("-------------------");
      System.out.println("Author: JealousGx");
      System.out.println("-------------------");
      double tuition = 10000;   // Year 1
      int year = 1;
      while (tuition < 20000) {
        tuition = tuition * 1.07;
        year++;
      }
    
      System.out.println("Tuition will be doubled in " + year + " years");
      System.out.printf("Tuition will be $%.2f in %1d years", tuition, year);
    }
  }
  