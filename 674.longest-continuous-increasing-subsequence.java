/*
 * @lc app=leetcode id=674 lang=java
 *
 * [674] Longest Continuous Increasing Subsequence
 */

// @lc code=start
class Solution {
    public int findLengthOfLCIS(int[] nums) {
       int prev = nums[0];
       int count = 1;
       int lcis = count;
       for (int i = 1; i < nums.length; i++) {
            if(prev < nums[i]){
                count++;
                prev = nums[i];
                lcis = Math.max(lcis, count);
            }else{
                lcis = Math.max(lcis, count);
                count=1;
                prev = nums[i];
            }
       } 
       lcis = Math.max(count, lcis);
       return lcis;
    }
}
// @lc code=end

