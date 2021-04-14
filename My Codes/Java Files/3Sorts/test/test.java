package test;

public class test {
	public static void main(String args[]){
		int arr[] = {3, 5, 1, 2, 8, 4};
		
		
		BubbleSort cls = new BubbleSort();
		cls.bubbleSort(arr);
		
		for(int i = 0; i < arr.length ; i++){
			System.out.println(arr[i]);
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		SelectionSort bro = new SelectionSort();
		bro.selectionSort(arr);
		
		for(int i = 0; i < arr.length ; i++){
			System.out.println(arr[i]);
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		QuickSort brah = new QuickSort();
		brah.quickSort(arr);
		
		for(int i = 0; i < arr.length ; i++){
			System.out.println(arr[i]);
		}
		
		
		
	}
	

}
