class Solution {

    public String encode(List<String> strs) {
        StringBuilder res= new StringBuilder();

        for(String s:strs)
            res.append(s.length()+"@"+s);
        
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>(); 
        int i=0;
        while(i<str.length()){
            int hashIndex=str.indexOf("@",i);
            int sizeOfString= Integer.parseInt(str.substring(i,hashIndex));
            
            StringBuilder sb = new StringBuilder();

            for(int j= hashIndex+1; j<hashIndex+sizeOfString+1; j++){
                sb.append(str.charAt(j));
            } 
            res.add(sb.toString());
            i=hashIndex+sizeOfString+1;
        }
        return res;
    }
}
