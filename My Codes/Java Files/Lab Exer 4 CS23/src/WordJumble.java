import java.util.*;

public class WordJumble 
{
	
	
	public static void main(String[] args)
	{
		
		System.out.println("Enter a sentence: ");
		Scanner a = new Scanner(System.in);
		String k = a.nextLine();
		
		
		StringBuilder finalSentence = wordJumble(k);
		
		System.out.println(finalSentence);
		
	}
	
	public static StringBuilder wordJumble(String jumble)
	{
		String sentence = jumble;
		StringBuilder words = new StringBuilder();

		
		StringTokenizer token = new StringTokenizer(sentence);
		
		int tokenNumber = token.countTokens();
		int tokenNumberCopy = tokenNumber;
		boolean firstCharIsLetter;
		boolean firstCharIsLetter1;
		
		
		
		
		
		while(tokenNumber > 0)
		{
			String strings = token.nextToken();
			StringBuilder string = new StringBuilder(strings);
			int length = string.length();
			
			
			if(tokenNumber == tokenNumberCopy)
			{
				char check1 = string.charAt(0);
				firstCharIsLetter1 = Character.isLetter(check1);
				if(firstCharIsLetter1 == true)
				{
					char capital = string.charAt(0);
					capital = Character.toLowerCase(capital);
					string.insert(1, capital);
					string.deleteCharAt(0);
					
				}
			}
			
			
			for(int j = 0; j<length;j++)
				for(int k = 0; k < length; k++)
				{
					if(string.charAt(k) == 'A' || string.charAt(k) == 'a')
					{
						char a = string.charAt(k);
						if(Character.isUpperCase(a)==true)
						{
							string.deleteCharAt(k);
							string.append('A');
						}
						else
						{
							string.deleteCharAt(k);
							string.append('a');
						}
						
					}
					if(string.charAt(k) == 'E' || string.charAt(k) == 'e')
					{
						char a = string.charAt(k);
						if(Character.isUpperCase(a)==true)
						{
							string.deleteCharAt(k);
							string.append('E');
						}
						else
						{
							string.deleteCharAt(k);
							string.append('e');
						}
					}
					if(string.charAt(k) == 'I' || string.charAt(k) == 'i')
					{
						char a = string.charAt(k);
						if(Character.isUpperCase(a)==true)
						{
							string.deleteCharAt(k);
							string.append('I');
						}
						else
						{
							string.deleteCharAt(k);
							string.append('i');
						}
					}
					if(string.charAt(k) == 'O' || string.charAt(k) == 'o')
					{
						char a = string.charAt(k);
						if(Character.isUpperCase(a)==true)
						{
							string.deleteCharAt(k);
							string.append('O');
						}
						else
						{
							string.deleteCharAt(k);
							string.append('o');
						}
					}
					if(string.charAt(k) == 'U' || string.charAt(k) == 'u')
					{
						char a = string.charAt(k);
						if(Character.isUpperCase(a)==true)
						{
							string.deleteCharAt(k);
							string.append('U');
						}
						else
						{
							string.deleteCharAt(k);
							string.append('u');
						}
					}
				}
			words.append(string+" ");
			tokenNumber--;
		
		}
		
		char check = words.charAt(0);
		firstCharIsLetter = Character.isLetter(check);
		if(firstCharIsLetter == true)
		{
			char capital = words.charAt(0);
			capital = Character.toUpperCase(capital);
			words.insert(1, capital);
			words.deleteCharAt(0);
			
		}
		
		
		
		
		
		
		return words;
	}

}
