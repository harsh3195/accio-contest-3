// { Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SortAStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			GfG g=new GfG();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
		}
	}
}// } Driver Code Ends


/*Complete the function below*/
class GFG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		if(s == null || s.isEmpty()) {
		    return s;
		}
		
		Stack<Integer> s1 = new Stack<>();
		Integer topS = null;
		while (!s.isEmpty()) {
		    topS = s.pop();
		    while(!s1.isEmpty() && topS < s1.peek()) {
		        s.push(s1.pop());
		    }
		    s1.push(topS);
		}

		return s1;

	}
}