/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int[] res = new int[len+1];
        int carry = 1;
        for (int i = len-1; i >= 0; i--) {
            int sum = digits[i] + carry;
            res[i+1] = sum % 10;
            if(sum >= 10) carry = 1;
            else carry = 0;
        }
        if(carry == 1){
            res[0] = 1;
            return res;
        }else{
            return Arrays.copyOfRange(res, 1, len+1);
        }
        
    }

    
}
// @lc code=end

