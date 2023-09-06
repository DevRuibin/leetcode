/*
 * @lc app=leetcode id=541 lang=java
 *
 * [541] Reverse String II
 */

// @lc code=start
class Solution {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end =  k;
        while(start < chars.length){
            reverseSubString(chars, start, end, k);
            start += 2 * k;
            end = start + k;
        }
        return new String(chars);

        
    }

    /*
     * Reverse substring from start to end. (end exclusive)
     * 
     * It is not responsible for checking the validity of start and end.
     */
    private void reverseSubString(char[] s, int start, int end){
        end--;
        while(start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++; end--;
        }
    }

    private void reverseSubString(char[] s, int start, int end, int k){
        if(start >= s.length) return;
        if(end + k > s.length){
            int remain = s.length - start;
            if(remain < k){
                reverseSubString(s, start, s.length);
            }else{
                reverseSubString(s, start, start + k);
            }
        }else{
            reverseSubString(s, start, end);
        }
    }
}
// @lc code=end

