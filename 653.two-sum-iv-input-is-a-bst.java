/*
 * @lc app=leetcode id=653 lang=java
 *
 * [653] Two Sum IV - Input is a BST
 */

// @lc code=start

import java.util.HashSet;
import java.util.Set;


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
    public boolean findTarget(TreeNode root, int k) {
       Set<Integer> valSet = new HashSet<>(); 
       boolean[] flag = new boolean[]{false};
       inOrderTraverse(root, valSet, k, flag);
       return flag[0];

    }

    public void inOrderTraverse(TreeNode root, Set<Integer> valSet, int k, boolean[] flag){
        if(flag[0] == true){
            return;
        }
        if(root == null) return;
        int val = root.val;
        if(valSet.contains(k-val)){
            flag[0] = true;
            return;
        }else{
            valSet.add(val);
            inOrderTraverse(root.left, valSet, k, flag);
            inOrderTraverse(root.right, valSet, k, flag);
        }
    }
}
// @lc code=end

