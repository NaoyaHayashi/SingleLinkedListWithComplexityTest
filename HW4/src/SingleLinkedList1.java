//--------------------------------------------------------------------------------------------------
// SingleLinkedList1 can insert at or remove from the front of a list.
// SingleLinkedList1 can work only as Stack.
//--------------------------------------------------------------------------------------------------
public class SingleLinkedList1 implements ISimpleList1{
		
	private class NodeA{
		int    value;
		NodeA   next; 
		
		private NodeA(){
			value = 0;
			next = null;
		}
	}
	
	// instance variables
	// this node acts like a 'head' of a list
	private NodeA first;
	// 'size' keeps track of the number of Nodes(elements) of a linked list
	private int size;
	
	
	//--------------------------------------------------------------------------------------------------
	// SingleLinkedList2: Construct an object without parameters (Default Constructor)
	//--------------------------------------------------------------------------------------------------
	public SingleLinkedList1(){
		first = null;
		size = 0;
	}
	
	
	//--------------------------------------------------------------------------------------------------
	// SingleLinkedList1(int val): Construct an object with val
	//--------------------------------------------------------------------------------------------------
	public SingleLinkedList1(int val){
		first = new NodeA();
		first.value = val;
		size = 1;
	}
	

	//--------------------------------------------------------------------------------------------------
	// void insertFront(int item): Insert a Node with an item at the front of a list
	//--------------------------------------------------------------------------------------------------
	public void insertFront(int item){
		// increment the size
		size++;
		
		// Save the previous first
		NodeA oldfirst = first;
		
		// Create the new node
		NodeA newfirst = new NodeA();
		newfirst.value = item;
		newfirst.next = oldfirst;
		
		// Set the new node as the first node
		first = newfirst;
	}
	
	
	//--------------------------------------------------------------------------------------------------
	// int removeFront(): Remove the Node at the front of a list, and return the int value of the Node
	// Note: This function possiblly throws a NullPointerException
	//--------------------------------------------------------------------------------------------------
	public int removeFront() throws NullPointerException{
		/* TODO: this operation crashes if the list is empty; consider
		 * adding some error checking to make sure that does not happen.
		 */
		if(first == null){
			throw new NullPointerException("ERROR: Can't remove an element from an empty list!!");
		}
		
		// decrement the size
		size--;
		
		// Save the previous first
		NodeA oldfirst = first;
		
		// Follow the first's node (possibly empty)
		// and set the first to that pointer
		first = oldfirst.next;
		
		// Return the value of old first 
		return oldfirst.value;
	}
	
	
	//--------------------------------------------------------------------------------------------------
	// int length(): Return the length of the list
	//--------------------------------------------------------------------------------------------------
	public int length(){
		return size;
	}

}
