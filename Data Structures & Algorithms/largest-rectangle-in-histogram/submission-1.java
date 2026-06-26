class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack= new Stack<>();
        int n=heights.length;
        int []left= new int[n];
        int []right= new int[n];
        int max=0;
        
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]){
                stack.pop();
            }
            left[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(i);
        }
        stack.clear();
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]){
                stack.pop();
            }
            right[i]=stack.isEmpty()?n:stack.peek();
            stack.push(i);
        }
        for(int i=0;i<n;i++){
            //System.out.print(left[i]);
            max=Math.max(heights[i]*(right[i]-left[i]-1),max);
        }
        
        return max;
    }
}
