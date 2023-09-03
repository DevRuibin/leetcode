/*
 * @lc app=leetcode id=389 lang=java
 *
 * [389] Find the Difference
 */

// @lc code=start
class Solution {
    public char findTheDifference(String s, String t) {
        char res = 0;
        for(char c : s.toCharArray()){
            res ^= c;
        }
        for(char c : t.toCharArray()){
            res ^= c;
        }
        return res;
    }
}
// @lc code=end

