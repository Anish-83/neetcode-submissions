class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowIndex=searchRow(matrix,target);
        
        return binarySearch(matrix, rowIndex,target);

    }
    private int searchRow(int[][] arr, int target){
        int low=0;
        int m=arr.length-1;
        int high=m;
        int n=arr[0].length-1;

        while(low<=high){
        int mid=low + (high-low)/2;

        if(target >= arr[mid][0]  && target <=arr[mid][n]){
            return mid;
        }
        if(target > arr[mid][0])low=mid+1;

        if(target < arr[mid][0])high=mid-1;
        }
        return -1;
    }
    private boolean binarySearch(int [][] matrix, int row, int target){
        if(row==-1)return false;
        int low=0;
        int high=matrix[0].length-1;
        while(low<=high){
            int mid=low + (high-low)/2;
            if(matrix[row][mid]==target) return true;
            else if(matrix[row][mid] >target) high=mid-1;
            else low=mid+1;
        }
        return false;
    }
}
