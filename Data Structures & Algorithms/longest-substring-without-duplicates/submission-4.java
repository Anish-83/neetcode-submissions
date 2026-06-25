class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set= new HashSet<>();
        
        int j=0,len=0;
        for(int i=0;i<s.length();i++){
            while(!set.add(s.charAt(i))){
                set.remove(s.charAt(j));
                j++;
            }
            len=Math.max(i-j+1,len);
            set.add(s.charAt(i));
        }
        return len;
    }
}