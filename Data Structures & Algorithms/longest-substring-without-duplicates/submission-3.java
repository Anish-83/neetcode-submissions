class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> hs= new HashSet<>();
        int maxLen=0;
        int j=0;
        for(int i=0;i<s.length();i++){
            while(!hs.add(s.charAt(i))){
                hs.remove(s.charAt(j));
                j++;
            }
            maxLen=Math.max(i-j+1,maxLen);
            hs.add(s.charAt(i));
        }
        return maxLen;
    }
}
