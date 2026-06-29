class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
           List<List<Integer>> res = new ArrayList<>();
           Arrays.sort(nums);
           backtrack(res, new ArrayList<>(),nums,0);
           return res;
    }
    void backtrack(List<List<Integer>> res, List<Integer> temp, int[] nums, int start){
        if(res.contains(temp)){
            return;
        }
        res.add(new ArrayList<>(temp));
        for(int i=start;i<nums.length;i++){
            temp.add(nums[i]);
            backtrack(res,temp,nums,i+1);
            temp.remove(temp.size()-1);
        }
    }
}
