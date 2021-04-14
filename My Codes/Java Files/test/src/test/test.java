package test;

public class test {
	public static void main(String args[]){
		int arr[] = {3, 5, 1, 2, 8, 4};
	    bubbleSort(arr);
		
		for(int i = 0; i < arr.length ; i++){
			System.out.println(arr[i]);
		}
		
		
		
	}
	

	
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
	
	public static void bubbleSort(int arr[])
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
	}
	
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
