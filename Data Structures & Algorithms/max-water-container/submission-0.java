class Solution {
    public int maxArea(int[] height) {
        if(height.length==2)
            return Math.min(height[0],height[1]);
        int prod=1;
        int left=0;
        int right=height.length-1;
        while(left<=right){
            if(height[left]<height[right]){
                prod=Math.max(height[left]*(right-left),prod);
                left++;
            }
            else{
                prod=Math.max(height[right]*(right-left),prod);
                right--;
            }
        }
        return prod;
    }
}
