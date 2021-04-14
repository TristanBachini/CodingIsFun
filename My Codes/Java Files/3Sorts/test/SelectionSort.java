package test;

public class SelectionSort 
{
	public static void selectionSort(int arr[])
	{
		int rear = 0;
		int front = 1;
		int k = 1;
		int temp;
		
		while(rear<6)
		{
			while(front < 6)
			{
				if(arr[rear]>arr[front])
				{
					temp = arr[rear];
					arr[rear] = arr[front];
					arr[front] = temp;
				}
				front++;
			}
			k +=1;
			rear++;
			front = k;
		}
		

	}

}
