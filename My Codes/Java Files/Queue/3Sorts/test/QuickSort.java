package test;

public class QuickSort 
{
	public static void quickSort(int arr[])
	{
		int rear = 0;
		int front = 1;
		int temp;
		while(rear<arr.length)
		{
			while(front < arr.length)
			{
				
				if(arr[rear]>arr[front])
				{
					temp = arr[rear];
					arr[rear] = arr[front];
					arr[front] = temp;
					front = rear;
				}
			    front++;
			}
			rear = rear + 1;
			front = rear + 1;
		}
			
	}

}
