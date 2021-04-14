
public class Point {
	
	public double x;
	public double y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double distance(Point a) {
		
		return Math.sqrt(Math.pow(a.x-x, 2)+Math.pow(a.y-y, 2));
	}
	
	 

}
