class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> res= new ArrayList<>();
        int size=nums.length;
        int j=0;
       
        for(int i=0;i<=size-k;i++){
            
            int n=findMax(nums,i,k);
            res.add(n);
        }
        int arr[] = new int[res.size()];
        for(int i=0;i<res.size();i++){
            arr[i]=res.get(i);
        }
        return arr;

    }
    private int findMax(int nums[],int i, int k){
        int max=Integer.MIN_VALUE;
        while(k>0){
            max=Math.max(nums[i++],max);
            k--;
        }
        return max;
    }
}
