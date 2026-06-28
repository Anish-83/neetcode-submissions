class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        List<Integer>[] frequency= new List[n+1];
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<=n;i++){
            frequency[i]= new ArrayList<>();
        }
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int key:map.keySet()){
            frequency[map.get(key)].add(key);
        }
       
        int res[] = new int[k];
        for(int i=n;i>=0;i--){
            if(frequency[i]!=null && k>0){
                for(int num:frequency[i]){
                    if(k>0)
                        res[--k]=num;
                    else
                        return res;
                }
            }
        }
        return res;
    }
}
