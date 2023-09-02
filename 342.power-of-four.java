/*
 * @lc app=leetcode id=342 lang=java
 *
 * [342] Power of Four
 */

// @lc code=start
class Solution {
    public boolean isPowerOfFour(int n) {
       if (n <= 0) {
           return false;
       }
       if((n & (n-1)) != 0) {
          return false;
       }
        return (n & (0x55555555)) != 0;
    }
}
// @lc code=end

