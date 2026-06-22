class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        List<Integer>[] frequencyList= new List[n+1];
        for(int i=0;i<n+1;i++){
            frequencyList[i]=new ArrayList<>();
        }
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Integer j:map.keySet()){
            frequencyList[map.get(j)].add(j);
        }

        int[] res= new int[k];
        
        for(int i=n;i>=0;i--){
            if(!frequencyList[i].isEmpty() && k>0){
                for(Integer s: frequencyList[i]){
                    if(k==0)return res;
                    
                    if(k>0){
                        res[--k]=s;
                    }
                }
            }
        }
        return res;
    }
}
