
public class HSDriver {
	public static void main(String args[]){
		int[] list = {99, 32, 67, 88, 11, 54, 59, 2, 97, 94};
		Heap.heapSort(list);

		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
			//2 11 32 54 59 67 88 94 97 99 
		}
		System.out.println();
		
		int[] list1 = {90, 56, 5, 85, 37, 100, 52, 19, 31, 83, 120, 78, 34, 75, 91, 253};
		
		Heap.heapSort(list1);

		for (int i = 0; i < list1.length; i++) {
			System.out.print(list1[i] + " ");
			//5 19 31 34 37 52 56 75 78 83 85 90 91 100 120 253 
		}
	}
}
