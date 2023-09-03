/*
 * @lc app=leetcode id=171 lang=java
 *
 * [171] Excel Sheet Column Number
 */

// @lc code=start
class Solution {
    // A -> 1
    // AA -> 27 = 1 * 26 ^ 1 + 1 * 26 ^ 0
    // AAA -> 703 = 1 * 26 ^ 2 + 1 * 26 ^ 1 + 1 * 26 ^ 0
    public int titleToNumber(String columnTitle) {
        int len = columnTitle.length();
        int res = 0;
        for (int i = 0; i < len; i++) {
            res += (columnTitle.charAt(i) - 'A' + 1) * Math.pow(26, len - i - 1);
        }
        return res;
    }
}
// @lc code=end

