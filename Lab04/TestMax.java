public class TestMax {
    /** Main method */
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Author: JealousGx");
        System.out.println("-------------------");
        int i = 5;
        int j = 2;
        int k = max(i, j);
        System.out.println("The maximum between " + i + " and " + j + " is " + k);
    }
  
    /** Return the max between two numbers */
    public static int max(int num1, int num2) {
      if (num1 > num2)
        return num1;
      else
        return num2;
    }
  }
  