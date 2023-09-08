/*
 * @lc app=leetcode id=643 lang=java
 *
 * [643] Maximum Average Subarray I
 */

// @lc code=start
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            sum += nums[i];
            if(i >= k){
                sum -= nums[i - k];
            }
            if(i >= k - 1){
                max = Math.max(max, sum);
            }
        }
        return (double)max / k; 
    }
}
// @lc code=end

