/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */


class Solution {
    public String longestPalindrome(String s) {
        int maxLen = 0;
        StringBuilder longestPalidrom = new StringBuilder();
        int l, r;
        for (int i = 0; i < s.length(); i++) {
            // odd
            l = i - 1;
            r = i + 1;
            while(l>=0 && r < s.length() && s.charAt(l) == s.charAt(r)){
                l--;
                r++;
            }
            if(maxLen < r - l - 1){
                maxLen = r - l - 1;
                longestPalidrom = new StringBuilder(s.substring(l + 1, r));
            }


            // even
            l = i;
            r = i + 1;
            while(l>=0 && r < s.length() && s.charAt(l) == s.charAt(r)){
                l--;
                r++;
            }
            if(maxLen < r - l - 1){
                maxLen = r - l - 1;
                longestPalidrom = new StringBuilder(s.substring(l + 1, r));
            }
        } 
        return longestPalidrom.toString();
    }
}
// @lc code=end




// @lc code=start