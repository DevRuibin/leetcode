/*
 * @lc app=leetcode id=263 lang=java
 *
 * [263] Ugly Number
 */

// @lc code=start
class Solution {
    public boolean isUgly(int n) {
        if(n <= 0) return false;
        for(int i : new int[]{2, 3, 5}) {
            while(n % i == 0) {
                n /= i;
            }
        }
        return n == 1;

    }
}
// @lc code=end

