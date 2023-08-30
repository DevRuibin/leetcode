/*
 * @lc app=leetcode id=110 lang=java
 *
 * [110] Balanced Binary Tree
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
    public boolean isBalanced(TreeNode root) {
        if(isBalancedHelp(root) == -1) return false;
        return true;

    }

    public int isBalancedHelp(TreeNode root){
        if(root == null) return 0;
        int lh = isBalancedHelp(root.left);
        if(lh == -1) return -1;
        int rh = isBalancedHelp(root.right);
        if(rh == -1) return -1;
        if(Math.abs(lh - rh) > 1) return -1;
        return Math.max(lh, rh) + 1;
    }
}
// @lc code=end

