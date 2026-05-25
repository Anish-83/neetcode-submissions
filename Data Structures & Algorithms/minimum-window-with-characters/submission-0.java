class Solution {
    public String minWindow(String s, String t) {
       int freqT[]= new int[256];
        int freqS[]= new int[256];

        int left=0,right=0,minStart=0,minLen=Integer.MAX_VALUE;
        
        for(int i=0;i <t.length();i++){
            freqT[t.charAt(i)]++;
        }

        for(;right<s.length();right++){
            freqS[s.charAt(right)]++;
            while(contains(freqT,freqS)){
                if(right-left+1<minLen){
                    minLen=right-left+1;
                    minStart=left;
                }
                freqS[s.charAt(left)]--;
                left++;
            }
        }
        return minLen==Integer.MAX_VALUE? "":s.substring(minStart,minStart+minLen);
    }
    private boolean contains(int freqT[], int freqS[]){
        for(int i=0;i<256;i++){
            if(freqT[i]>freqS[i])
                return false;
        }
        return true;
    }
}
