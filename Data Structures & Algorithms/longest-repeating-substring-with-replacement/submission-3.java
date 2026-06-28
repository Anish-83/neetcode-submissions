class Solution {
    public int characterReplacement(String s, int k) {
        int i=0,j=0,maxFreq=0,maxLen=0;
        int[] freq= new int[26];
        for(;i<s.length();i++){
            freq[s.charAt(i)-'A']++;
            maxFreq=Math.max(maxFreq,freq[s.charAt(i)-'A']);
            while((i-j+1)-maxFreq>k){
                freq[s.charAt(j)-'A']--;
                j++;
            }
            maxLen=Math.max(i-j+1,maxLen);

        }
        return maxLen;
    }
}
