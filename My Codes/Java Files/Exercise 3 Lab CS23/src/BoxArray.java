import java.util.*;
public class BoxArray 
{
	
	public static int check = 0;
	
	public static void main(String [] args)
	{
		System.out.println("Enter a letter: ");
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);
		
		char[][] array1 = new char [5][5];
		array1[0][0] = 'm';
		array1[0][1] = 'b';
		array1[0][2] = 'c';
		array1[0][3] = 'd';
		array1[0][4] = 'b';
		array1[1][0] = 'a';
		array1[1][1] = 'd';
		array1[1][2] = 'c';
		array1[1][3] = 'a';
		array1[1][4] = 'b';
		array1[2][0] = 'c';
		array1[2][1] = 'f';
		array1[2][2] = 'd';
		array1[2][3] = 'g';
		array1[2][4] = 'g';
		array1[3][0] = 'f';
		array1[3][1] = 'e';
		array1[3][2] = 'm';
		array1[3][3] = 'b';
		array1[3][4] = 'c';
		array1[4][0] = 'd';
		array1[4][1] = 'd';
		array1[4][2] = 'f';
		array1[4][3] = 'f';
		array1[4][4] = 'c';
		
		
		
		int row = charArea(array1,ch);
		check += 1;
		int column = charArea(array1,ch);
		
		System.out.println(row + "X" + column);
		if(column == 0 && row == 0)
		{
			System.out.println("0");
		}
	}
	
	public static int charArea(char [][] grid, char ch)
	{
		int row = 0;
		int column = 0;
		int r = 0;
		int n = 0;
		int c = -1;
		
		if(check == 0)
		{
			for(int i = 0;i<5;i++)
			{
				for(int j = 0; j<5;j++)
				{
					if(grid[i][j]==ch)
					{
						row = i+1;
					}
				}
			}
			for(int l = 0;l<5;l++)
			{
				for(int m = 0; m<5;m++)
				{
					if(grid[l][m]==ch)
					{
						n = m;
						m = 5;
					}
				}
				if(grid[l][n]==ch)
				{
					break;
				}
				r++;
			}
			if(r != 5)
			{
				row = row - r;
			}
		}
		
		if(check == 1)
		{
			for(int i = 0;i<5;i++)
			{
				for(int j = 0; j<5;j++)
				{
					if(grid[i][j]==ch)
					{
						if(j>=column)
						{
							column = j;
						}
					}
				}
			}
			column += 1;
			for(int l = 0;l<5;l++)
			{
				for(int m = 0; m<5;m++)
				{
					if(grid[l][m]==ch)
					{
						if(c==-1)
						{
							c = m;
						}
						if(c>m)
						{
							c = m;
						}
					}
				}
			}
			if(c ==-1)
			{
				c = 1;
			}
			column = column - c;
		}
			
		return row + column;
		
	}

}
