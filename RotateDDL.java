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

public class RotateDDL {
    
}
