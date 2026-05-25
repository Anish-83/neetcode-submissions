class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> que= new PriorityQueue<>(Collections.reverseOrder());
        for(int n:nums)
            que.add(n);
        
        while(k>1){
            k--;
            que.poll();
        }
        return que.peek();
    }
}
