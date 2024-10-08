/*
 * Problem statement
You are given two binary search trees of integers having ‘N’ and ‘M’ nodes. Return an array that contains elements 
of both BST in sorted order.

A binary search tree (BST) is a binary tree data structure with the following properties.

• The left subtree of a node contains only nodes with data less than the node’s data.

• The right subtree of a node contains only nodes with data greater than the node’s data.

• Both the left and right subtrees must also be binary search trees.


Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
2 1 3 -1 -1 -1 -1
4 -1 -1
Sample Output 1:
1 2 3 4 
Explanation For Sample Output 1:
 The given BST are:-


The output will be 1 2 3 4
Sample Input 2:
4 2 7 -1 3 -1 -1 -1 -1  
5 1 7 -1 -1 -1 -1
Sample Output 2:
1 2 3 4 5 7 7 
Constraints:
1 <= 'N', 'M' <= 10^5

Time Limit: 1 sec
 */
// Amazon, Google, Josh, Flipkart, D.E.Shaw

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode() {
        this.data = 0;
        this.left = null;
        this.right = null;
    }
    TreeNode(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.data = val;
        this.left = left;
        this.right = right;
    }
};

public class MergeTwoBST {
    public static List<Integer> mergeBST(TreeNode root1, TreeNode root2) {
         // Write your code here.
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();

        inorderTraversal(root1,list1);
        inorderTraversal(root2,list2);

        return mergeTwoSortedLists(list1,list2);

    }
    private static void inorderTraversal(TreeNode root,List<Integer> list){
        if(root==null) return;
        inorderTraversal(root.left, list);
        list.add(root.data);
        inorderTraversal(root.right, list);
    }
    private static List<Integer> mergeTwoSortedLists(List<Integer> list1,List<Integer> list2){
        List<Integer> merge=new ArrayList<>();
        int i=0,j=0;
        while(i<list1.size() && j<list2.size()){
            if(list1.get(i)<=list2.get(j)){
                merge.add(list1.get(i));
                i++;
            }else{
                merge.add(list2.get(j));
                j++;
            }
        }
        while(i<list1.size()){
            merge.add(list1.get(i));
            i++;
        }
        while(j<list2.size()){
            merge.add(list2.get(j));
            j++;
        }
        return merge;

    }
}
