/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            while(isNonAlphanumeric(s.charAt(left)) && left < right) left++;
            while(isNonAlphanumeric(s.charAt(right)) && left < right) right--;
            if(!isSame(s.charAt(left), s.charAt(right))) return false;
            left++;
            right--;
        }
        return true;

    }

    boolean isNonAlphanumeric(char c){
        return (c < '0' || c > '9') && (c < 'a' || c > 'z') && (c < 'A' || c > 'Z');
    }

    boolean isSame(char a, char b){
        if(a == b) return true;
        if(a >= 'A' && a <= 'Z') a += 32;
        if(b >= 'A' && b <= 'Z') b += 32;
        return a == b;
    }
}
// @lc code=end

