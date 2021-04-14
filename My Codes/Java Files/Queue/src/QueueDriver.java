/**
 * Driver for the queue class.
 * 
 * @author Richard Bryann Chua
 *
 */
import java.io.*;
import java.util.*;
public class QueueDriver {

	public static void main(String[] args) {
		Queue<Integer> q = new ArrayQueue<Integer>(10);
		
		for(int i = 0; i < 5; i++) {
			q.enqueue(i);			 
		}
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		
		for(int i = 0; i < 7; i++) {
			q.enqueue(i);
		}
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		
		Queue<String> q1 = new ArrayQueue<String>();
		q1.enqueue("Hello");
		q1.enqueue("World");
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		
		
		Queue<Integer> q2 = new LinkedQueue<Integer>();
		for(int i = 0; i < 7; i++) {
			q2.enqueue(i);			
		}
		System.out.println(q2.dequeue());
		System.out.println(q2.dequeue());
		System.out.println(q2.dequeue());
		System.out.println(q2.dequeue());
		System.out.println(q2.dequeue());
		System.out.println(q2.dequeue());
		System.out.println(q2.dequeue());
		
	}

}
