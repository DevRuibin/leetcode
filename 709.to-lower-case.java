/*
 * @lc app=leetcode id=709 lang=java
 *
 * [709] To Lower Case
 */

// @lc code=start
class Solution {
    char subValue = (char) ('A' - 'a');
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sb.append(toLowerCase(c));
        }
        return sb.toString();
    }

    public char toLowerCase(char c){
        return (c <= 'Z' && c >='A') ? ((char)(c - subValue)) : c;
    }
}
// @lc code=end

