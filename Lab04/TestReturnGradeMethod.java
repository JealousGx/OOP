public class TestReturnGradeMethod {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Author: JealousGx");
        System.out.println("-------------------");
        System.out.print("The score is " + 78.5 + " & grade is " + getGrade(78.5));
        System.out.print("\nThe score is " + 59.5 + " & grade is " + getGrade(59.5));
    }
  
    public static char getGrade(double score) {
      if (score >= 90.0)
        return 'A';
      else if (score >= 80.0)
        return 'B';
      else if (score >= 70.0)
        return 'C';
      else if (score >= 60.0)
        return 'D';
      else
        return 'F';
    }
  }
  