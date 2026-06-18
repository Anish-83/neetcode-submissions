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
        StringBuilder s1= new StringBuilder();
        StringBuilder s2=new StringBuilder();
        dfs(root,s1);
        dfs(subRoot,s2);
        
        return s1.toString().contains(s2.toString());
    }
    private static void dfs(TreeNode node,StringBuilder sb){
        if(node==null){
            sb.append(" ");
            return;
        }
        sb.append(node.val);
        dfs(node.left,sb);
        dfs(node.right,sb);
    }
}
