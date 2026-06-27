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
        if(root==null){
            return new ArrayList<>();
        }
        List<List<Integer>> res= new ArrayList<>();
        Queue<TreeNode> que= new LinkedList<>();
        int level=0;
        que.offer(root);
        while(!que.isEmpty()){
            res.add(new ArrayList<>());
            int len=que.size();
            for(int i=0;i<len;i++){
                TreeNode temp=que.poll();
                res.get(level).add(temp.val);

                if(temp.left!=null){
                    que.offer(temp.left);
                }
                if(temp.right!=null){
                    que.offer(temp.right);
                }
            }
            level++;
        }
        return res;
    }
}
