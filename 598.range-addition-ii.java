/*
 * @lc app=leetcode id=598 lang=java
 *
 * [598] Range Addition II
 */

// @lc code=start
class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int rowMin = m;
        int colMin = n;
        for (int[] op : ops) {
            rowMin = Math.min(rowMin, op[0]);
            colMin = Math.min(colMin, op[1]);
        }
        return rowMin * colMin;
    }
}
// @lc code=end

