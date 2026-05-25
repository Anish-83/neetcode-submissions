class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> que= new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones){
            que.offer(i);
        }
        while(que.size()>1){
            int a=que.poll();
           
            int b=que.poll();
            
            if(a>b)
                que.offer(a-b);
           
        }
        return que.isEmpty() ? 0 : que.poll();
    }
}
