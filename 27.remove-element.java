/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int current = 0;
        int index = 0;
        int count = 0;
        while(index < nums.length){
            if(nums[index] == val){
                index++;
            }else{
                nums[current++] = nums[index++];
                count++;
            }
        }
        return count;
    }
}
// @lc code=end

