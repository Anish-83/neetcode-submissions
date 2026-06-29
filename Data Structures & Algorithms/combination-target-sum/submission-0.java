class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res= new ArrayList<>();
        backtrack(res,new ArrayList<>(),nums,0,target);
        return res;
    }
    void backtrack(List<List<Integer>> res, List<Integer> temp, int[] nums, int start, int target){
        if(target==0){
            res.add(new ArrayList<>(temp));
            return;
        }
        if(target<0){
            return;
        }
        for(int i=start;i<nums.length;i++){
            temp.add(nums[i]);
            backtrack(res,temp,nums,i,target-nums[i]);
            temp.remove(temp.size()-1);
        }
    }
}
