/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int goodNodes(TreeNode root) {
        return dfs(root,Integer.MIN_VALUE);
    }
    private int dfs(TreeNode root ,int max){
        if(root==null)
            return 0;
        int rootAns=0;
        if(root.val>=max){
            rootAns=1;
            max=root.val;
        }
        int lh=dfs(root.left,max);
        int rh=dfs(root.right,max);

        return lh+rh+rootAns;
    }
}
