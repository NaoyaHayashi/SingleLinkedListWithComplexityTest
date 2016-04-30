
public class ResizeByOneStackOfInts implements IStack{
	private int[] s;
	private int N = 0;
 
	public ResizeByOneStackOfInts(){
		s = new int[0]; 
	} 
 
	public boolean isEmpty(){ 
		return N == 0;
	}
 
	public void push(int item){ 
		if(N >= s.length){
			resize(s.length + 1);
		}
		s[N++] = item;
	}
 
	public int pop(){
		return s[--N]; 
	}
 
 	private void resize(int newsize){
 		if(newsize >= s.length) {
 			int[] newarray = new int[newsize];
 			for(int i = 0; i < s.length; i++){
 				newarray[i] = s[i];
 			}
		 s = newarray;
 		}
 	}
}