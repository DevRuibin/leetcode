/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start

import java.util.Map;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> seenMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (seenMap.containsKey(nums[i])) {
                return true;
            } else {
                seenMap.put(nums[i], 1);
            }
        }
        return false;
    }
}
// @lc code=end

