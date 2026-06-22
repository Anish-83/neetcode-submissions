class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowIndex=rowSearch(matrix,target);
        int left=0;
        int right=matrix[0].length-1;
        while(left<=right){
            int mid=left + (right-left)/2;
            if(matrix[rowIndex][mid]==target)
                return true;
            else if(matrix[rowIndex][mid]<target)
                left++;
            else
                right--;
        }
        return false;
    }
    private int rowSearch(int [][] matrix, int target){
        int top=0;
        int n=matrix[0].length;
        int bottom=matrix.length-1;
        while(top<=bottom){
            int mid= top + (bottom-top)/ 2;
            if(matrix[mid][0]<=target && matrix[mid][n-1]>=target)
                return mid;
            else if(matrix[mid][0]<target && matrix[mid][n-1]<target)
                top=mid+1;
            else if(matrix[mid][0]>target && matrix[mid][n-1]>target)
                bottom=mid-1;
        }
        return 0;
    }
}
