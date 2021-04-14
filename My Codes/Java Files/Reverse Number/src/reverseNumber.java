import java.util.*;

public class reverseNumber 
{
	
	public static long enterNumber()
	{
		
	
		System.out.println("Enter a positive number: ");
		Scanner number2 = new Scanner(System.in);
		
		long number = number2.nextInt();
		
		return number;
	}
	
	
	
	public static long backwardsNumber(long positiveNumber)
	{
		
		int numberOfDigits = 0;
		long positiveNumberCopy = positiveNumber;
		long digit;
		double exponent;
		long newNumber = 0;
		

		
		
		while(positiveNumber> 0)
		{
			positiveNumber /= 10;
			numberOfDigits++;
		}
		
		
		int numberOfDigitsCopy = numberOfDigits;
		while(numberOfDigitsCopy>0)
		{
			digit = positiveNumberCopy%10;
			exponent = digit*Math.pow(10, numberOfDigitsCopy-1);
			newNumber = newNumber + Math.round(exponent);
			positiveNumberCopy/=10;
			numberOfDigitsCopy--;
		}
	
		
		return newNumber;
	}
	
	public static long highestNumber(long positiveNumber)
	{
		long highestDigit = positiveNumber %10;
		long a;
		
		while(positiveNumber>0)
		{
			a = positiveNumber % 10;
			if(a>highestDigit)
			{
				highestDigit = a;
			}
			positiveNumber /= 10;
		}
		
		return highestDigit;
	}
	
	public static void exit()
	{
		Calendar today = Calendar.getInstance();
		String ampm;
		int month = today.get(Calendar.MONTH) + 1;
		int day = today.get(Calendar.DAY_OF_MONTH);
		int year = today.get(Calendar.YEAR);
		
		System.out.println("Goodbye, thank you for trying out my code!");
		String wordMonth = null;
		
		Date todaysDate = today.getTime();
		
		
		int hours = todaysDate.getHours();
		int minutes = todaysDate.getMinutes();
		int seconds = todaysDate.getSeconds();
		if(hours < 12)
		{
			ampm = "AM";
		}
		else
		{
			ampm = "PM";
			hours = hours - 12;
		}
		
		
		
		switch(month)
		{
		case 1:
			wordMonth = "January";
			break;
		case 2:
			wordMonth = "February";
			break;
		case 3:
			wordMonth = "March";
			break;
		case 4:
			wordMonth = "April";
			break;
		case 5:
			wordMonth = "May";
			break;
		case 6:
			wordMonth = "June";
			break;
		case 7:
			wordMonth = "July";
			break;
		case 8:
			wordMonth = "August";
			break;
		case 9:
			wordMonth = "September";
			break;
		case 10:
		    wordMonth = "October";
		    break;
		case 11:
			wordMonth = "November";
			break;
		case 12:
			wordMonth = "December";
			break;
		}
		if(minutes<10)
		{
			if(seconds<10)
			{
				System.out.println(wordMonth+" "+day+", "+year+"  " +hours+":"+"0"+minutes+":"+"0"+seconds+" "+ampm);
			}
			System.out.println(wordMonth+" "+day+", "+year+"  " +hours+":"+"0"+minutes+":"+seconds+" "+ampm);
		}
		if(seconds<10)
		{
			if(minutes>=10)
			{
				System.out.println(wordMonth+" "+day+", "+year+"  " +hours+":"+minutes+":"+"0"+seconds+" "+ampm);
			}
		}
		if(minutes>10 && seconds > 10)
		{
			System.out.println(wordMonth+" "+day+", "+year+"  " +hours+":"+minutes+":"+seconds+" "+ampm);
		}
		
		
	}
	public static void main(String[] args)
	{
		int choice = 0;
		long positiveNumber = -1;
		long reverseNumber;
		long highestNumber;
		
		
		
		while(choice != 4)
		{
			System.out.println("Enter the number of your choice: ");
			System.out.println("1. Enter a positive integer");
			System.out.println("2. Display the digit with the highest value");
			System.out.println("3. Display the number backwards");
			System.out.println("4. Quit");
			
			Scanner number1 = new Scanner(System.in);
			choice = number1.nextInt();
			
			switch(choice)
			{
			case 1:
				positiveNumber = enterNumber();
				break;
			case 2:
				if(positiveNumber <=0)
				{
					System.out.println("Enter a positive number first!");
					positiveNumber = enterNumber();
				}
				else
				{
				highestNumber = highestNumber(positiveNumber);
				System.out.println("The highest digit is: " + highestNumber);
				}
				break;
			case 3:
				if(positiveNumber <=0)
				{
					System.out.println("Enter a positive number first!");
					positiveNumber = enterNumber();
				}
				else
				{
					reverseNumber = backwardsNumber(positiveNumber);
					positiveNumber = reverseNumber;
					System.out.println("Your number reversed is: "+ reverseNumber);
				}
				break;
			case 4:
				exit();
				break;
			}
		}
		
	}
}
