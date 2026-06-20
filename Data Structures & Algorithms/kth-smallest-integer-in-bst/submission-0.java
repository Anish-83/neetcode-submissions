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
   private int count = 0;
    private TreeNode result = null;

    public int kthSmallest(TreeNode root, int k) {
        
        count = 0;
        result = null;
        
        dfs(root, k);
        return result.val;
    }

    private void dfs(TreeNode root, int k) {
        if (root == null || result != null) {
            return;
        }
        dfs(root.left, k);
        count++;
        if (count == k) {
            result = root;
            return; 
        }
        dfs(root.right, k);
    }
}
