class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str.length()+"#"+str);
        }
        
        return sb.toString();
    }

    public List<String> decode(String str) {
     //4#neet  4#code4#love3#you
     //01 2345 6789   
        List<String> ls= new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int hashIndex = str.indexOf('#', i);
            int n = Integer.parseInt(str.substring(i, hashIndex));
            //int n=str.charAt(i) - '0';
            StringBuilder sb = new StringBuilder();
            for(int j=hashIndex+1;j<1+n+hashIndex;j++){
                sb.append(str.charAt(j));
            }
            ls.add(sb.toString());
            i=hashIndex+n+1;
        }
        return ls;
    }
}
