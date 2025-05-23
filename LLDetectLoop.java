/*You are given the head of a singly linked list. Your task is to determine if the linked list contains a loop. 
A loop exists in a linked list if the next pointer of the last node points to any other node in the list (including itself), rather than being null.

Custom Input format:
A head of a singly linked list and a pos (1-based index) which denotes the position of the node to which the last node points to. 
If pos = 0, it means the last node points to null, indicating there is no loop.

Examples:

Input: head: 1 -> 3 -> 4, pos = 2
Output: true
Explanation: There exists a loop as last node is connected back to the second node.

Input: head: 1 -> 8 -> 3 -> 4, pos = 0
Output: false
Explanation: There exists no loop in given linked list.

Input: head: 1 -> 2 -> 3 -> 4, pos = 1
Output: true
Explanation: There exists a loop as last node is connected back to the first node.


Constraints:
1 ≤ number of nodes ≤ 104
1 ≤ node->data ≤ 103       
0 ≤ pos ≤ Number of nodes in Linked List

*/
// Paytm, VMWare, Accolite, Amazon, OYO Rooms, Samsung, Snapdeal, D-E-Shaw, Hike, MakeMyTrip, Walmart
// MAQ Software, Adobe, SAP Labs, Qualcomm, Veritas, Mahindra Comviva, Lybrate 


/* Node is defined as

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/
public class LLDetectLoop {
    public static boolean detectLoop(Node head) {
        // Add code here
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;         
            fast = fast.next.next;  
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}
