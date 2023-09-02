/*
 * @lc app=leetcode id=367 lang=java
 *
 * [367] Valid Perfect Square
 */

// @lc code=start
class Solution {
    public boolean isPerfectSquare(int num) {
       int n0 = num;
       int n1 = (n0 + num / n0 ) / 2;
        while(n1 < n0) {
              n0 = n1;
              n1 = (n0 + num / n0 ) / 2;
        }
        return n0 * n0 == num;
    }
}
// @lc code=end

