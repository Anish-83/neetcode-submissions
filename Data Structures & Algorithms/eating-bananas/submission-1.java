class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int minSpeed=1;
       int maxSpeed=Integer.MIN_VALUE;
       for(int i: piles){
        maxSpeed=Math.max(maxSpeed,i);
       } 
       while(minSpeed<maxSpeed){
        int mid=minSpeed + (maxSpeed-minSpeed)/2;
        if(canEat(piles,h,mid)){
            maxSpeed=mid;
        }
        else{
            minSpeed=mid+1;
        }

       }
       return minSpeed;
    }
    boolean canEat(int[] piles, int h,int speed){
        int hours=0;
        for(int i:piles){
            hours += (i + speed - 1) / speed;
            //hours+=(int)Math.ceil((double)i/speed);
        }
        return hours<=h;
    }
}
