public class Increment {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Author: JealousGx");
        System.out.println("-------------------");
        int x = 1;
        System.out.println("Before the call, x is " + x);
        increment(x);
        System.out.println("after the call, x is " + x);
    }
  
    public static void increment(int n) {
      n++;
      System.out.println("n inside the method is " + n);
    }
  }
  