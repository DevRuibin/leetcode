/*
 * @lc app=leetcode id=680 lang=java
 *
 * [680] Valid Palindrome II
 */

// @lc code=start
class Solution {
    public boolean validPalindrome(String s) {
       // length is a even number
        char[] sArr = s.toCharArray();
        int l = 0;
        int r = s.length() -1;
        while(l < r){
            if(sArr[l]==sArr[r]) {
                l++;
                r--;
                continue;
            }
            return isPalidrome(sArr, l+1, r) || isPalidrome(sArr, l, r-1);
        }
        return true;
    }

    private boolean isPalidrome(char[] sArr, int l, int r){
        while(l < r){
            if(sArr[l] == sArr[r]){
                l++;
                r--;
            }else{
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

