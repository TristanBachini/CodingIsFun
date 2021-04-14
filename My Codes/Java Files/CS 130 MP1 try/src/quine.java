import java.util.Scanner;

public class quine {

	static int [][] sameArray = new int[1100][1100];
	static int [][] quineFinalArray = new int[1100][1100];
	static int [][] quineFinalBinaryArray = new int [1100][1100];
	static int [][] binaryStorage = new int[1100][10];
	static int recursive  = 0;
	static int quineRows = 1;
	static int compareTo; //removed compareTo
	static int numberOfVar;

	public static int[][] quineFinalArray(int element, int row, int column)
	{
		if(row==-3)
		{
			quineFinalArray[0][column]=element;
		}
		return quineFinalArray;
	}
	public static int[][] tab (int[][] array)
	{
		int[][] array1 = new int [1100][1100];
		for(int i = 0; i <1100;i++)
		{
			for(int j = 0;j<1100;j++)
			{
				array1[i][j]=-5;
			}
		}
		for(int i = 0; i <1100;i++)
		{
			for(int j = 0;j<1100;j++)
			{
				array1[i][j]=array[i][j];
			}
		}
		
		while(recursive < 11)//test
		{
			int straightToQuineFinal = 1;
			int sameArrayRow = 0;
			for(int i = 0; i <1100;i++)
			{
				for(int j = 0;j<1100;j++)
				{
					sameArray[i][j]=-5;
				}
			}
			
			for(int i = 0; i<1100;i++)
			{

				for(int j = 0;j<1090;j++)
				{
					int same = 1;
					for(int k = 0; k<10;k++)
					{
						if(array1[i][k]!=array1[j][k])
						{
							same -=1;
						}
						if(same==0&&k==9)
						{
							int checkSame = 1;
							if(i>0)
							{
								for(int p = 0; p<10;p++)
								{
									int r = p;
									if(array1[i][p]!=array1[compareTo][r])
									{
										checkSame-=1;
									}
								}
							}
							if(checkSame != 1)
							{
								compareTo = i;
								//binary copy
								for(int l = 0; l < 10; l++)
								{
									if(array1[i][l]!=array1[j][l])
									{
										sameArray[sameArrayRow][l]=2;
									}
									else
									{
										sameArray[sameArrayRow][l] = array1[i][l];
									}

								}
								//minterm copy
								for(int q = 10; array1[i][q]!=-5;q++)
								{
									sameArray[sameArrayRow][q]=array1[i][q];
								}
								for(int q = 10; array1[j][q]!=-5;q++)
								{
									int s = 0;
									while(array1[i][s]!=-5)
									{
										s++;
									}
									s-=10;
									sameArray[sameArrayRow][q+s]=array1[j][q];
								}
								sameArrayRow +=1;
							}

						}
						
					}
				}
				if(array1[i][0]==-5)
				{
					straightToQuineFinal =0;
				}
				int k = 1;
				if(straightToQuineFinal==1)
				{
					for(int l = 0; array1[l][0]!= -5;l++)
					{
						int saem = 1;
						for(int y =0; y<10;y++)
						{
							if(array1[i][y]!=array1[l][y])
							{
								saem -=1;
							}
							if(saem ==0&&y==9)
							{
								k = 0;
							}
						}
					}
					if(k==1)
					{
						int quineFinalColumn = 0;
						for(int t = 10; array1[i][t]!= -5; t++)
						{
							quineFinalArray[quineRows][quineFinalColumn]=array1[i][t];
							quineFinalColumn+=1;
							//test
						}
						for(int t = 0; t <10; t++)
						{
							binaryStorage[quineRows][t]=array1[i][t];
						}
						
						quineRows +=1;
					}
					
				}
			}			
			recursive +=1;
			if(recursive==10)
			{
				System.out.println("This will be the simplified boolean algebraic expression: ");
				convertToBoolean();	
			}
			tab(sameArray);
		}
		return array;
	}
	public static void convertToBoolean()
	{
		int maxRowQuine=0;
		int quineFinalBinaryArrayRow = 0;
		for(int i = 1; quineFinalArray[i][0]!= -5; i++)
		{
			maxRowQuine = i;
		}
		while(maxRowQuine>0)
		{
			int same = 1;
			for(int y = 0; quineFinalArray[maxRowQuine][y]!=-5;y++)
			{
				for(int j = 0; j<1025;j++)
				{
					if(quineFinalArray[maxRowQuine][y]==quineFinalArray[0][j])
					{
						quineFinalArray[0][j]=-5;
						same -=1;
					}
				}
			}
			if(same<1)
			{
				for(int i = 0;i<10;i++)
				{
					quineFinalBinaryArray[quineFinalBinaryArrayRow][i] = binaryStorage[maxRowQuine][i];
				}
				quineFinalBinaryArrayRow+=1;
			}
			
			maxRowQuine -=1;
		}
		
		
		System.out.println(express(quineFinalBinaryArray));
		
	}
	
