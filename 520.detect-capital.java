/*
 * @lc app=leetcode id=520 lang=java
 *
 * [520] Detect Capital
 */

// @lc code=start
class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length() == 1) return true;
        boolean first = Character.isUpperCase(word.charAt(0));
        boolean prev = Character.isUpperCase(word.charAt(1));
        if(!first && prev) return false;
        for (int i = 2; i < word.length(); i++) {
            if(Character.isUpperCase(word.charAt(i)) != prev) return false;
        }
        return true;
        
    }
}
// @lc code=end

