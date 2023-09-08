/*
 * @lc app=leetcode id=671 lang=java
 *
 * [671] Second Minimum Node In a Binary Tree
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
import java.util.Stack;

class Solution {
    public int findSecondMinimumValue(TreeNode root) {
       Stack<TreeNode> stack = new Stack<>();
       int rootVal = root.val;
       int minV = Integer.MAX_VALUE;
       int flag = 0;
       stack.push(root);
       while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(rootVal != node.val){
                flag = 1;
                minV = Math.min(minV, node.val);
            }
            if(node.left != null){
                stack.push(node.left);
                stack.push(node.right);
            }
       }
       return flag == 0 ? -1 : minV;
    }
}
// @lc code=end

