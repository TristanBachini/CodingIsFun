
public class TestInfixToPostfix {
	public static void main(String[] args){
			
		InfixToPostfix  itp = new InfixToPostfix("x + 5 * (2 - y)");
		System.out.println(itp.convertToPostFix() + "\n" + "x 5 2 y - * + \n\n");

		itp = new InfixToPostfix("z+12*20");
		System.out.println(itp.convertToPostFix() + "\n" + "z 12 20 * + \n\n");
		
		itp = new InfixToPostfix("a + b ^ (2 - c)");
		System.out.println(itp.convertToPostFix() + "\n" + "a b 2 c - ^ + \n\n");
		
		itp = new InfixToPostfix("hello * hi");
		System.out.println(itp.convertToPostFix() + "\n" + "hello hi * \n\n");

		itp = new InfixToPostfix("k - 20 ^ i");
		System.out.println(itp.convertToPostFix() + "\n" + "k 20 i ^ - \n\n");
		
		itp = new InfixToPostfix("10 ^ 20 ^ 4 -2");
		System.out.println(itp.convertToPostFix() + "\n" + "10 20 4 ^ ^ 2 - \n\n");
		
		itp = new InfixToPostfix("(var1 + var2)/2");
		System.out.println(itp.convertToPostFix() + "\n" + "var1 var2 + 2 / \n\n");

		itp = new InfixToPostfix("(a + b) * (c - d)");
		System.out.println(itp.convertToPostFix() + "\n" + "a b + c d - * \n\n");
		
		itp = new InfixToPostfix("10 +(20 ^ 4 -( 2 *a))");
		System.out.println(itp.convertToPostFix() + "\n" + "10 20 4 ^ 2 a * - + \n\n");
		
		itp = new InfixToPostfix("(87 - op ^ 3) ^ l");
		System.out.println(itp.convertToPostFix() + "\n" + "87 op 3 ^ - l ^ \n\n");

					
		
				
	}
	
	
}
