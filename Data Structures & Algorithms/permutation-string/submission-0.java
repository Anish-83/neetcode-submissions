class Solution {
    public boolean checkInclusion(String s1, String s2) {
       int window=s1.length();
       int freq1[] = new int[26];
       for(int i=0;i<s1.length();i++){
        freq1[s1.charAt(i)-'a']++;
       }
       int freq2[] = new int[26];
        int j=0;
        for(int i=0;i<s2.length();i++){
           freq2[s2.charAt(i)-'a']++;
           if(i-j+1 > window){
                freq2[s2.charAt(j)-'a']--;
                j++;
           }
           if(Arrays.equals(freq1, freq2))
                return true;  
        }
        return false;     
    }
}