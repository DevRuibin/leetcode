/*
 * @lc app=leetcode id=645 lang=java
 *
 * [645] Set Mismatch
 */

// @lc code=start
class Solution {
    public int[] findErrorNums(int[] nums) {
        int dupNumber = -1;
        int missedNumber = 1;
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] >= 0){
                nums[index] = Math.abs(nums[index]) * -1;
            }else{
                dupNumber = Math.abs(index) + 1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0){
                missedNumber = i+1;
            }
        }
        return new int[]{dupNumber, missedNumber};
    }
}