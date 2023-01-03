public class RectangleDriver {

  public static void main(String[] args) {

    // create an instance of an object using the default constructor
    Rectangle r1 = new Rectangle();

    // create an instance of an object using the constructor with parameters
    Rectangle r2 = new Rectangle(5, 12);

    System.out.println(r1);   // prints the object using its toString() method
    System.out.println(r1.area());
    System.out.println(r1.perimeter());
    r1.scale(3);
    System.out.println("the rectangle is now scaled: \n" + r1);

    /* Add code to scale r2 by some factor and print area, perimeter as above*/

    System.out.println();
    System.out.println(r2); // before scaling
    System.out.println(r2.area());
    System.out.println(r2.perimeter());

    r2.scale(4);

    System.out.println("the rectangle is now scaled: \n" +r2); // after scaling


  }

}
