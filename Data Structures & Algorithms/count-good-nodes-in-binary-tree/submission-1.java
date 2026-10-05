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
    public int fun(TreeNode root , int maxForThisStep){
        if(root == null){
            return 0;
        }
        int cnt = 0;
        if(root.val >= maxForThisStep){
            cnt = 1;
            maxForThisStep = root.val;
        }
        cnt += fun(root.left , maxForThisStep);
        cnt += fun(root.right , maxForThisStep);
        return cnt;
    }
    public int goodNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        return fun(root , root.val);
    }
}
