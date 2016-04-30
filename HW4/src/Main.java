
/* CMPT 225 - CODE EXERCISE (May 27th):
 * 
 * - implement SingleLinkedList2, where you need to:
 *     -- implement the same operations as SingleLinkedList1, except you
 *        now need to maintain both the pointer *first* and *last*
 *     -- add an implementation for the operations of insertion and
 *        removal at the end of the list
 *        
 *  - once that is done, implement the ListStackOfInts class
 */


public class Main{
	public static void main(String[] args){
	  // This part of the code is used to test the insert and remove methods.
	  // Since this part is unnecessary for the comparison test, I'll comment it out.
	  /*
	  SingleLinkedList2 listA = new SingleLinkedList2();
	  listA.insertEnd(140);
	  listA.insertEnd(788);
	  listA.insertEnd(5379);
	  listA.insertEnd(20);
	  try{
		  System.out.println(listA.removeEnd() + " is removed");
		  System.out.println(listA.removeEnd() + " is removed");
		  System.out.println(listA.removeEnd() + " is removed");
		  System.out.println(listA.removeEnd() + " is removed");
		  // System.out.println(listA.removeFront() + "is removed");
	  }
	  catch(NullPointerException e){
		  System.out.println(e.getMessage());
		  System.out.println("Program unexpectedly terminates...");
		  System.exit(1);
	  }*/
	  
		
	  final IStack stackA = new ResizeByOneStackOfInts();
	  final IStack stackB = new ResizeByDoublingStackOfInts();
	  final IStack stackC = new ListStackOfInts1();
	  final IStack stackD = new ListStackOfInts2();
	  
	  final int MAX_PUSHES = 1000000;
	  // multiply by ten
	  final int MULT_PUSHES = 10; 
	  
	  System.out.printf("%-25s%-25s%-25s%-25s%-25s\n", "# of N", "BY_ONE", "BY_DOUBLING", "BY_LIST1", "BY_LIST2");
	  for(int pushes=1; pushes <= MAX_PUSHES; pushes = pushes*MULT_PUSHES) {
		  System.out.printf("%-25d", pushes);
		  System.out.printf("%-25f", timeStack(stackA, pushes));
		  System.out.printf("%-25f", timeStack(stackB, pushes));
		  System.out.printf("%-25f", timeStack(stackC, pushes));
		  System.out.printf("%-25f\n", timeStack(stackD, pushes));
	  }
	  
	  System.out.println("The Program Ends...");
	  System.exit(0);
	}
	
	
	/* Function to time how long it takes to makes a sequence
	 * of pushes to the stack.
	 */
	public static double timeStack(IStack stack, int pushes)
	{
		Stopwatch watch = new Stopwatch();
		for(int i = 1; i <= pushes; i++){
			stack.push(i);
		}
		return watch.elapsedTime();
	}
	
}