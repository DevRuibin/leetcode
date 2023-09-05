/*
 * @lc app=leetcode id=495 lang=java
 *
 * [495] Teemo Attacking
 */

// @lc code=start
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total = 0;
        int prev = timeSeries[0];
        for(int i = 1; i < timeSeries.length; i++){
            if(timeSeries[i] - prev >= duration){
                total += duration;
            }else{
                total += timeSeries[i] - prev;
            }
            prev = timeSeries[i];
        }
        return total + duration;
        
    }
}
// @lc code=end

