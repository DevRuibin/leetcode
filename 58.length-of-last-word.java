/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        int sLen = s.length();
        int wordLength = 0;
        int i = sLen - 1;
        while(i >= 0 && s.charAt(i) == ' ') i--;
        while(i >= 0 && s.charAt(i) != ' '){
            wordLength++;
            i--;
        }
        return wordLength;
    }
}
// @lc code=end

