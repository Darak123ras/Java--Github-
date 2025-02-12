/*
 * Given a BST and an integer k, the task is to find the kth smallest element in the BST. If there is no kth smallest element present then return -1.

Examples:

Input: root = [2, 1, 3], k = 2
    
Output: 2
Explanation: 2 is the 2nd smallest element in the BST.
Input: root = [2, 1, 3], k = 5
    
Output: -1
Explanation: There is no 5th smallest element in the BST as the size of BST is 3.
Input: root = [20, 8, 22, 4, 12, N, N, N, N, 10, 14], k = 3
     
Output: 10
Explanation: 10 is the 3rd smallest element in the BST.
Constraints:

1 <= number of nodes, k <= 105
1 <= node->data <= 105
 */
// Google, Amazon, Accolite


// User function Template for Java

// class Node
// {
//     int data;
//     Node left, right;

//     public Node(int d)
//     {
//         data = d;
//         left = right = null;
//     }
// }
public class BSTKthSmallest {
    // Return the Kth smallest element in the given BST
    public int kthSmallest(Node root, int k) {
        // Write your code here
        if(root==null) return -1;
        ArrayList<Integer> list=new ArrayList<>();
        helper(root,list);
        Collections.sort(list);
        if(list.size()<k) return -1;
        return list.get(k-1);
        
        
        
    }
    private static void helper(Node root,ArrayList<Integer> a){
        if(root==null) return; 
        a.add(root.data);
        helper(root.left,a);
        helper(root.right,a);
    }
}
