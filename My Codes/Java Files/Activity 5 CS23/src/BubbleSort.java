
public class BubbleSort implements SortInterface
{
int[] arr = new int[100];
	
	public int[] getArr()
	{
		return this.arr;
	}
	
	public void sort(int arr[])
	{
		int rear = 0;
		int front = 1;
		int temp;
		int j = arr.length;
		
		while (j > 2)
		{
			while(front<j)
			{
				if(arr[rear]>arr[front])
				{
					temp = arr[rear];
					arr[rear] = arr[front];
					arr[front] = temp;
				}
				rear+=1;
				front +=1;
			}
			rear = 0;
			front = 1;
			j--;
		}
		printThisAlso();
	}
	
	@Override
	public void printThisAlso() {
		// TODO Auto-generated method stub
		System.out.println(print);
	}


}
