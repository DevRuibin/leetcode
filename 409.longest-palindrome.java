/*
 * @lc app=leetcode id=409 lang=java
 *
 * [409] Longest Palindrome
 */

class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for(char c: s.toCharArray()){
            count[c]++;
        }
        boolean hasOdd = false;
        int res = 0;
        for(int i = 0; i < count.length; i++){
            if(count[i] == 0){
                continue;
            }
            if((count[i] & 1) ==1){
                res += (count[i] - 1);
                hasOdd = true;
            }else{
                res += count[i];
            }
        }
        if(hasOdd){
            return res + 1;
        }else{
            return res;
        }

    }
}
// @lc code=end


