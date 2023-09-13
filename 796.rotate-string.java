/*
 * @lc app=leetcode id=796 lang=java
 *
 * [796] Rotate String
 */

// @lc code=start
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        flag:
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != goal.charAt(0)) continue;
            int sIdx = i+1, j = 1;
            for (; j < goal.length(); j++) {
                if(goal.charAt(j) !=  s.charAt(sIdx % s.length())) continue flag;
                sIdx++;
            }
            return true;
        } 
        return false;

    }
}
// @lc code=end

