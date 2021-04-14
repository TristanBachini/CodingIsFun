
public class CircularLinearList<E> {

	private Node<E> list = new Node<E>();
	

	
	//this method should print the elements of the list from left to right
	//public String toString() 
	
	public String toString() {
		
		
StringBuilder listString = new StringBuilder("( ");
		Node <E> temp = last;
        Node <E> current = last.getNext();
        
		boolean first = true;
		int i = 0;
		int k = 0;
		while (current != last && i == 0) 
		{
			if(last.getKey()  == null)
			{
				i = 1;
			}
			if (first && i == 0) 
			{
				listString.append(current.getKey());	
				first = false;
				k = 1;
			} // end if
		    if(first==false && i == 0 && k == 0)
			{
				listString.append(", " + current.getKey());
			} //end else
		    if(i==0)
		    {
		    	k = 0;
		    	current = current.getNext();
		    }
			
			
		}
		
		if(i==1)
		{
			listString.append(" )");
		}
		else
		{
			listString.append(", " + current.getKey());
			listString.append(" )");
		}
		
		
		
		
		return listString.toString();
	}
	public Node <E> last = new Node <E>(null);
	
	public void leftInsert(E key) 
	{
	
		if(last.getKey()==null)
		{
			last.setKey(key);
			last.setNext(last);

		}
		else
		{
			Node <E> temp = new Node <E>(key);
			temp.setNext(last.getNext());
			last.setNext(temp);
			
		}

		//complete this method
	}
	
	public void rightInsert(E key) {
		
		if(last.getKey() == null)
		{
			last.setKey(key);
			last.setNext(last);
		}
		else
		{
			Node <E> temp = new Node<E> (key);
			temp.setNext(last.getNext());
			last.setNext(temp);
			last = temp;

		}
		

		//complete this method
	}

	public E deleteLeft(){
		Node<E> print = last.getNext();
		if(last == null || last.getNext() == null)
		{
			last = null;
			if(last == null)
			{
				return null;
			}
			else
			{
				last = null;
				return print.getKey();
			}
			
		}
		Node <E> delete = last.getNext();
		last.setNext(delete.getNext());
		return delete.getKey();
	}

	public E deleteRight(){
		Node <E> print = last;
		Node <E> temp = last.getNext();
		Node <E> delete = last;
		if(last == null || last.getNext() == null)
		{
			last = null;
			if(last == null)
			{
				return null;
			}
			else
			{
				return delete.getKey();
			}
			
		}
		Node <E> prev = last.getNext();
		
		while(prev.getNext() != last)
		{
			prev = prev.getNext();
		}
		last = prev;
		last.setNext(temp);
		//complete this method
		return print.getKey();
	}
	
	
	public static void main(String[] args)
	{
		
		CircularLinearList<String> list = new CircularLinearList<String>();
		list.leftInsert("Hello");
		list.rightInsert("World");
		
		System.out.println(list);
		//Should print : (Hello, World)
		
		list.leftInsert("Computer");
		list.rightInsert("Science");
		System.out.println(list);
		
		System.out.println(list.deleteLeft()); 
		//Should print : Computer
		System.out.println(list);
		
		System.out.println(list.deleteRight()); 
		//Should print : Science
		
		System.out.println(list);
		
		
	}
}
