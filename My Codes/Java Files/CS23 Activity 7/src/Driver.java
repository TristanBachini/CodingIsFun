
public class Driver {
	
	public static void main(String args[]) {
		Point b = new Point(3,2);
		Point a = new Point(5,6);
		
		System.out.println("The distance from point a to point b is: " + a.distance(b));
		
		Circle c = new Circle(5,6,b);
		
		System.out.println("The parameter of the circle is: " + c.parameter());
		System.out.println("The area of the circle is: " + c.area());
		}

}

