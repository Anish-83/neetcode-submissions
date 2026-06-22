class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int length=0;
        int max=0;
        for(int n:set){
            if(!set.contains(n-1)){
                length=1;
                while(set.contains(n+length))
                    length++;
                max=Math.max(length,max);
            }
        }
        return max;
    }
}
