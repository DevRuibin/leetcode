/*
 * @lc app=leetcode id=504 lang=java
 *
 * [504] Base 7
 */

// @lc code=start
class Solution {
    public String convertToBase7(int num) {
        if(num == 0){
           return "0";
        } 
        StringBuilder sb = new StringBuilder();
        boolean isNegative = num < 0;
        if(isNegative){
            num = -num;
        }
        while(num > 0){
            sb.append(num % 7);
            num /= 7;
        }
        if(isNegative){
            sb.append("-");
        }
        return sb.reverse().toString();
    }
}
// @lc code=end

