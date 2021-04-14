import java.util.*;
public class FindSuperNumber 
{
	


	public static String getSuper(String superDuper)
	{
		if(superDuper.length()>=1)
		{
			StringBuilder k = new StringBuilder(superDuper);
			for(int i = 0; i<k.length(); i+=2)
			{
				k.deleteCharAt(i);
				i = i - 1;
			}
			if(k.length()>1)
			{
				superDuper = k.toString();
				getSuper(superDuper);
			}
			if(k.length()==1)
			{
				superDuper = k.toString();
				return superDuper;
			}
			
		}
		return getSuper(superDuper);
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter a number: ");
		Scanner a = new Scanner(System.in);

		
		String superDuper = a.nextLine();
		
		String imSuper = getSuper(superDuper);
		
		
		
		
		System.out.println(imSuper);
		
		a.close();
	}

}
