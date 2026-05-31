class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] smaller= nums1.length>nums2.length ? nums2 :nums1;
        int[] larger = nums1.length>nums2.length ? nums1 :nums2;
        int totalLength= nums1.length+nums2.length;

        int l1=0,r1=0,l2=0,r2=0;
        int low=0, high=smaller.length;
        while(low<=high){
            int px=(low+high)/2;
            int py=(totalLength+1)/2 -px;

            l1= px==0 ? Integer.MIN_VALUE: smaller[px-1];
            r1= px==smaller.length ? Integer.MAX_VALUE: smaller[px];
            
            l2= py==0 ? Integer.MIN_VALUE: larger[py-1];
            r2= py==larger.length ? Integer.MAX_VALUE: larger[py];

            if(l1<=r2 && l2<=r1){
                if(totalLength%2==0){
                    return (Math.max(l1,l2)+ Math.min(r1,r2))/2.0;
                }
                else{
                    return Math.max(l1,l2);
                }
            }
            if(l1>r2){
                high=px-1;
            }
            else{
                low=px+1;
            }
        }
        return 0;
    }
}
