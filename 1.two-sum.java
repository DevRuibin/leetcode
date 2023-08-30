/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start

import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;
            if(map.containsKey(diff)){
                return new int[]{map.get(diff), i};
            }
            map.put(num, i);
        }
        assert false;
        return null;
    }
}
// @lc code=end

