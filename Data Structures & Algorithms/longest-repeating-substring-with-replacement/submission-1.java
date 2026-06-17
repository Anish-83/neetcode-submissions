class Solution {
    public int characterReplacement(String s, int k) {
        int freq[] = new int[26];
        int maxF=0;
        int window=0;
        int maxW=0;
        int j=0;
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'A']++;
            maxF=Math.max(maxF,freq[s.charAt(i)-'A']);
            window=i-j+1;
            if(window-maxF>k){
                freq[s.charAt(j)-'A']--;
                j++;
            }
            window=i-j+1;
            maxW=Math.max(maxW,window);
        } 
        return maxW;
    }
}
