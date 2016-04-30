public class ListStackOfInts1 implements IStack{

	// TODO: complete this implementation
	//       by using SingleLinkedList1
	private SingleLinkedList1 list;
	
	
	//--------------------------------------------------------------------------------------------------
	// ListStackOfInts1(): Construct an object without parameters (Default Constructor)
	//--------------------------------------------------------------------------------------------------
	public ListStackOfInts1(){
		list = new SingleLinkedList1();
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
		
		// Since linked list doesn't need resize, simply using insert method
		list.insertFront(item);
		return;
	}

	
	//--------------------------------------------------------------------------------------------------
	// int pop(): Pop an int element to this stack
	// Note: This function possiblly throws a NullPointerException
	//--------------------------------------------------------------------------------------------------
	public int pop() throws NullPointerException{
		// TODO Auto-generated method stub
		
		try{
			//int val = list.removeFront();
			//return val;
			return list.removeFront();
		}
		catch(NullPointerException e){
			throw e;
		}
		
	}

}
