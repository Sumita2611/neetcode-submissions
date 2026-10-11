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
    public TreeNode fun(int preStart , int preEnd , int[] preorder , int inStart , int inEnd , int[] inorder , Map<Integer , Integer> mp){
        //base case
        if(preStart > preEnd || inStart > inEnd){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        int inRoot = mp.get(root.val);
        int numsLeft = inRoot - inStart;
        root.left = fun(preStart + 1 , preStart + numsLeft , preorder , inStart , inRoot-1 , inorder , mp);
        root.right = fun(preStart + numsLeft + 1 , preEnd , preorder , inRoot + 1 , inEnd , inorder , mp);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer , Integer> mp = new HashMap<>();
        for(int i = 0;i < inorder.length;i++){
            mp.put(inorder[i] , i);
        }
        TreeNode root = fun(0 , preorder.length-1 , preorder , 0 , inorder.length-1 , inorder , mp);
        return root;
    }
}
