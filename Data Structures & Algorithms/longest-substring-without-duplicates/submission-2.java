class Solution {
    public int lengthOfLongestSubstring(String s) {
        int j=0;
        int max=0;
        int count=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),i);
                count++;
            }
            else{
                i=map.get(s.charAt(i));
                map.clear();
                count=0;
            }
            max=Math.max(count,max);
        }
        return max;
    }
}
