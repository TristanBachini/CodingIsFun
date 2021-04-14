
public class Heap {

	//Complete this method. This method gets the parent of index i
	private static int getParent(int i) {
		return 0;
	}

	//Complete this method. This method gets the left child of index i
	private static int getLeft(int i) {
		return 0;
	}

	//Complete this method. This method gets the right child of index i
	private static int getRight(int i) {
		return 0;
	}

	//Complete this method. This method does the maxHeapify operation on ith element of the heap
	public static void maxHeapify(int arr[], int heapSize, int i) {
	
	}
	
	//Complete this method. This method builds a max-heap from the arr[]
	public static void buildMaxHeap(int arr[]){

	}

	//Complete this method. This method sorts the array using heap sort
	public static void heapSort(int arr[]){

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
