/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution {
    public int climbStairs1(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        int count = 0;
        count += climbStairs(n -1) + climbStairs(n - 2);
        return count;
    }

    public int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        int oneWayBefore = 2;
        int twoWayBefore = 1;
        int count = 0;
        for (int i = 3; i <= n; i++) {
            count = oneWayBefore + twoWayBefore;
            twoWayBefore = oneWayBefore;
            oneWayBefore = count;
        }
        return count;

    }
}
// @lc code=end

