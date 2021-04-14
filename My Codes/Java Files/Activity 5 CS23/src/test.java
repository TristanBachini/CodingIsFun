
public class test {
	private static int[] arr = {3, 5, 1, 2, 8, 4};

	
	public void setArr(int arr[])
	{
		this.arr = arr;
	}
	
	

	public static void main(String args[]){
		
		
		
		BubbleSort cls = new BubbleSort();
		cls.sort(arr);
		
		for(int i = 0; i < arr.length ; i++){
			System.out.println(arr[i]);
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		SelectionSort bro = new SelectionSort();
		bro.sort(arr);
		
		for(int i = 0; i < arr.length ; i++){
			System.out.println(arr[i]);
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		QuickSort brah = new QuickSort();
		brah.sort(arr);
		
		for(int i = 0; i < arr.length ; i++){
			System.out.println(arr[i]);
		}
		
		
		
	}
	

}
