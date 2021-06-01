public class Test {
    public static void main(String[] args) {
      System.out.println("------------------");
      System.out.println("Author: JealousGx");
      System.out.println("------------------");
  
      SimpleCircle circle1 = new SimpleCircle();
      System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());
  
      // Create a circle with radius 25
      SimpleCircle circle2 = new SimpleCircle(25);
      System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
  
      SimpleCircle circle3 = new SimpleCircle(125);
      System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());
  
      // Modify circle radius
      circle2.radius = 100;
      System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());


    //   Class activity
    SimpleCircle circle10 = new SimpleCircle(10);
    System.out.println("\n\nThe area of the circle of radius " + circle10.radius + " is " + circle10.getArea());
    System.out.println("The perimeter of the circle of radius " + circle10.radius + " is " + circle10.getPerimeter());

    circle10.setRadius(100);
    System.out.println("\nThe area of the circle of radius " + circle10.radius + " is " + circle10.getArea());
    System.out.println("The perimeter of the circle of radius " + circle10.radius + " is " + circle10.getPerimeter());

    }
  }
  
  // Define the circle class with two constructors
  class SimpleCircle {
    double radius; //All variables should be declared or initialized with in class but outside of constructor or method.
  
    /** Construct a circle with radius 1 */
    SimpleCircle() {
      radius = 1;
    }
  
    /** Construct a circle with a specified radius */
    SimpleCircle(double newRadius) {
      radius = newRadius;
    }
  
    /** Return the area of this circle */
    double getArea() {
      return radius * radius * Math.PI;
    }
  
    /** Return the perimeter of this circle */
    double getPerimeter() {
      return 2 * radius * Math.PI;
    }
  
    /** Set a new radius for this circle */
    void setRadius(double newRadius) {
      radius = newRadius;
    }
  }
  