/*
 * Problem statement
You are the receptionist at a hotel which has 10 floors, numbered from 0 to 9 and each floor has 26 rooms named from ‘A’ to ‘Z’. Being a receptionist your task is to handle booking queries.

You get booking queries in the form of strings of size 3 where 1st character is ‘+’ means room is booked, or ‘-’ means room is freed. Second character represents the floor of the room i.e, ‘0’ to ‘9’. Third character represents the room name i.e, ‘A’ to ‘Z’.

On booking of each room you collect 1 coin from the customer. After the end of all the booking queries you have to count the number of coins you collected.

You may assume that the list describes a correct sequence of bookings in chronological order i.e., only free rooms can be booked, and only booked rooms can be freed.

For Example:-

Consider booking queries to be ["+1A", "+3E", "-1A", "+4F", "+1A", "-3E"]
+1A: Room A on the 1st floor is booked and you collected 1 coin.
+3E: Room E on the 3rd floor is booked and you collected 1 coin.
-1A: Room A on the 1st floor is freed.
+4F: Room F on the 4th floor is booked and you collected 1 coin.
+1A: Room A on the 1st floor is booked and you collected 1 coin.
-3E: Room E on the 3rd floor is freed.
So you collected 4 coins.
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= T <= 10^2
0 <= N <= 6*10^2
|query.length| = 3

Time Limit: 1 sec
Sample Input 1:
2
6
+1A +3E -1A +4F +1A -3E
3
+0A +0B +0C
Sample Output 1:
4
3
Explanation For Sample Input 1:
Test Case 1: Please refer to the example above.

Test Case 2: Room 0A, 0B & 0C is booked so we collected 3 coins.
Sample Input 2:
2
4
+8D -8D +8D -8D
7
+3C +2B +7K -2B +6C -3C +5S
Sample Output 2:
2
5
 */
// Barclays, VMWare, Walmart

import java.util.List;

public class HotelFloors {
    public static int hotelBookings(List<String> queries)
  {
      // Write your code here.
      int n=queries.size();
      if(n==0) return 0;
      int count=0;
      for(int i=0;i<n;i++){
        String str=queries.get(i);
        char ch=str.charAt(0);
        if(ch=='+') count++;
      }
      return count;
  }
}
