public class CircleWithStaticMembers {
    /** The radius of the circle */
    double radius;
  
    /** The number of the objects created */
    static int numberOfObjects = 0; //due to “static” word, this variable can be used/called into another class as “CircleWithStaticMembers.numberOfObjects”	
  
    /** Construct a circle with radius 1 */
    CircleWithStaticMembers() {
      radius = 1.0;
      numberOfObjects++;
    }
  
    /** Construct a circle with a specified radius */
    CircleWithStaticMembers(double newRadius) {
      radius = newRadius;
      numberOfObjects++;
    }
  
    /** Return numberOfObjects */
    static int getNumberOfObjects() {
      return numberOfObjects;
    }
  
    /** Return the area of this circle */
    double getArea() {
      return radius * radius * Math.PI;
    }
  }
  