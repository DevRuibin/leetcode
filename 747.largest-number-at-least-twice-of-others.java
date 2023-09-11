/*
 * @lc app=leetcode id=747 lang=java
 *
 * [747] Largest Number At Least Twice of Others
 */

// @lc code=start
class Solution {
    public int dominantIndex(int[] nums) {
        int max = -1;
        int secondMax = -1;
        int maxIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > secondMax){
                if(nums[i] < max){
                    secondMax = nums[i];
                }else{
                    secondMax = max;
                    max = nums[i];
                    maxIndex = i;
                }
            }
        } 
        return (secondMax << 1) <= max ? maxIndex : -1;
    }
}
// @lc code=end

