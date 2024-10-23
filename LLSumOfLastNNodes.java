/*
 * Given a single linked list, calculate the sum of the last n nodes.

Note: It is guaranteed that n <= number of nodes.

Examples:

Input: Linked List: 5->9->6->3->4->10, n = 3

Output: 17
Explanation: The sum of the last three nodes in the linked list is 3 + 4 + 10 = 17.
Input: Linked List: 1->2, n = 2

Output: 3
Explanation: The sum of the last two nodes in the linked list is 2 + 1 = 3.
Constraints:
1 <= number of nodes, n <= 105
1 <= node->data <= 103
 */


public class LLSumOfLastNNodes {
    // Return the sum of last k nodes
    public int sumOfLastN_Nodes(Node head, int n) {
        // write code here
        if(n==0 || head==null) return 0;
        int sum=0;
        int numOfNodes=0;
        Node curr=head;
        while(curr!=null){
            numOfNodes++;
            sum+=curr.data;
            curr=curr.next;
        }
        Node demo=head;
        int i=0;
        n=numOfNodes-n;
        while(demo!=null && i<n){
            sum-=demo.data;
            i++;
            demo=demo.next;
        }
        return sum;
    }
}
