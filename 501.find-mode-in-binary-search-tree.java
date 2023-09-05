/*
 * @lc app=leetcode id=501 lang=java
 *
 * [501] Find Mode in Binary Search Tree
 */

// @lc code=start

import java.util.List;

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
    int count = 1;
    int max = 1;
    Integer prev = null;
    List<Integer> list = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        inorder(root);
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i); 
        }
        return res;
        
    }

    public void inorder(TreeNode root){
        if(root == null){
            return;  // it doesn't modify the value of prev
        }
        inorder(root.left);
        if(prev != null && prev == root.val){
            count++;
        }else{
            count = 1;
        }
        if(count > max){
            max = count;
            list.clear();
            list.add(root.val);
        }else if(count == max){
            list.add(root.val);
        }
        prev = root.val;
        inorder(root.right);

    }
}
// @lc code=end

