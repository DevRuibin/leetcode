/*
 * @lc app=leetcode id=290 lang=java
 *
 * [290] Word Pattern
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean wordPattern(String pattern, String s) {
       Map<Character, String> map = new HashMap<>();
       Map<String, Character> map2 = new HashMap<>();
       int sLength = s.length();
       int j = 0;
       for (int i = 0; i < pattern.length(); i++) {
            StringBuilder subStringSb = new StringBuilder();
            boolean firstChar = true;
            if(j >= sLength) {
                return false;
            }
            while (j < sLength) {
                if(firstChar && s.charAt(j) == ' ') {
                    j++;
                    return false;
                }
                firstChar = false;
                if (s.charAt(j) == ' ') {
                    j++;
                    break;
                }
                subStringSb.append(s.charAt(j++));
            }
            String subString = subStringSb.toString();
            
            char c = pattern.charAt(i);
            if (map.containsKey(c) && map2.containsKey(subString)) {
                if (!map.get(c).equals(subString)) {
                    return false;
                }
                if (map2.get(subString) != c) {
                    return false;
                }
            } else if(map.containsKey(c) || map2.containsKey(subString)) {
                return false;
            } else {
                map.put(c, subString);
                map2.put(subString, c);
            }
       }
         if (j < sLength) {
              return false;
         }
         return true;
    }
}
// @lc code=end

