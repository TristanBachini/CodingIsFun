
public class Heap {

	//Complete this method. This method gets the parent of index i
	private static int getParent(int i) {
		int parent = (i-1)/2;
		
		return parent;
	}

	//Complete this method. This method gets the left child of index i
	private static int getLeft(int i) {
		int leftChild = 2*i+1;
		
		return leftChild;
	}

	//Complete this method. This method gets the right child of index i
	private static int getRight(int i) {
		int rightChild = 2*i+2;
		
		return rightChild;
	}

	//Complete this method. This method does the maxHeapify operation on ith element of the heap
	public static void maxHeapify(int arr[], int heapSize, int i) {
		if(heapSize>0)
		{
			int lastParent = 0;
			int arrayGreatestNumber = 0;
			for(int j = 0; j<heapSize;j++)
			{
				if(arr[i]>arrayGreatestNumber)
				{
					arrayGreatestNumber = arr[j];
				}
			}
			
			for(int k = 0; k<heapSize;k++)
			{
				lastParent = getLeft(k);
				if(lastParent==heapSize)
				{
					lastParent = k;
					break;
				}
				lastParent = getRight(k);
				if(lastParent==heapSize)
				{
					lastParent = k;
					break;
				}
			}
			
			while(i<=lastParent)
			{
				if(getRight(i)<=heapSize)
				{
					if(arr[i]<arr[getLeft(i)] || arr[i]<arr[getRight(i)])
					{
						if(arr[getLeft(i)]>arr[getRight(i)])
						{
							int temp = arr[i];
							arr[i]=arr[getLeft(i)];
							arr[getLeft(i)] = temp;
						}
						else
						{
							int temp = arr[i];
							arr[i]=arr[getRight(i)];
							arr[getRight(i)]=temp;
						}
					}
				}
				else
				{
					if(arr[i]<arr[getLeft(i)])
					{
						int temp = arr[i];
						arr[i]=arr[getLeft(i)];
						arr[getLeft(i)] = temp;
					}
				}
				
				i+=1;
			}
			
			
			
			
			if(arr[0]==arrayGreatestNumber)
			{
				int temp = arr[heapSize];
				arr[heapSize]=arr[0];
				arr[0] = temp;
				heapSize -=1;
				maxHeapify(arr,heapSize,0);
			}
			else
			{
				maxHeapify(arr,heapSize,0);
			}
		}
	}
	
	//Complete this method. This method builds a max-heap from the arr[]
	public static void buildMaxHeap(int arr[]){
		int arraySize = arr.length-1;
		int lastParent =0;
		int arrayGreatestNumber = 0;
		for(int i = 0; i<arraySize;i++)
		{
			if(arr[i]>arrayGreatestNumber)
			{
				arrayGreatestNumber = arr[i];
			}
		}
		
		for(int i = 0; i<arraySize;i++)
		{
			lastParent = getLeft(i);
			if(lastParent==arraySize)
			{
				lastParent = i;
				break;
			}
			lastParent = getRight(i);
			if(lastParent==arraySize)
			{
				lastParent = i;
				break;
			}
		}
		
		int lastParentZero = 0;
		
		while(lastParentZero <= lastParent)
		{
			if(2*lastParentZero+2<=arraySize)
			{
				if(arr[lastParentZero]<arr[lastParentZero*2+1] || arr[lastParentZero]<arr[lastParentZero*2+2])
				{
					if(arr[getLeft(lastParentZero)]>arr[getRight(lastParentZero)])
					{
						int temp = arr[lastParentZero];
						arr[lastParentZero]=arr[getLeft(lastParentZero)];
						arr[getLeft(lastParentZero)]=temp;
					}
					else
					{
						int temp = arr[lastParentZero];
						arr[lastParentZero] = arr[getRight(lastParentZero)];
						arr[getRight(lastParentZero)]=temp;
					}
				}
			}
			else
			{
				if(arr[lastParentZero]<arr[getLeft(lastParentZero)])
				{
					int temp = arr[lastParentZero];
					arr[lastParentZero]=arr[getLeft(lastParentZero)];
					arr[getLeft(lastParentZero)]=temp;
				}
			}
			lastParentZero+=1;
		}
		
		if(arr[0]==arrayGreatestNumber)
		{
			int temp = arr[arraySize];
			arr[arraySize]=arr[0];
			arr[0] = temp;
			maxHeapify(arr,arraySize-1,0);
		}
		else
		{
			buildMaxHeap(arr);
		}
		
		

	}

	//Complete this method. This method sorts the array using heap sort
	public static void heapSort(int arr[]){
		int arraySize = arr.length-1;
		int lastParent =0;
		
		for(int i = 0; i<arraySize;i++)
		{
			lastParent = 2*i+1;
			if(lastParent==arraySize)
			{
				lastParent = i;
				break;
			}
		}
		
		buildMaxHeap(arr);
	}
	
	
	public static void main(String args[]) {
		int[] list = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
		heapSort(list);

		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
			//1 8 10 13 23 24 67 77 82 99 
		}
		System.out.println();
		
		int[] list1 = {13, 77, 24, 82, 1, 8, 10, 23, 99, 67};
		
		heapSort(list1);

		for (int i = 0; i < list1.length; i++) {
			System.out.print(list1[i] + " ");
			//1 8 10 13 23 24 67 77 82 99 
		}
	}

}
