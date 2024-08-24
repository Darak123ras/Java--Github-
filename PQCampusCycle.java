/*
 * Problem statement
A school campus is represented as a 2D grid. The campus has N students and M cycles, and the number of students are less than or equal to the number of cycles. Each student and cycle is represented as a 2D coordinate (X, Y) on this grid.

Our goal is to assign exactly one cycle to each student. Among the available cycles and students, we choose the (student, cycle) pair with the shortest Manhattan distance between each other, and assign the cycle to that student. If there are multiple (student, cycle) pairs with the same shortest Manhattan distance, we choose the pair with the smallest student index; if there are multiple ways to do that, we choose the pair with the smallest cycle index. We repeat this process until a cycle is assigned to each student.

Given the description of the school campus, your task is to find the index (0-based) of the cycle that is assigned to each student.

The Manhattan distance between two points P1 and P2 is defined as D = |P1.X - P2.X| + |P1.Y - P2.Y| where X, Y represents the location of a point in both horizontal as well as vertical direction respectively from the origin(0,0).

Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= T <= 10
1 <= N , M <= 1000
0 <= Student[i][j] , Cycle[i][j] <= 10^4

All student and bike locations are distinct.

Where ‘T’ represents the number of test cases, ‘N’ represents the number of students, ‘M’ represents the number of cycles, ‘Student[i][j]’ represents the location of each student on the campus, and ‘Cycle[i][j]’ represents the location of each cycle in the campus.  

Time Limit: 1 sec
Sample Input 1:
2
2 2
0 0
2 1
1 2
3 3
2 2
1 1
2 1 
2 2
2 1
Sample Output 1:
1 0
0 1
Explanation 1:
For the first test case, 
Distance of Student 0 from Cycle 0  = |1-0| + |2-0| = 3
Distance of Student 0 from Cycle 1  = |3-0| + |3-0| = 6
Distance of Student 1 from Cycle 0  = |1-2| + |2-1| = 2
Distance of Student 0 from Cycle 0  = |1-0| + |2-0| = 3
Student 1 grabs Cycle 0 as it is closest (without ties), and Student 0 is assigned Cycle 1. So the output is [1, 0].

For the second test case, 
Distance of Student 0 from Cycle 0  = |2-1| + |2-1| = 2
Distance of Student 0 from Cycle 1  = |2-1| + |1-1| = 1
Distance of Student 1 from Cycle 0  = |2-2| + |2-1| = 1
Distance of Student 1 from Cycle 1  = |2-1| + |2-1| = 0
Student 1 grabs Cycle 1 as it is closest and Student 0 is assigned Cycle 0. So the output is [1, 0]
Sample Input 2:
2
3 3
0 0
1 1
2 0
1 0
2 2
2 1
2 3
0 1
2 0 
0 0
1 1
2 2
Sample Output 2:
 0 2 1
 0 1
 */
// Asked By: Facebook

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class PQCampusCycle {
    public static ArrayList<Integer> allocateCycles(ArrayList<ArrayList<Integer>> students, ArrayList<ArrayList<Integer>> cycles)
	{
		// Write your code here
		int n=students.size();
		int m=cycles.size();

		PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
			if(a[0]!=b[0]) return Integer.compare(a[0], b[0]);
			if(a[1]!=b[1]) return Integer.compare(a[1], b[1]);
			return Integer.compare(a[2], b[2]); 
		});

		for(int i=0;i<n;i++){
			int x1=students.get(i).get(0);
			int y1=students.get(i).get(1);
			for(int j=0;j<m;j++){
				int x2=cycles.get(j).get(0);
				int y2=cycles.get(j).get(1);
				int dist=Math.abs(x1-x2)+Math.abs(y1-y2);
				pq.offer(new int[]{dist,i,j});
			}
		}

		ArrayList<Integer> result=new ArrayList<>(Collections.nCopies(n,-1));
		boolean[] studentAssigned=new boolean[n];
		boolean[] cycleAssigned=new boolean[m];

		while(!pq.isEmpty()){
			int[] curr=pq.poll();
			// int distance=curr[0];
			int studentIdx=curr[1];
			int cycleIdx=curr[2];
			if(!studentAssigned[studentIdx] && !cycleAssigned[cycleIdx]){
				result.set(studentIdx,cycleIdx);
				studentAssigned[studentIdx]=true;
				cycleAssigned[cycleIdx]=true;
			}
		}
		return result;
	}
}
