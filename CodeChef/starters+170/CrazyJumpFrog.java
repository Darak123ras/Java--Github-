// https://www.codechef.com/problems/FROGS_JUMP

public class CrazyJumpFrog {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		List<Pair<Integer, List<Integer>>> tc = new ArrayList<>();

        while(t-->0) {
            int n = sc.nextInt();
            List<Integer> a=new ArrayList<>();
            for (int j = 0; j < n; j++) {
                a.add(sc.nextInt());
            }
            tc.add(new Pair<>(n,a));
        }

        List<Integer> r = helper(t, tc);

        for (int i=0;i<r.size();i++) {
            System.out.println(r.get(i));
        }

        sc.close();
    }
    private static List<Integer> helper(int t,List<Pair<Integer,List<Integer>>> tc){
        List<Integer> r = new ArrayList<>();

        for(Pair<Integer,List<Integer>> x : tc) {
            
            List<Integer> list = x.getValue();
            int n = x.getKey();
            
            int even = even(list);
            int odd = odd(list);
            // for (int i:list) {
            //     if(i%2!=0) {
            //         odd++;
            //     } else {
            //         even++;
            //     }
            // }
            r.add(Math.max(even,odd));
        }

        return r;
    }
    private static int even(List<Integer> list){
        int count=0;
        for(int num:list){
            if(num%2==0) count++;
        }
        return count;
    }
    private static int odd(List<Integer> list){
        int count=0;
        for(int num:list){
            if(num%2!=0) count++;
        }
        return count;
    }

    public static class Pair<K, V> {
        private final K key;
        private final V value;
        
        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }
        public V getValue() {
            return value;
        }
        public K getKey() {
            return key;
        }
    }
}
