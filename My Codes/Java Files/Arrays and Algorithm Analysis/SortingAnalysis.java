import java.io.*;
import java.util.*;

public class SortingAnalysis 
{
	public static void insertionSort(String[] a) {
		int n = a.length;
		for(int i = 1; i < n; i++) {
			String cur = a[i];
			int j = i - 1;
			while((j >= 0) && (a[j].compareTo(cur) > 0)) {
				a[j + 1] = a[j--];
			} 
			a[j + 1] = cur;
		}
	}
	public static void main(String[] args)
	{
		final int NO_OF_WORDS = 50000;
		try
		{
			Scanner file = new Scanner(new File(args[0]));
			String[] words = new String[NO_OF_WORDS];
			
			int i = 0;
			while(file.hasNext() && i < NO_OF_WORDS)
			{
				words[i] = file.next();
				i++;
			}
			long start = System.currentTimeMillis();
			insertionSort(words);
			long end = System.currentTimeMillis();
			System.out.println("Sorted Words: ");
			for(int j = 0; j < words.length; j++)
			{
				System.out.println(words[j]);
			}
			System.out.print("Running time of insertion sort: "+ (end - start) + "ms");
			
		}
		catch(FileNotFoundException fileNotFoundException)
		{
			System.err.println("Error accessing file");
			System.exit(1);
		}
	}
}
