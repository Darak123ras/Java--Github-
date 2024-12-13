// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/seven-segment-display-nov-easy-e7f87ce0/

public class SevenSegmentDisplay {
    static int[] matchsticks = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String n=sc.next();
            System.out.println(helper(n));
        }
        sc.close();
    }
    private static String helper(String n){
        int total = 0;
        for (char digit : n.toCharArray()) {
            total += matchsticks[digit - '0'];
        }
        StringBuilder result = new StringBuilder();
        if (total % 2 != 0) {
            result.append('7');
            total -= 3;
        }
        while (total > 0) {
            result.append('1');
            total -= 2;
        }

        return result.toString();
    }
}
