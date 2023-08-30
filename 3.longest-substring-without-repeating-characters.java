/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    // f d a b c d a f g
    public int lengthOfLongestSubstring(String s) {
        // define a map and initialize it with -1
        int[] map = new int[256];
        for (int i = 0; i < map.length; i++) {
            map[i] = -1;
        }
        int start = 0;
        int end = 0;
        int max = 0;
        for (; end < s.length(); end++) {
            char cur = s.charAt(end);
            if(map[cur] != -1){
                start = Math.max(start, map[cur] + 1);
            }
            map[cur] = end;
            max = Math.max(max, end - start + 1);
        }
        return max;
    }
}
// @lc code=end

