
public class CircularListTestCases {
	public static void main(String args[]){
		double score = 0;

		CircularLinearList<String> list = new CircularLinearList<String>();

		list.leftInsert("A");
		list.rightInsert("B");
		list.rightInsert("C");
		list.rightInsert("D");
		
		System.out.println("Test case 1: " + list);//4 points: prints A B C D
		
		if(list.deleteRight() == "D"){
			System.out.println("Test case 2 is correct.");
			score += 10;
		}
		
		if(list.deleteLeft() == "A"){
			System.out.println("Test case 3 is correct.");
			score += 10;
		}

		System.out.println("Test case 4: " + list);//4 points: prints B C

		list.rightInsert("E");
		list.leftInsert("F");
		list.rightInsert("G");
		list.leftInsert("H");

		if(list.deleteLeft() == "H"){
			System.out.println("Test case 5 is correct.");
			score += 10;
		}
		
		if(list.deleteRight() == "G"){
			System.out.println("Test case 6 is correct.");
			score += 10;
		}
		
		System.out.println("Test case 7: " + list);//4 points: prints F B C E

		CircularLinearList<Integer> list1 = new CircularLinearList<Integer>();
		
		list1.rightInsert(1);
		list1.leftInsert(2);
		list1.leftInsert(3);
		list1.leftInsert(4);

		list1.deleteRight();
		
		if(list1.deleteRight() == 2){
			System.out.println("Test case 8 is correct.");
			score += 10;
		}
		
		if(list1.deleteRight() == 3){
			System.out.println("Test case 9 is correct.");
			score += 10;
		}
		
		list1.deleteLeft();
		list1.rightInsert(5);
		list1.leftInsert(6);
		list1.leftInsert(7);
		list1.deleteLeft();

		if(list1.deleteLeft() == 6){
			System.out.println("Test case 10 is correct.");
			score += 10;
		}
		
		System.out.println("Test case 11: " + list1);//4 points: prints 5

		CircularLinearList<Integer> list2 = new CircularLinearList<Integer>();
		
		System.out.println("Test case 12: " + list2);//4 points: prints ( ) 

		if(list2.deleteLeft() == null){
			System.out.println("Test case 13 is correct.");
			score += 10;
		}

		System.out.println("Score is: " + score);
		System.out.println("Note: Output for toString() is checked manually.");
	}
}
