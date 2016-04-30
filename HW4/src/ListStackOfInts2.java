public class ListStackOfInts2 implements IStack{
	private SingleLinkedList2 list;
	
	// TODO: complete this implementation
	//       by using SingleLinkedList2

	//--------------------------------------------------------------------------------------------------
	// ListStackOfInts2(): Construct an object without parameters (Default Constructor)
	//--------------------------------------------------------------------------------------------------
	public ListStackOfInts2(){
		list = new SingleLinkedList2();
	}
	
	
	//--------------------------------------------------------------------------------------------------
	// boolean isEmpty(): Return true if this stack doesn't contain an element; otherwise false
	//--------------------------------------------------------------------------------------------------
	public boolean isEmpty(){
		// TODO Auto-generated method stub
		return (list.length() == 0);
	}
	
	
	//--------------------------------------------------------------------------------------------------
	// void push(int item): Push an int element to this stack
	//--------------------------------------------------------------------------------------------------
	public void push(int item){
		// TODO Auto-generated method stub
		
		// Using insertFront method to mimic the behavior of stack
		list.insertFront(item);
	}
	
	
	//--------------------------------------------------------------------------------------------------
	// int pop(): Pop an int element to this stack
	// Note: This function possiblly throws a NullPointerException
	//--------------------------------------------------------------------------------------------------
	public int pop() throws NullPointerException{
		// TODO Auto-generated method stub
		
		try{
			return list.removeFront();
		}
		catch(NullPointerException e){
			throw e;
		}
	}

}
