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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
        return new ArrayList<>();
        }
        List<List<Integer>> res= new ArrayList<>();
        Queue<TreeNode> q= new LinkedList<>();
        int level=0;
        q.offer(root);
        while(!q.isEmpty()){
            int len=q.size();
            res.add(new ArrayList<>());
            for(int i=0;i<len;i++){
                TreeNode temp = q.poll();
                res.get(level).add(temp.val);
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
            }
            level++;
        }
        return res;
    }
}
