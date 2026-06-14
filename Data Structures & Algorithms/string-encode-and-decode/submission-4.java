class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s:strs){
            sb.append(s.length()+"#"+s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int hashPos=str.indexOf('#',i);
            int stringSize=Integer.parseInt(str.substring(i,hashPos));
            res.add(str.substring(hashPos+1,hashPos+stringSize+1));
            i=hashPos+stringSize+1;
        }
        return res;
    }
}
