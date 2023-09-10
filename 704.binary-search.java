/*
 * @lc app=leetcode id=704 lang=java
 *
 * [704] Binary Search
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        return binarySearch(nums, target, l, r);

    }

    public int binarySearch(int[] nums, int target, int l, int r){
        if(l > r){
            return -1;
        }
        int mid = (l + r) >> 1;
        if(nums[mid] == target){
            return mid;
        }else if(nums[mid] > target){
            return binarySearch(nums, target, l, mid-1);
        }else {
            return binarySearch(nums, target, mid + 1, r);
        }

    }
}
// @lc code=end

