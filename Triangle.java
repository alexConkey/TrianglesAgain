public class Triangle {
  private Point v1, v2, v3;
  public Triangle(Point a, Point b, Point c) {
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public Triangle(double x1, double y1,double x2, double y2,double x3, double y3){
    v1 = new Point(x1, y1);
    v1 = new Point(x1, y1);
    v1 = new Point(x1, y1);
  }
  public double getPerimeter(){
    return v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1);
  }
  public double getArea(){
    double semiPerimeter = getPerimeter()/2;
    return Math.sqrt(semiPerimeter*(semiPerimeter-v1.distanceTo(v2))*(semiPerimeter-v1.distanceTo(v3))*(semiPerimeter-v2.distanceTo(v3)));
  }
}
