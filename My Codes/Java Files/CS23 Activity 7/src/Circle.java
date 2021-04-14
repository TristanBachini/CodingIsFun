
public class Circle extends Point {
	
	public double rad;

	
	public Circle (double x, double y, Point b) {
		super(x,y);
		
		Point a = new Point(x,y);
		rad = b.distance(a);
		// TODO Auto-generated constructor stub
	}
	
	public double parameter() {
		
		
		return 2*rad*Math.PI;
	}
	
	public double area() {
		
		return Math.pow(rad, 2)*Math.PI;
	}

}
