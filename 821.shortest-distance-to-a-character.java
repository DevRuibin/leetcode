/*
 * @lc app=leetcode id=821 lang=java
 *
 * [821] Shortest Distance to a Character
 */

// @lc code=start
class Solution {
    public int[] shortestToChar(String s, char c) {
        int eIdx = -10000;
        int[] res = new int[s.length()];
        for (int i = 0; i < res.length; i++) {
            if(s.charAt(i)==c){
                eIdx = i;
            }
            res[i] = i - eIdx;
        }
        eIdx = 10000;
        for (int i = res.length-1; i >= 0; i--) {
            if(s.charAt(i)==c){
                eIdx = i;
            }
            int distance = eIdx - i;
            if(distance < res[i]) res[i] = distance;
        }
        return res;    
    }

}
// @lc code=end

