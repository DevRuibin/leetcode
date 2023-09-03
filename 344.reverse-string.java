/*
 * @lc app=leetcode id=344 lang=java
 *
 * [344] Reverse String
 */

// @lc code=start
class Solution {
    public void reverseString(char[] s) {
       int i = 0, j = s.length - 1;
       while(i < j){
            char temp = s[i];
            s[i++] = s[j];
            s[j--] = temp;
       } 
       return;
    }
}
// @lc code=end

