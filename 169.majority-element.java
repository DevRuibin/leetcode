/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int candidate = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == candidate){
                count++;
            }else{
                count--;
                if(count == 0){
                    candidate = nums[i];
                    count = 1;
                }
            }
        }
        return candidate;

        
    }
}
// @lc code=end

