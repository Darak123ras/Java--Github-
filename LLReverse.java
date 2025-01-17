/*
 * Given the head of a linked list, the task is to reverse this list and return the reversed head.

Examples:

Input: head: 1 -> 2 -> 3 -> 4 -> NULL
Output: head: 4 -> 3 -> 2 -> 1 -> NULL
Explanation:

Input: head: 2 -> 7 -> 10 -> 9 -> 8 -> NULL
Output: head: 8 -> 9 -> 10 -> 7 -> 2 -> NULL
Explanation:

Input: head: 10 -> NULL
Output: 10 -> NULL
Explanation:

Constraints:
1 <= number of nodes, data of nodes <= 105
 */
//  Adobe, Amazon, Microsoft, D.E.Shaw, MakeMyTrip, Flipkart, Walmart, SAP Lab, Accolite, Intuit, Samsung, 
// PayTM, Snapdeal, VMWare, Zoho, Qualumm, Cisco, Cognizant, Goldman Scahs, Mahindra Comviva

public class LLReverse {
    Node reverseList(Node head) {
        // code here
        if(head==null || head.next==null) return head;
        Node cur=head.next;
        Node prev=head;
        while(cur!=null){
            Node temp=cur.next;
            // if(cur.next==null){
            //     curr.next=prev;
            // }
            cur.next=prev;
            if(prev==head){
                prev.next=null;
            }
            prev=cur;
            
            cur=temp;
        }
        head=prev;
        return head;
    }
}
