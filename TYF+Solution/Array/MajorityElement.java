// https://leetcode.com/problems/majority-element/description/

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int count=n/2;
        int trace=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums) map.put(i,map.getOrDefault(i,0)+1);
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int val=entry.getValue();
            if(val>count){
                trace=entry.getKey();
                count=val;
            }
        }
        return trace;
    }
}
