class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        ArrayDeque<Integer> deq= new ArrayDeque<>();
        int[] res= new int[n-k+1];
        int j=0;
        for(int i=0;i<n;i++){
            while(!deq.isEmpty() && nums[deq.getLast()]<nums[i]){
                deq.removeLast();
            }
            deq.addLast(i);
            if(deq.getFirst()+k==i){
                deq.removeFirst();
            }
            if(i>=k-1){
                res[j++]=nums[deq.getFirst()];
            }
        }
        return res;
    }
}
