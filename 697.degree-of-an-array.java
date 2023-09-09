/*
 * @lc app=leetcode id=697 lang=java
 *
 * [697] Degree of an Array
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> firstSeen = new HashMap<>();
        int degree = 0;
        int minSubArrayLen = 0;
        for (int i = 0; i < nums.length; i++) {
            firstSeen.putIfAbsent(nums[i], i);
            int countOfNumAtI = count.getOrDefault(nums[i], 0) + 1;
            count.put(nums[i], countOfNumAtI);
            if(countOfNumAtI > degree){
                degree = countOfNumAtI;
                minSubArrayLen = i - firstSeen.get(nums[i]) + 1;
            }else if(countOfNumAtI == degree){
                minSubArrayLen = Math.min(minSubArrayLen, i - firstSeen.get(nums[i]) + 1);
            }
        }
        return minSubArrayLen;

    }
}
// @lc code=end

