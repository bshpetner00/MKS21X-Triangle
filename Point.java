public class Point{
  private double x,y;

  public Point(double X, double Y){
    x = X;
    y = Y;
  }

  public Point(Point p){
    x = p.x;
    y = p.y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }
  public double distanceTo(Point p2) {
    double xdist = Math.pow((p2.getX() - x), 2);
    double ydist = Math.pow((p2.getY() - y), 2);
    return Math.sqrt(xdist + ydist);
  }
  public static double distance(Point p1, Point p2) {
    double xdist = Math.pow((p2.getX() - p1.getX()), 2);
    double ydist = Math.pow((p2.getY() - p1.getY()), 2);
    return Math.sqrt(xdist + ydist);
  }
  public String toString(){
    return "(" + this.getX() + "," + this.getY() + ")";
  }
}
