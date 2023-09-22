/*
 * @lc app=leetcode id=868 lang=java
 *
 * [868] Binary Gap
 */

// @lc code=start
class Solution {
    public int binaryGap(int n) {
       int min = 64;
       int r1 = -1;
       int r2 = -1;
       int i = 0;
       int distance = 0;
       for (; i < 32; i++) {
            int digit = (n >> i) & 1;
            if(digit == 1){
                r1 = i;
                i++;
                break;
            }
       }
       if(r1 == -1) return distance;
       for (; i < 32; i++) {
            int digit = (n >> i) & 1;
            if(digit == 1){
                r2 = i;
                i++;
                break;
            }
       }
       if(r2 == -1) return distance;
       distance = r2 - r1;
       for(; i < 32; i++){
            int digit = (n >> i) & 1;
            if(digit == 1){
                r1 = r2;
                r2 = i;
                distance = Math.max(distance, r2 - r1);
            }
       }
       return distance;
       
    }
}
// @lc code=end

