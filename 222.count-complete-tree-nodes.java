/*
 * @lc app=leetcode id=222 lang=java
 *
 * [222] Count Complete Tree Nodes
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
    public int countNodes(TreeNode root) {
        int dl = 0;
        int dr = 0;
        if(root == null){
            return 0;
        }
        TreeNode l = root;
        TreeNode r = root;
        while(l != null){
            dl++;
            l = l.left;
        }
        while(r != null){
            dr++;
            r = r.right;
        }
        if(dl == dr){
            return (int)Math.pow(2, dl) - 1;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
// @lc code=end

