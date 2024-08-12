/*
 * Problem statement
You are given a Singly Linked List of integers. Return true if it has a cycle, else return false.
A cycle occurs when a node's next points back to a previous node in the list.

Example:
In the given linked list, there is a cycle, hence we return true.
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1 :
1 2 3 4 -1
1
Sample Output 1 :
true
Explanation of Sample Input 1:
The linked list given in the input is as follows:
Sample Input 2 :
1 2 3 4 -1
0
Sample Output 2 :
true
Explanation of Sample Input 2:
The linked list given in the input is as follows:
Sample Input 3 :
5 -1
-1
Sample Output 3 :
false
Explanation of Sample Input 3:
 The linked list given in the input is as follows:
Expected Time Complexity:
Try to solve this problem in O(n).
Expected Space Complexity:
Try to solve this problem in O(1).
Constraints :
0 <= n <= 10^6
-1 <= pos < n
-10^9 <= data <= 10^9 and data != -1
Where 'n' is the size of the singly linked list, 'pos' represents the position (0-indexed) in the linked list where 
the tail connects to, and 'data' is the Integer data of the singly linked list.

Time Limit: 1 sec
 */

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class CyclicDetectionSLL {
    public static boolean detectCycle(Node head) {
        if (head == null || head.next == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;         // Move slow pointer by 1
            fast = fast.next.next;    // Move fast pointer by 2

            if (slow == fast) {       // If they meet, there's a cycle
                return true;
            }
        }

        return false;  // No cycle detected
    }

    public static void main(String[] args) {
        // Test case 1
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = head1.next; // Creates a cycle

        System.out.println(detectCycle(head1)); // Expected output: true

        // Test case 2
        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);
        head2.next.next.next = new Node(4);

        System.out.println(detectCycle(head2)); // Expected output: false

        // Test case 3
        Node head3 = new Node(5);

        System.out.println(detectCycle(head3)); // Expected output: false
    }
}
