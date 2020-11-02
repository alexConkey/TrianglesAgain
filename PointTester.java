public class PointTester {
  public static void main(String[] args) {
    Point myPoint = new Point(1, 1);
    Point myPoint2 = new Point(1, 3);
    Point myPoint3 = new Point(0, 1);
    Triangle myTriangle = new Triangle(myPoint, myPoint2, myPoint3);
    System.out.println(myPoint.equals(myPoint2));
    System.out.println(myTriangle.getPerimeter());
    System.out.println(myTriangle.getArea());
  }
}
