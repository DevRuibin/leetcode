/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {
       int x = 0;
       for(int i=0; i<nums.length; i++) {
           x ^= nums[i];
           x ^= i;
       }
        return x ^ nums.length;
    }
}
// @lc code=end

