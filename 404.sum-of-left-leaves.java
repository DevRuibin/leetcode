/*
 * @lc app=leetcode id=404 lang=java
 *
 * [404] Sum of Left Leaves
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
    public int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null){
            return 0;
        }
        dfs(root, false);
        return sum;
    }

    public boolean isLeaf(TreeNode node){
        return node.left == null && node.right == null;
    }

    public void dfs(TreeNode node, boolean isLeft){
        boolean leafNode = isLeaf(node);
        if(leafNode && isLeft){
            sum += node.val;
        }
        if(node.left != null){
            dfs(node.left, true);
        }
        if(node.right != null){
            dfs(node.right, false);
        }
    }
}
// @lc code=end

