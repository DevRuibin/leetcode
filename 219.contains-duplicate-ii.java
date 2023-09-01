/*
 * @lc app=leetcode id=219 lang=java
 *
 * [219] Contains Duplicate II
 */

// @lc code=start

import java.util.Map;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> seenMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(seenMap.containsKey(nums[i])){
                if(i - seenMap.get(nums[i]) <= k){
                    return true;
                }else{
                    seenMap.put(nums[i], i);
                }
            }else{
                seenMap.put(nums[i], i);
            }
        }
        return false;
    }
}
// @lc code=end

