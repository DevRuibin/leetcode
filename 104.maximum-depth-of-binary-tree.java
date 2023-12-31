/*
 * @lc app=leetcode id=104 lang=java
 *
 * [104] Maximum Depth of Binary Tree
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
    public int maxDepth(TreeNode root) {
        return maxDepthHelp(root, 0);
    }

    public int maxDepthHelp(TreeNode root, int depth){
        if(root == null) return depth;
        return Math.max(maxDepthHelp(root.left, depth + 1), maxDepthHelp(root.right, depth + 1));
    }
}
// @lc code=end

