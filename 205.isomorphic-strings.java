/*
 * @lc app=leetcode id=205 lang=java
 *
 * [205] Isomorphic Strings
 */

// @lc code=start

import java.util.Map;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mapST = new HashMap<>();
        Map<Character, Character> mapTS = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if(mapST.containsKey(s.charAt(i))){
                if(mapST.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }else{
                mapST.put(s.charAt(i), t.charAt(i));
            }
            if(mapTS.containsKey(t.charAt(i))){
                if(mapTS.get(t.charAt(i)) != s.charAt(i)){
                    return false;
                }
            }else{
                mapTS.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }
}
// @lc code=end

