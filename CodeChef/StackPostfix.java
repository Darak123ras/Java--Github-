// https://www.codechef.com/learn/course/stacks-and-queues/LSTACKS02/problems/STACK07

public class StackPostfix {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    String expression=sc.next();
		    System.out.println(helper(expression));
		}

	}
	private static String helper(String str){
	    Stack<Character> stack=new Stack<>();
	    int n=str.length();
	    if(n==0) return str;
	    if(n==1){
	        return str;
	    }
	    stack.push(str.charAt(0));
	    int i=1;
	    String res="";
	    Stack<Character> arithmetic=new Stack<>();
	    while(!stack.isEmpty()){
	        char c=str.charAt(i);
	        if(c=='('){
	            stack.push(c);
	        }else{
	            if(c>=97 && c<=122){
	                res+=String.valueOf(c);
	               // i++;
	            }
	            else if(c=='+' || c=='-' || c=='*' || c=='^' || c=='%' || c=='/'){
	                arithmetic.push(c);
	            }
	            if(c==')' && !stack.isEmpty()){
	                res+=String.valueOf(arithmetic.pop());
	               // arithmetic.pop();
	                stack.pop();
	            }
	        }
	        i++;
	    }
	    return res;
	    
	}
}
