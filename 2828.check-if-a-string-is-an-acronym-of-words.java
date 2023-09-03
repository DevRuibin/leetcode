/*
 * @lc app=leetcode id=2828 lang=java
 *
 * [2828] Check if a String Is an Acronym of Words
 */

// @lc code=start
import java.util.List;
class Solution {
    public boolean isAcronym(List<String> words, String s) {
       if(words.size() != s.length()){
           return false;
       }
       for (int i = 0; i < s.length(); i++) {
              if(words.get(i).charAt(0) != s.charAt(i)){
                return false;
              }
       }
         return true;
    }
}
// @lc code=end

