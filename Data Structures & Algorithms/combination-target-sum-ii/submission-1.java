class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), candidates, 0, target);
        return res;
    }

    void backtrack(List<List<Integer>> res, List<Integer> temp, int[] nums, int start, int target) {
        if (target == 0) {
            res.add(new ArrayList<>(temp)); 
            return;
        }
        if (target < 0) {
            return;
        }
        
        for (int i = start; i < nums.length; i++) {
          if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i] > target) {
                break; 
            }
            
            
            
            temp.add(nums[i]);
            backtrack(res, temp, nums, i + 1, target - nums[i]);
            temp.remove(temp.size() - 1);
        }
    }
}