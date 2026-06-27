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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        StringBuilder sb1= new StringBuilder();
        StringBuilder sb2= new StringBuilder();
        dfs(root,sb1);
        dfs(subRoot,sb2);

        return sb1.toString().contains(sb2.toString());
    }
    public void dfs(TreeNode root,StringBuilder sb){
        if(root == null){
            sb.append(" ");
            return;
        }
        sb.append(root.val);
        dfs(root.left,sb);
        dfs(root.right,sb);
    }
}
