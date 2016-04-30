//--------------------------------------------------------------------------------------------------
// SingleLinkedList2 can insert at or remove from either the end or front of a list.
// In other words, SingleLinkedList2 has more functionality than SingleList1.
// SingleLinkedList2 can work both as Stack and Queue.
//--------------------------------------------------------------------------------------------------
public class SingleLinkedList2 implements ISimpleList2{
	
	private class NodeB{
		int    value;
		NodeB   next;
		
		private NodeB(){
			value = 0;
			next = null;
		}
	}
	
	// instance variables
	// first = head, last = tail
	private NodeB first;
	private NodeB last;    /* NOTE:	a node to the last element
									has been added! It must be updated. */
	private int size;
	
	//--------------------------------------------------------------------------------------------------
	// SingleLinkedList2: Construct an object without parameters (Default Constructor)
	//--------------------------------------------------------------------------------------------------
	public SingleLinkedList2(){
		first = null;
		last = null;
		size = 0;
	}
	
	//--------------------------------------------------------------------------------------------------
	// SingleLinkedList2(int val): Construct an object with val
	//--------------------------------------------------------------------------------------------------
	public SingleLinkedList2(int val){
		first = new NodeB();
		first.value = val;
		size = 1;
		last = first;
	}
	
	//--------------------------------------------------------------------------------------------------
	// void insertFront(int item): Insert a Node with an item at the front of a list
	//--------------------------------------------------------------------------------------------------
	public void insertFront(int item){
		// TODO Auto-generated method stub
		
		// If there is no element in the list, the program has to update
		// both head(first) and tail(last) pointers.
		if(size == 0){
			first = new NodeB();
			first.value = item;
			last = first;
		}
		// If the size is not 0 (i.e. 1 or more elements),
		// insertFront does exactly the same thing as List1's insertFront method.
		else{
			// Save the previous first
			NodeB oldfirst = first;
			
			// Create the new node
			NodeB newfirst = new NodeB();
			newfirst.value = item;
			newfirst.next = oldfirst;
				
			// Set the new node as the first node
			first = newfirst;
		}
		// increment the size after the insertion
		size++;
	}

	//--------------------------------------------------------------------------------------------------
	// int removeFront(): Remove the Node at the front of a list, and return the int value of the Node
	// Note: This function possiblly throws a NullPointerException
	//--------------------------------------------------------------------------------------------------
	public int removeFront() throws NullPointerException{
		// TODO Auto-generated method stub
		
		if(size <= 0){
			throw new NullPointerException("ERROR: Can't remove an element from an empty list!!");
		}
		else if(size == 1){
			int val = first.value;
			first = null;
			last = null;
			size--;
			return val;
		}
		else{
			size--;
			// Save the previous first
			NodeB oldfirst = first;
			
			// Follow the first's node (possibly empty)
			// and set the first to that pointer
			first = oldfirst.next;
			
			// Return the value of old first 
			return oldfirst.value;
		}
	}

	//--------------------------------------------------------------------------------------------------
	// void insertEnd(int item): Insert an Node with item at the end of a list.
	//--------------------------------------------------------------------------------------------------
	public void insertEnd(int item){
		// TODO Auto-generated method stub
		
		// If there is no element, insertEnd does the same thing as insertFront method.
		if(size == 0){
			insertFront(item);
			// no size increment needed in this case because
			// it's done by insertFront method.
		}
		else{
			last.next = new NodeB();
			last = last.next;
			last.value = item;
			size++;
		}
	}
	
	//--------------------------------------------------------------------------------------------------
	// int removeEnd(): Remove the Node at the end of a list, and return the int value of the Node
	// Note: This function possiblly throws a NullPointerException
	//       This function is costly. O(n) complexity.
	//--------------------------------------------------------------------------------------------------
	public int removeEnd() throws NullPointerException{
		// TODO Auto-generated method stub
		
		if(size <= 0){
			throw new NullPointerException("ERROR: Can't remove an element from an empty list!!");
		}
		// If there is only one element, removeEnd works the same way as removeFront
		else if(size == 1){
			return removeFront();
		}
		else{
			// store the last value to return at the end of this method
			int val = last.value;
			
			NodeB secondLast = first;
			// traverse all the way through until finding the pointer for the 'second last' Node
			while(secondLast.next.next != null){
				secondLast = secondLast.next;
			}
			secondLast.next = null;
			last = secondLast;
			size--;
			return val;
		}
	}
	
	//--------------------------------------------------------------------------------------------------
	// int length(): Return the length of the list
	//--------------------------------------------------------------------------------------------------
	public int length(){
		return size;
	}
	
}
