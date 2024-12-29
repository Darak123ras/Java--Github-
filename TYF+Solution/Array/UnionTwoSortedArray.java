/*
 * Given two sorted arrays a[] and b[], where each array may contain duplicate elements , the task is to return the elements in the union of the two arrays in sorted order.

Union of two arrays can be defined as the set containing distinct common elements that are present in either of the arrays.
Examples:

Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3, 6, 7]
Output: 1 2 3 4 5 6 7
Explanation: Distinct elements including both the arrays are: 1 2 3 4 5 6 7.
Input: a[] = [2, 2, 3, 4, 5], b[] = [1, 1, 2, 3, 4]
Output: 1 2 3 4 5
Explanation: Distinct elements including both the arrays are: 1 2 3 4 5.
Input: a[] = [1, 1, 1, 1, 1], b[] = [2, 2, 2, 2, 2]
Output: 1 2
Explanation: Distinct elements including both the arrays are: 1 2.
Constraints:
1  <=  a.size(), b.size()  <=  105
-109  <=  a[i] , b[i]  <=  109
 */
// Amazon

public class UnionTwoSortedArray {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        ArrayList<Integer> list=new ArrayList<>();
        int n=a.length;
        int m=b.length;
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<n;i++) set.add(a[i]);
        for(int i=0;i<m;i++) set.add(b[i]);
        for(int i=0;i<(m+n);i++){
            if(set.isEmpty()) break;
            list.add(set.pollFirst());
        }
        return list;
    }
}
