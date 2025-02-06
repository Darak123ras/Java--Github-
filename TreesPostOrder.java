/*Given two arrays representing the inorder and preorder traversals of a binary tree, construct the tree and return the root node of the constructed tree.

Note: The output is written in postorder traversal.

Examples:

Input: inorder[] = [1, 6, 8, 7], preorder[] = [1, 6, 7, 8]
Output: [8, 7, 6, 1]
Explanation: The tree will look like

Input: inorder[] = [3, 1, 4, 0, 2, 5], preorder[] = [0, 1, 3, 4, 2, 5]
Output: [3, 4, 1, 5, 2, 0]
Explanation: The tree will look like

Input: inorder[] = [2, 5, 4, 1, 3], preorder[] = [1, 4, 5, 2, 3]
Output: [2, 5, 4, 3, 1]
Explanation: The tree will look like

Constraints:
1 ≤ number of nodes ≤ 103
0 ≤ nodes -> data ≤ 103
Both the inorder and preorder arrays contain unique values. */
// Amazon, Accolite, Microsoft


public class TreesPostOrder {
    static int preIndex = 0;
    static HashMap<Integer, Integer> inorderMap;
    public static Node buildTree(int inorder[], int preorder[]) {
        // code here
        preIndex = 0; 
        inorderMap = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        return constructTree(preorder, 0, inorder.length - 1);
    }
    private static Node constructTree(int[] preorder, int inStart, int inEnd) {
        if (inStart > inEnd) return null;

        int rootValue = preorder[preIndex++];
        Node root = new Node(rootValue);

        int inIndex = inorderMap.get(rootValue);

        root.left = constructTree(preorder, inStart, inIndex - 1);
        root.right = constructTree(preorder, inIndex + 1, inEnd);

        return root;
    }
}
