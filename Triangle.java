//Vishwaa helped me out with this one

public class Triangle {
	private Point v1,v2,v3;
	public Triangle(Point p1,Point p2,Point p3) {
		v1 = p1;
		v2 = p2;
		v3 = p3;
	}
	public Triangle(double x1,double y1,double x2,double y2,double x3,double y3) {
		v1 = new Point(x1,y1);
		v2 = new Point(x2,y2);
		v3 = new Point(x3,y3);
	}
	public double getPerimeter() {
		return v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1);
	}
	public Point getVertex(int greed) {
		int index = greed;
		if (index == 0) {
			return new Point(v1.getX(), v1.getY());
		}
		if (index == 1) {
			return new Point(v2.getX(), v2.getY());
		}
		if(index == 2) {
			return new Point(v3.getX(), v3.getY());
		}
		return new Point(v3.getX(), v3.getY());
	}
	public void setVertex(int wrath, Point vertex) {
		int index = wrath;
		if (index == 0) {
			v1 = vertex;
		}
		if (index == 1) {
			v2 = vertex;
		}
		if (index == 2) {
			v3 = vertex;
		}
	}
	public String toString() {
		return "Triangle: A"+v1+" B"+v2+" C"+v3;
	}
} 