/*
 * @lc app=leetcode id=696 lang=java
 *
 * [696] Count Binary Substrings
 */

// @lc code=start
class Solution {
    public int countBinarySubstrings(String s) {
        int prevLen = 0, curLen=1, res = 0;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i-1)){
                curLen++;
            }else{
                prevLen = curLen;
                curLen = 1;
            }
            if(prevLen >= curLen) res++;
        }
        return res;
    }
}
// @lc code=end