	public static String express(int[][] arr) {
		String exp = new String();
		int count, prev;
		
		for(int i = 0; i < arr.length; i++) {
			count = i + 1;
			prev = i;
			
			if(arr[i][0] == -5) break;
			
			if(count > prev && prev != 0) {
				exp += " + ";
			}
			
			for(int j = numberOfVar; j < arr[i].length; j++) {	
				if(arr[i][j] == 1) {
					if(j == numberOfVar) {
						exp += "A";
					}
					else if(j == numberOfVar + 1) {
						exp += "B";
					}
					else if(j == numberOfVar + 2) {
						exp += "C";
					}
					else if(j == numberOfVar + 3) {
						exp += "D";
					}
					else if(j == numberOfVar + 4) {
						exp += "E";
					}
					else if(j == numberOfVar + 5) {
						exp += "F";
					}
					else if(j == numberOfVar + 6) {
						exp += "G";
					}
					else if(j == numberOfVar + 7) {
						exp += "H";
					}
					else if(j == numberOfVar + 8) {
						exp += "I";
					}
					else if(j == numberOfVar + 9) {
						exp += "J";
					}
				}
				
				else if(arr[i][j] == 0) {
					if(j == numberOfVar) {
						exp += "A'";
					}
					else if(j == numberOfVar + 1) {
						exp += "B'";
					}
					else if(j == numberOfVar + 2) {
						exp += "C'";
					}
					else if(j == numberOfVar + 3) {
						exp += "D'";
					}
					else if(j == numberOfVar + 4) {
						exp += "E'";
					}
					else if(j == numberOfVar + 5) {
						exp += "F'";
					}
					else if(j == numberOfVar + 6) {
						exp += "G'";
					}
					else if(j == numberOfVar + 7) {
						exp += "H'";
					}
					else if(j == numberOfVar + 8) {
						exp += "I'";
					}
					else if(j == numberOfVar + 9) {
						exp += "J'";
					}
				}
			}
		}
		return exp;
	}

