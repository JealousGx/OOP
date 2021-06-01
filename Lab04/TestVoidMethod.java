public class TestVoidMethod {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Author: JealousGx");
        System.out.println("-------------------");
        System.out.print("The score is " + 78.5 + " & grade is ");
        printGrade(78.5); // void type method can’t be used with println or assigned to variable
    
        System.out.print("The score is " + 59.5 + " & grade is ");
        printGrade(59.5);
    }
  
    public static void printGrade(double score) {
      if (score >= 90.0) {
        System.out.println('A');
      } 
      else if (score >= 80.0) {
        System.out.println('B');
      } 
      else if (score >= 70.0) {
        System.out.println('C');
      } 
      else if (score >= 60.0) {
        System.out.println('D');
      } 
      else {
        System.out.println('F');
      }
    }
  }
  