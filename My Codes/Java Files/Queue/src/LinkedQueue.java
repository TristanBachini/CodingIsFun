public class LinkedQueue<E> implements Queue<E> {
	/** reference to the front of the queue */
	private Node<E> front;
	/** reference to the end of the queue */
	private Node<E> rear;
	/** size of the queue */
	private int size = 10;
	
	/**Inner class Node<E> here */
	/**A Node is the building block for a single-linked list */
	private static class Node<E> {
		//Data fields
		/** The reference to the data */
		private E data;
		/** The reference to the next node */
		private Node<E> next;
		
		/**
		 * creates a new node with a null next field.
		 * @param data the data stored
		 */
		private Node(E data) {
			this(data, null);
		}
		
		/**
		 * creates a new node that references another node
		 * @param data the data stored
		 * @param nodeRef the node referenced by new node
		 */
		private Node(E data, Node<E> nodeRef) {
			this.data = data;
			this.next = nodeRef;
		}
	}


	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	public boolean isEmpty() {
		if(front == null && rear == null)
		{
			return true;
				
		}
		return false;
	}

	
	public void enqueue(E element) {
		Node <E> z = new Node(element);
        if (rear == null)
        {
            front = z;
            rear = z;
        }
        else
        {
            rear.next = z;
            rear = z;
        }
        size++ ;
	}

	public E dequeue() throws QueueEmptyException {
		if (isEmpty() )
            throw new QueueEmptyException("Queue underflow");
        Node <E> z = front;
        front = front.next;        
        if (front == null)
            rear = null;
        size-- ;        
		return z.data;
	}

	
	public E front() throws QueueEmptyException {
		if(isEmpty())
		{
			throw new QueueEmptyException("Queue underflow.");
		}
		return null;
	}
	
}

