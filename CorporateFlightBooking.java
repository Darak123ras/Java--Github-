/*
 * Problem statement
You have been given an array/list “BOOKINGS” of booking details of ‘N’ flights from 1 to ‘N’. Each booking detail contains three positive integers [first, last, seats] which represent a booking for flights “first” through “last” (inclusive) with “seats” seats reserved for each flight in the range.

Now, you are supposed to return an array/list “ANSWER” of length ‘N’, where answer[i] represents the total number of seats reserved for ith flight.

Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1 :
2
4 4
1 2 3
2 3 2
1 3 1
3 4 2 
1 1
1 1 7
Sample output 1 :
4 6 5 2
7
Explanation For Sample Input 1 :
For the first test case,
Flight labels:               1   2   3   4
Booking 1 reserved:          3   3
Booking 2 reserved:              2   2
Booking 3 reserved:          1   1   1
Booking 4 reserved:                  2   2    
Total seats:                 4   6   5   2
Hence, answer = [4, 6, 5, 2].

For the second test case, there is only one flight and single booking detail. So, answer = [7].
Sample Input 2 :
2
3 2
1 2 2
2 3 3
2 1
1 2 1
Sample output 2 :
2 5 3
1 1
Explanation For Sample Input 2 :
For the first test case,
Flight labels:              1   2   3
Booking 1 reserved:         2   2
Booking 2 reserved:             3   3
Total seats:                2   5   3
Hence, answer = [2, 5, 3].

For the second test case, answer = [1, 1].
 */
// TCS, CISCO, Infosys

import java.util.ArrayList;

public class CorporateFlightBooking {
     public static ArrayList < Integer > corpFlightBookings(ArrayList < ArrayList < Integer >> bookings, int n) {
        // Write your code here.
        int[] ans=new int[n+1];

        for(ArrayList<Integer> booking:bookings){
            int first=booking.get(0);
            int last=booking.get(1);
            int seats=booking.get(2);

            ans[first-1]+=seats;
            if(last<n){
                ans[last]-=seats;
            }
        }

        for(int i=1;i<n;i++){
            ans[i]+=ans[i-1];
        }
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<n;i++){
            result.add(ans[i]);
        }
        return result;
    }
}
