
public class Driver {
	
	public static void main(String args[]) {
		ScientificNotation sn1 = new ScientificNotation(10.25);
		ScientificNotation sn2 = new ScientificNotation(456789);
		System.out.println(sn1);
		System.out.println(sn2);

		sn1.setPrecision(4);
		System.out.println(sn1);
		System.out.println(sn2);
		
		ScientificNotation sn3 = new ScientificNotation(1.3);
		System.out.println(sn3.add(sn1)); 

		System.out.println(sn1.subtract(sn2));
		System.out.println(sn1.multiply(sn3));
		System.out.println(sn1.divide(sn2));
		
		System.out.println(sn1.getSignificantFigures());
		
		
		ScientificNotation sn5 = new ScientificNotation(0.00125);
		ScientificNotation sn6 = new ScientificNotation(2000000000);
		ScientificNotation sn7 = new ScientificNotation(796000);
		ScientificNotation sn8 = new ScientificNotation(872);
		ScientificNotation sn9 = new ScientificNotation(90);
		ScientificNotation sn10 = new ScientificNotation(-0.4586);
		System.out.println(sn5);
		System.out.println(sn6);
		System.out.println(sn7);
		System.out.println(sn8);
		System.out.println(sn9);
		System.out.println(sn10); 
		
		sn6.setPrecision(-5);
		System.out.println(sn6);
	}

}
