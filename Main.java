import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    // write solutions to problems here
    // prob 1:
    Circle cir1 = new Circle(10.1);
    Circle cir2 = new Circle(14.0);
    Circle cir3 = new Circle(20.5);

    System.out.println(cir1.toString());
    System.out.println(cir2.toString());
    System.out.println(cir3.toString());

    // prob 2:
    System.out.println("Type a number for length and width: ");
    Double widLen = sc.nextDouble();
    System.out.println("Type a length: ");
    Double length = sc.nextDouble();
    System.out.println("Type a width: ");
    Double width = sc.nextDouble();
    Rectangle rect1 = new Rectangle(widLen, widLen);
    Rectangle rect2 = new Rectangle (length, width);
    System.out.println(rect1.toString());
    System.out.println(rect2.toString());

    // prob 3:
    System.out.println("Type a side length: ");
    Double sideLength = sc.nextDouble();
    RegularPolygon tri = new RegularPolygon(sideLength);
    RegularPolygon square = new RegularPolygon(4, sideLength);
    System.out.println(tri.toString());
    System.out.println(square.toString());
  }
}
