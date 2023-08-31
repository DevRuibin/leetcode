/*
 * @lc app=leetcode id=144 lang=java
 *
 * [144] Binary Tree Preorder Traversal
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
    public List<Integer> preorderTraversal1(TreeNode root) {
        List <Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        Stack <TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode cur = stack.pop();
            res.add(cur.val);
            if(cur.right != null){
                stack.push(cur.right);
            }
            if(cur.left != null){
                stack.push(cur.left); 
            }
        }
        return res;
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List <Integer> res = new ArrayList<>();
        recrusion(root, res);
        return res;
    }

    public void recrusion(TreeNode root, List<Integer> res){
        if(root == null){
            return;
        }
        res.add(root.val);
        recrusion(root.left, res);
        recrusion(root.right, res);
    }
}
// @lc code=end

