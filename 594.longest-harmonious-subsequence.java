/*
 * @lc app=leetcode id=594 lang=java
 *
 * [594] Longest Harmonious Subsequence
 */

// @lc code=start
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int findLHS1(int[] nums) {
        Map<Integer, Integer> numCount = new HashMap<>();
        
        for (int num : nums) {
            numCount.put(num, numCount.getOrDefault(num, 0) + 1);
        }
        int[] keys = new int[numCount.size()];
        int i = 0;
        for (int key : numCount.keySet()) {
            keys[i++] = key;
        }
        int numMax = Integer.MIN_VALUE;
        for (int key : keys) {
            if (numCount.containsKey(key + 1)) {
                numMax = Math.max(numMax, numCount.get(key) + numCount.get(key + 1));
            }
        }
        return numMax == Integer.MIN_VALUE ? 0 : numMax;
        

    }

    public int findLHS(int[] nums){
        Arrays.sort(nums);
        int max = 0;
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            while(nums[i] - nums[start] > 1){
                start++;
            }
            if(nums[i] - nums[start] == 1){
                max = Math.max(max, i - start + 1);
            }
        }
        return max;
    }
}
// @lc code=end