	public static void start() {
		int rowSize = 1;
		int maxmo = 2;
		int minterm = 0;
		int var = 0;
		for(int i = 0; i < 1100; i++)
		{
			for(int j = 0; j < 1100; j++)
			{
				sameArray[i][j]=-5;
			}
		}
		for(int i = 0; i < 1100; i++)
		{
			for(int j = 0; j < 1100; j++)
			{
				quineFinalArray[i][j]=-5;
			}
		}
		for(int i = 0; i < 1100; i++)
		{
			for(int j = 0; j < 1100; j++)
			{
				quineFinalBinaryArray[i][j]=-5;
			}
		}
		for(int i = 0; i < 1100; i++)
		{
			for(int j = 0; j < 10; j++)
			{
				binaryStorage[i][j]=-5;
			}
		}
		
		System.out.println("Enter number of variables (1-10)");
		
		while(var>10 || var<1)
		{
			Scanner a = new Scanner(System.in);
			var = a.nextInt();
			if(var>10 || var<1)
			{
				System.out.println("Please select the number of variables from 1 to 10 only");
			}
			switch(var)
			{
				case 1:
					maxmo = 2;
					rowSize = 2;
					break;
				
				case 2:
					maxmo = 4;
					rowSize = 4;
					break;
					
				case 3:
					maxmo = 8;
					rowSize = 8;
					break;
					
				case 4:
					maxmo = 16;
					rowSize = 16;
					break;
					
				case 5:
					maxmo = 32;
					rowSize = 32;
					break;
					
				case 6:
				    maxmo = 64;
				    rowSize = 64;
				    break;
				    
				case 7:
					maxmo = 128;
					rowSize = 128;
					break;
					
				case 8:
					maxmo = 256;
					rowSize = 256;
					break;
					
				case 9:
					maxmo = 512;
					rowSize = 512;
					break;
					
				case 10:
					maxmo = 1024;
					rowSize = 1024;
					break;
			}
		}
		switch(var)
		{
			case 1:
				numberOfVar = 9;
				break;
			
			case 2:
				numberOfVar = 8;
				break;
				
			case 3:
				numberOfVar = 7;
				break;
				
			case 4:
				numberOfVar = 6;
				break;
				
			case 5:
				numberOfVar = 5;
				break;
				
			case 6:
				numberOfVar = 4;
				break;
				
			case 7:
				numberOfVar = 3;
				break;
				
			case 8:
				numberOfVar = 2;
				break;
				
			case 9:
				numberOfVar = 1;
				break;
				
			case 10:
				numberOfVar = 0;
				break;
		}
		rowSize =1100;
		
		int zeroCheck = 0;
		int[][] array = new int[rowSize][1100];
		for(int i = 0; i < rowSize; i++)
		{
			for(int j = 0; j < 1100; j++)
			{
				array[i][j]=-5;
			}
		}
		System.out.println("Enter the minterms (-1 to end): ");
		int row = 0;
		int mintermCheck = 0;
		
		while(minterm != -1)
		{
			int enterLoop = 1;
			Scanner b = new Scanner(System.in);
			int k = b.nextInt();
			
			minterm = k;
			array[row][10]=minterm;
			
			if(mintermCheck>=1)
			{
				for(int i = 0; i<mintermCheck;i++)
				{
					if(array[i][10]==minterm)
					{
						System.out.println("You've already entered this minterm!");
						enterLoop -=1;
					}
				}
			}
			if((minterm>= maxmo || minterm<0) && minterm != -1)
			{
				System.out.println("This minterm is out of bounds for the number of variables you've chosen");
				enterLoop -=1;
			}
			if(minterm == 0 && enterLoop==1)
			{
				zeroCheck += 1;
			}
			if(enterLoop==1)
			{
				if(minterm != -1)
				{
					double exponent = 9;
					int exponentInt = (int)exponent;
					while(exponent >= 0)
					{
						double highestNum = Math.pow(2.0,exponent);
						int highestNumInt = (int)highestNum;
						if(highestNumInt<=minterm)
						{
							switch(exponentInt)
							{
								case 0:
									array[row][9] = 1;
									break;
								case 1:
									array[row][8] = 1;
									break;
								case 2:
									array[row][7] = 1;
									break;
								case 3:
									array[row][6] = 1;
									break;
								case 4:
									array[row][5] = 1;
									break;
								case 5:
									array[row][4] = 1;
									break;
								case 6:
									array[row][3] = 1;
									break;
								case 7:
									array[row][2] = 1;
									break;
								case 8:
									array[row][1] = 1;
									break;
								case 9:
									array[row][0] = 1;
									break;
									
							}
							minterm = minterm - highestNumInt;
						}
						else
						{
							switch(exponentInt)
							{
							case 0:
								array[row][9] = 0;
								break;
							case 1:
								array[row][8] = 0;
								break;
							case 2:
								array[row][7] = 0;
								break;
							case 3:
								array[row][6] = 0;
								break;
							case 4:
								array[row][5] = 0;
								break;
							case 5:
								array[row][4] = 0;
								break;
							case 6:
								array[row][3] = 0;
								break;
							case 7:
								array[row][2] = 0;
								break;
							case 8:
								array[row][1] = 0;
								break;
							case 9:
								array[row][0] = 0;
								break;
							}
						}
						exponentInt--;
						exponent--;	
					}
					row++;
					mintermCheck++;	
				}
			}
		}
		for(int i = 0; i<rowSize;i++)
		{
			for(int j = 0; j<1100;j++)
			{
				if(i>=row)
				{
					array[i][j]=-5;
				}
				if(j>10)
				{
					array[i][j]=-5;
				}
			}
		}
		int column = 0;
		for(int i = 0;i<row;i++)
		{
			quineFinalArray(array[i][10],-3,column);
			column++;
		}
		tab(array);
	}
	public static void main(String [] args )
	{
		System.out.println("----------WELCOME TO THE QUINE-McCLUSKEY SOLVER----------");
		System.out.println("|1. Start.											    |");
		System.out.println("|2. Quit.											    |");
		System.out.println("---------------------------------------------------------");
		System.out.print("Choice: ");
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				start();
				break;
			case 2:
				System.out.println("Thank you for using the program. Have a nice day! :)");
				sc.close();
				System.exit(0);
			default:
				System.out.print("Enter valid choice: ");
				break;
			}
		}
	}
}
