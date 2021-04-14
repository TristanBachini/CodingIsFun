
public class Test {
	public static void main(String args[]){
		
		double finalScore = 0;
		Queue<String> queue = new ArrayQueue<String>();
		try{
			System.out.println(queue.dequeue());
		}catch(QueueEmptyException E){
			System.out.println("Test case 1 is correct.");
			finalScore += 5;
		}
		
		if(queue.size() == 0){
			System.out.println("Test case 2 is correct.");
			finalScore += 2.5;
		}
			
		if(queue.isEmpty()){
			System.out.println("Test case 3 is correct.");
			finalScore += 2.5;
		}

		try{
			System.out.println(queue.front());
		}catch(QueueEmptyException E){
			System.out.println("Test case 4 is correct.");
			finalScore += 5;
		}

		queue.enqueue("String 1");
		queue.enqueue("String 2");
		queue.enqueue("String 3");
		queue.enqueue("String 4");
		queue.enqueue("String 5");

		if(queue.size() == 5){
			System.out.println("Test case 5 is correct.");
			finalScore += 2.5;
		}
			
		if(!queue.isEmpty()){
			System.out.println("Test case 6 is correct.");
			finalScore += 2.5;
		}
		
		if(queue.front().equals("String 1")){
			System.out.println("Test case 7 is correct.");
			finalScore += 5;
		}

		if(queue.dequeue().equals("String 1")){
			System.out.println("Test case 8 is correct.");
			finalScore += 10;
		}
		
		queue.dequeue();
		queue.dequeue();
		queue.enqueue("String 6");
		queue.enqueue("String 7");
		
		if(queue.dequeue().equals("String 4")){
			System.out.println("Test case 9 is correct.");
			finalScore += 10;
		}
		
		if(queue.front().equals("String 5")){
			System.out.println("Test case 10 is correct.");
			finalScore += 5;
		}
		
		
		Queue<Integer> queue1 = new ArrayQueue<Integer>();
		if(queue1.isEmpty()){
			System.out.println("Test case 11 is correct.");
			finalScore += 2.5;
		}
		
		for(int i = 0 ; i < 10 ; i++){
			queue1.enqueue(i * i);
		}
		
		if(queue1.size() == 10){
			System.out.println("Test case 12 is correct.");
			finalScore += 2.5;
		}
		
		queue1.dequeue();
		queue1.dequeue();
		queue1.dequeue();
		
		if(queue1.front() == 9){
			System.out.println("Test case 13 is correct.");
			finalScore += 5;
		}
		
		queue1.enqueue(12345);
		queue1.enqueue(56789);
		queue1.dequeue();
		
		if(queue1.dequeue() == 16){
			System.out.println("Test case 14 is correct.");
			finalScore += 10;
		}

		if(queue1.dequeue() == 25){
			System.out.println("Test case 15 is correct.");
			finalScore += 10;
		}

		if(queue1.size() == 6){
			System.out.println("Test case 16 is correct.");
			finalScore += 2.5;
		}
		
		if(queue1.dequeue() == 36){
			System.out.println("Test case 17 is correct.");
			finalScore += 10;
		}
		
		for(int i = 0 ; i < 4 ; i++){
			queue1.dequeue();
		}
		
		if(queue1.dequeue() == 56789){
			System.out.println("Test case 18 is correct.");
			finalScore += 5;
		}
		

		if(queue1.isEmpty()){
			System.out.println("Test case 19 is correct.");
			finalScore += 2.5;
		}
		
		
		
		System.out.println("Your final score is: " + finalScore);
	}
}
