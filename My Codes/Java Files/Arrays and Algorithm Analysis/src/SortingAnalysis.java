import java.io.*;
import java.util.*;

public class SortingAnalysis 
{
	public static void insertionSort(String[] a) 
	{
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
	
	
	
	public static void mergeSort(String[] b)
	{
		int half = b.length/2;
		if(b.length>1)
		{
		
			String[] left = new String[half];
			String[] right;
			
			if((b.length) % 2 == 0)
			{
				right = new String[half];
			}
			else
			{
				right = new String[half+1];
			}
			
			for(int i = 0; i < left.length; i++)
			{
				left[i] = b[i];
			}
			for(int j = 0; j< right.length; j++)
			{
				right[j] = b[j+(half)];
			}
			
			mergeSort(left);
			mergeSort(right);
			merge(b,left,right);
		}
	}
	
	public static void merge(String[] b, String[] left, String[] right)
	{
		int a = 0;
		int c = 0;
		
		for(int i = 0; i<b.length; i++)
		{
			 if (c >= right.length || (a < left.length && left[a].compareTo(right[c]) < 0))
			    {
	                b[i] = left[a];
	                a++;
	            } 
			 else 
	            {
	                b[i] = right[c];
	                c++;
	            }
		}
	}
	
	public static void threeWayMergeSort(String[] b)
	{
		if(b.length>1)
		{
		
			String[] left = new String[b.length/3];
			String[] mid;
			String[] right;
			
			if((b.length) % 3 == 0)
			{
				mid = new String[b.length/3];
				right = new String[b.length/3];
			}
			if((b.length)%3 == 1)
			{
				mid = new String[b.length/3];
				right = new String[(b.length/3)+1];
			}
			else
			{
				mid = new String[b.length/3+1];
				right = new String[(b.length/3)+1];
			}
			
			for(int i = 0; i < left.length; i++)
			{
				left[i] = b[i];
			}
			for(int j = 0; j< right.length; j++)
			{
				right[j] = b[j+(b.length/3)];
			}
			for(int z = 0; z< mid.length; z++)
			{
				mid[z] = b[z+b.length/3];
			}
			threeWayMergeSort(left);
			threeWayMergeSort(mid);
			threeWayMergeSort(right);
			threeMerge(b,mid,left,right);
		}
	}
	
	public static void threeMerge(String[] b, String[] mid, String[] left, String[] right)
	{
		int a = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		
		for(int i = 0; i<(2*b.length)/3; i++)
		{
			if (c >= right.length || (a < left.length && left[a].compareTo(right[c]) < 0))
		    {
                b[i] = left[a];
                a++;
            } 
		 else 
            {
                b[i] = right[c];
                c++;
            }
		}
		String[] last= new String[b.length];
		
		for(int z = 0; z<b.length/3; z++)
		{
			if (d >= b.length || (e < mid.length && mid[e].compareTo(b[d]) < 0))
		    {
                last[z] = mid[a];
                e++;
            } 
		 else 
            {
                last[z] = b[d];
                d++;
            }
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
			long start1 = System.currentTimeMillis();
			insertionSort(words);
			long end1 = System.currentTimeMillis();
			long start2 = System.currentTimeMillis();
			mergeSort(words);
			long end2 = System.currentTimeMillis();
			long start3 = System.currentTimeMillis();
			threeWayMergeSort(words);
			long end3 = System.currentTimeMillis();
			System.out.println("Running time of insertion sort: "+ (end1 - start1) + "ms");
			System.out.println("Running time of merge sort: "+ (end2 - start2)+ "ms");
			System.out.println("Running time of three-way merge sort: "+ (end3 - start3)+ "ms");
			
			
		}
		catch(FileNotFoundException fileNotFoundException)
		{
			System.err.println("Error accessing file");
			System.exit(1);
		}
	}
}