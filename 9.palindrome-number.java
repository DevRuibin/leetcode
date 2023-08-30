/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        char[] arr = String.valueOf(x).toCharArray();
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            if(arr[start] != arr[end]) return false;
            start++;
            end--;
        }
        return true;
    }
}
// @lc code=end

