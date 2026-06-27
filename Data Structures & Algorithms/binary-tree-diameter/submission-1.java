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
    int maxD; 
    public int diameterOfBinaryTree(TreeNode root) {
        maxD=0;
        calculateDepth(root);
        return maxD;
    }
    private int calculateDepth(TreeNode root){
        if(root==null)
            return 0;
        
        int lh=calculateDepth(root.left);
        int rh=calculateDepth(root.right);

        maxD=Math.max(lh+rh,maxD);

        return 1+Math.max(lh,rh);
    }
}
