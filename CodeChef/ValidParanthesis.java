// https://www.codechef.com/learn/course/stacks-and-queues/LSTACKS02/problems/STACK05

public class ValidParanthesis {
    static final int MAX_SIZE = 101;
    static char[] a = new char[MAX_SIZE];
    static int top = -1;

    static void push(char ele) {
        if (top <= MAX_SIZE - 1) {
            a[++top] = ele;
        } else {
            System.out.println("Stack is full. Cannot push: " + ele);
        }
    }

    static char pop() {
        if (top >= 0) {
            char ele = a[top];
            top--;
            return ele;
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return '-';
        }
    }

    static boolean isEmpty() {
        return top == -1;
    }

    static boolean isFull() {
        return top >= MAX_SIZE;
    }

    static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')');
    }
    static char peek(){
        // if(top==-1) return '';
        return a[top];
    }

    static boolean isBalanced(String expression) {
        // Write your code here
        int n=expression.length();
        BalancedParentheses st=new BalancedParentheses();
        for(int i=0;i<n;i++){
            char c=expression.charAt(i);
            if(c=='(') st.push(c);
            else{
                if(st.isEmpty()) return false;
                else if(st.peek()=='(' && c==')'){
                    st.pop();
                }else return false;
            }
            
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String str = scanner.next();
            System.out.println(str + " : " + isBalanced(str));
        }
    }
}
