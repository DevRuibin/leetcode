/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        int right = 1;
        int count = 1;
        if(nums.length == 1) return count;
        while(right < nums.length){
            if(nums[left] == nums[right]){
                nums[right] = '_';
                right++;
            }else{
                nums[++left] = nums[right++];
                count++;
            }
        }
        return count;
    }
}
// @lc code=end

