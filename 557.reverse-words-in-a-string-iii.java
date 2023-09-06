/*
 * @lc app=leetcode id=557 lang=java
 *
 * [557] Reverse Words in a String III
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end = 0;
        while(end < chars.length){
            while(end < chars.length && chars[end] != ' ') end++;
            reverseSubString(chars, start, end);
            start = end + 1;
            end = start;
        }
        return new String(chars);
        
    }

    private void reverseSubString(char[] s, int start, int end){
        end--;
        while(start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++; end--;
        }
    }
}
// @lc code=end

