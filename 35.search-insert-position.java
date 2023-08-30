/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int middle = left + ((right - left) >> 1);
            if(nums[middle]==target){
                return middle;
            } else if(nums[middle] < target){
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        if(left == nums.length){
            return left;
        }
        return nums[left] < target ? left + 1 : left;
    }
}
// @lc code=end

