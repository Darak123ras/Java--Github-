/*
 * Problem statement
You are given a binary tree having ‘N’ distinct nodes and an integer ‘M’, you have to return the postorder successor of ‘M’.

Note:

The postorder successor of ‘M’ is defined as the next element to ‘M’ in the sequence of postorder traversal.

If the postorder traversal of a tree is 3 5 4 7 then the postorder successor of 5 is the next element to 5 i.e 4.

Return ‘-1’ if there is no postorder successor of ‘M’.
Detailed explanation ( Input/output format, Notes, Images )
Sample Input:
1
1 2 3 -1 -1 -1 -1
3
Sample Output:
1
Explanation:
The postorder traversal of the tree is 2 3 1. So the postorder successor of 3 is 1.
Sample Input 2:
1
1 2 3 -1 4 -1 -1 5 6 -1 -1 -1 -1
5
Sample Output 2:
6
Explanation:
The postorder traversal of the tree is 5 6 4 2 3 1. So the postorder successor of 5 is 6.
 */
// Amazon, Infosys, LendingKart
import java.util.ArrayList;
import java.util.List;

// Following is the BinaryTreeNode class structure

class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;
    
    public BinaryTreeNode(T data) {
        this.data = data;
    }
}

public class PostoerderSuccessor {
    public static void postOrderTraversal(BinaryTreeNode<Integer> root,List<Integer> postOrder){
        if(root==null) return;
        postOrderTraversal(root.left,postOrder);
        postOrderTraversal(root.right, postOrder);
        postOrder.add(root.data);
    }
	public static int postOrderSuccessor(BinaryTreeNode<Integer> root, int M)
	{
        /* 
		  Your class should be named Solution.
	 	  Read input as specified in the question.
	 	  Print output as specified in the question.
		*/
        List<Integer> postOrder=new ArrayList<>();
        postOrderTraversal(root,postOrder);
        for(int i=0;i<postOrder.size();i++){
            if(postOrder.get(i)==M){
                if(i+1<postOrder.size()){
                    return postOrder.get(i+1);
                }else{
                    return -1;
                }
            }
        }
        return -1;

    }
}
