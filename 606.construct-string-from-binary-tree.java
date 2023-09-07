/*
 * @lc app=leetcode id=606 lang=java
 *
 * [606] Construct String from Binary Tree
 */

// @lc code=start
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
    StringBuilder sb = new StringBuilder();
    public String tree2str(TreeNode root) {
        preorder(root);
        return this.sb.toString();
        
    }

    public void preorder(TreeNode root){
        if(root == null) return;
        this.sb.append(root.val);
        if(root.left != null){
            this.sb.append("(");
            preorder(root.left);
            this.sb.append(")");
        }else{
            if(root.right != null){
                this.sb.append("()");
            }
        }
        if(root.right != null){
            this.sb.append("(");
            preorder(root.right);
            this.sb.append(")");
        }else{
            //if(root.left != null){
              //  this.sb.append("()");
            //}
        }
    }
}
// @lc code=end

