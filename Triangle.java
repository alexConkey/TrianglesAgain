public class Triangle {
  private Point v1, v2, v3;
  public Triangle(Point a, Point b, Point c) {
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public Triangle(double x1, double y1,double x2, double y2,double x3, double y3){
    v1 = new Point(x1, y1);
    v2 = new Point(x2, y2);
    v3 = new Point(x3, y3);
  }
  public double getPerimeter(){
    return v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1);
  }
  public double getArea(){
    double semiPerimeter = getPerimeter()/2;
    return Math.sqrt(semiPerimeter*(semiPerimeter-v1.distanceTo(v2))*(semiPerimeter-v1.distanceTo(v3))*(semiPerimeter-v2.distanceTo(v3)));
  }
  public String classify(){
    if (Math.round(v1.distanceTo(v2)*10000.0)/10000.0 == Math.round(v2.distanceTo(v3)*10000.0)/10000.0){
      if (Math.round(v1.distanceTo(v2)*10000.0)/10000.0 == Math.round(v1.distanceTo(v3)*10000.0)/10000.0){
        return "equilateral";
      }else{
        return "isosceles";
      }
    }else if (Math.round(v1.distanceTo(v2)*10000.0)/10000.0 == Math.round(v1.distanceTo(v3)*10000.0)/10000.0){
      return "isosceles";
    }else if (Math.round(v3.distanceTo(v2)*10000.0)/10000.0 == Math.round(v1.distanceTo(v3)*10000.0)/10000.0){
      return "isosceles";
    }else{
      return "scalene";
    }
  }
  public String toString(){
    return "v1(" + Double.toString(v1.getX()) + ", " + Double.toString(v1.getY()) + ") v2(" + Double.toString(v2.getX()) + ", " + Double.toString(v2.getY()) + ") v3(" + Double.toString(v3.getX()) + ", " + Double.toString(v3.getY()) + ")";
  }
  public void setVertex(int index, Point newP){
    if (index == 0){
      v1 = newP;
    }if (index == 1){
      v2 = newP;
    }if (index == 2){
      v3 = newP;
    }
  }
}
