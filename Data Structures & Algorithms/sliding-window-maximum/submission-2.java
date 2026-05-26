class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        Deque<Integer> deq=new ArrayDeque<>();
        int res[] = new int[n-k+1];

        for(int i=0;i<k;i++){
            while(!deq.isEmpty() && nums[deq.peekLast()] <= nums[i]){
                deq.pollLast();
            }
            deq.offerLast(i);
        }
        res[0]=nums[deq.peekFirst()];

        for(int i=k;i<n;i++){

            if(deq.peekFirst()<= i-k){
                deq.pollFirst();
            }
             while(!deq.isEmpty() && nums[deq.peekLast()] <= nums[i]){
                deq.pollLast();
            }
            deq.offerLast(i);
            res[i-k+1]=nums[deq.peekFirst()];
        }
        return res;
    }
}
