public class ResizeByDoublingStackOfInts implements IStack
{
 private int[] s;
 private int N = 0;
 
 public ResizeByDoublingStackOfInts()
 { s = new int[1]; } 
 
 public boolean isEmpty()
 { return N == 0; }
 
 public void push(int item)
 { if(N >= s.length)
	 resize(s.length * 2);
   s[N++] = item; }
 
 public int pop()
 { return s[--N]; }
 
 private void resize(int newsize)
 {
	 if(newsize >= s.length) {
		 int[] newarray = new int[newsize];
		 for(int i = 0; i < s.length; i++)
			 newarray[i] = s[i];
		 s = newarray;
	 }
 }
}