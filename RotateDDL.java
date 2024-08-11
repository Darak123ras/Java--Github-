/*
 * Problem statement
You are given a doubly-linked list with 'N' nodes, rotate the linked list counter-clockwise by 'K' nodes. 'K' is a positive integer and is smaller than the number of nodes in the linked list, that is 'N'.

A doubly linked List (DLL) contains an extra pointer, called the previous pointer, together with the next pointer and data which are there in the singly linked list such that both forward and backward navigation is possible.

For example
The given linked list is - 

If K = 3, then the list after rotating it by K nodes is:

Note:
1. The value of any node in the linked list will not be equal to -1.
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= T <= 5
1 <= N <= 3000
1 <= K < N
-10 ^ 7 <= data <= 10 ^ 7

 where ‘T’ is the total number of test cases, 'N' is the total number of nodes in the linked list and ‘data’ is the value of any node of the linked list.
Sample Input 1 :
2
4 3 9 1 7 8 -1
4
1 2 3 4 5 -1
2
Sample Output 1 :
7 8 4 3 9 1 
3 4 5 1 2
Explanation of The Sample Input 1:
For the first test case:
The given linked list is :
4 <-> 3 <->  9 <->  1 <-> 7 <-> 8 <-> NULL

And K = 4 therefore we have to rotate the linked list by 4 nodes. So after the rotation, list will become  
7 <-> 8 <->  4 <-> 3 <-> 9 <-> 1 <-> NULL

For the second test case:
The given linked list is 
1 <-> 2 <->  3 <->  4 <-> 5  <-> NULL                                                          
And K = 2 therefore we have to rotate the linked list by 2 nodes. So after the rotation, list will become  
3 <-> 4 <->  5 <-> 1 <-> 2 <-> NULL
Sample Input 2 :
2
6 2 4 2 1 4 -1
2
12 33 55 11 22 -1
3
Sample Output 2 :
4 2 1 4 6 2
11 22 12 33 55
 */
class DLLNode {
    int data;
	DLLNode next, prev;

	DLLNode(int data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}
public class RotateDDL {
    public static DLLNode rotateDLL(DLLNode head, int k) {
        if (head == null || k == 0) return head;

        DLLNode current = head;

        // Traverse to the K-th node
        int count = 1;
        while (count < k && current != null) {
            current = current.next;
            count++;
        }

        // current is now at the K-th node, which will become the new head
        DLLNode newHead = current.next;

        if (newHead == null) return head;  // No rotation needed as K == N

        // Break the link
        current.next = null;
        newHead.prev = null;

        // Traverse to the end of the list
        DLLNode tail = newHead;
        while (tail.next != null) {
            tail = tail.next;
        }

        // Connect the old tail with the old head
        tail.next = head;
        head.prev = tail;

        return newHead;
    }

    public static void printList(DLLNode head) {
        DLLNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example Test Cases

        // Test case 1
        DLLNode head1 = new DLLNode(4);
        head1.next = new DLLNode(3);
        head1.next.prev = head1;
        head1.next.next = new DLLNode(9);
        head1.next.next.prev = head1.next;
        head1.next.next.next = new DLLNode(1);
        head1.next.next.next.prev = head1.next.next;
        head1.next.next.next.next = new DLLNode(7);
        head1.next.next.next.next.prev = head1.next.next.next;
        head1.next.next.next.next.next = new DLLNode(8);
        head1.next.next.next.next.next.prev = head1.next.next.next.next;

        int k1 = 4;
        DLLNode newHead1 = rotateDLL(head1, k1);
        printList(newHead1); // Expected Output: 7 8 4 3 9 1

        // Test case 2
        DLLNode head2 = new DLLNode(1);
        head2.next = new DLLNode(2);
        head2.next.prev = head2;
        head2.next.next = new DLLNode(3);
        head2.next.next.prev = head2.next;
        head2.next.next.next = new DLLNode(4);
        head2.next.next.next.prev = head2.next.next;
        head2.next.next.next.next = new DLLNode(5);
        head2.next.next.next.next.prev = head2.next.next.next;

        int k2 = 2;
        DLLNode newHead2 = rotateDLL(head2, k2);
        printList(newHead2); // Expected Output: 3 4 5 1 2
    }
}
