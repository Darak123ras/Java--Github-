/*
Given the head of a singly linked list, the task is to rotate the linked list anti-clockwise by k nodes, i.e., 
left-shift the linked list by k nodes, where k is a given positive integer smaller than or equal to length of the 
linked list.
Examples:
Input: linkedlist: 2->4->7->8->9 , k = 3
Output: 8->9->2->4->7
Explanation:
Rotate 1: 4 -> 7 -> 8 -> 9 -> 2
Rotate 2: 7 -> 8 -> 9 -> 2 -> 4
Rotate 3: 8 -> 9 -> 2 -> 4 -> 7
Input: linkedlist: 1->2->3->4->5->6->7->8 , k = 4
Output: 5->6->7->8->1->2->3->4
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)
Constraints:
1 <= number of nodes <= 103
1 <= node -> data <= 104
1 <= k <= number of nodes 
 */

public class KReverseLL {
    
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        if (head == null || k == 0) return head;

        // Initialize current and count the length of the list
        Node current = head;
        int length = 1;
        
        // Traverse the list to find the length
        while (current.next != null) {
            current = current.next;
            length++;
        }
        
        // If k is greater than or equal to the length of the list, no need to rotate
        if (k >= length) return head;
        
        // Make the linked list circular by connecting the last node to the head
        current.next = head;
        
        // Traverse the list to find the k-th node
        current = head;
        for (int i = 1; i < k; i++) {
            current = current.next;
        }
        
        // The k-th node will be the new tail of the rotated list
        Node newHead = current.next; // The (k+1)-th node will be the new head
        current.next = null; // Break the link to make it linear again
        
        return newHead;
    }
    
    // Helper function to print the list (for testing purposes)
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Example usage
    public static void main(String[] args) {
        KReverseLL solution = new KReverseLL();

        // Creating the linked list: 2 -> 4 -> 7 -> 8 -> 9
        Node head = new Node(2);
        head.next = new Node(4);
        head.next.next = new Node(7);
        head.next.next.next = new Node(8);
        head.next.next.next.next = new Node(9);

        int k = 3;

        // Rotate the list
        Node newHead = solution.rotate(head, k);

        // Print the rotated list
        printList(newHead);  // Output: 8 9 2 4 7
    }
}
