/*
 * @lc app=leetcode id=821 lang=java
 *
 * [821] Shortest Distance to a Character
 */

// @lc code=start
class Solution {
    public int[] shortestToChar(String s, char c) {
        
    }

    private int moveForward(String s, char c, int index){
        while(s.length() > index){
            if(s.charAt(index) == 'c'){
                return index;
            }
            index++;
        }
        return Integer.MAX_VALUE;
    }
}
// @lc code=end

