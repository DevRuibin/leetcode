/*
 * @lc app=leetcode id=693 lang=java
 *
 * [693] Binary Number with Alternating Bits
 */

// @lc code=start
class Solution {
    public boolean hasAlternatingBits(int n) {
        if(n==0) return true;
        int flag = n % 2;
        n = n >> 1;
        return bin(n, flag);
    }

    private boolean bin(int n, int flag){
        int reminder = n % 2;
        if(flag ==reminder){
            return false;
        }
        if(n==0) return true;
        flag = reminder;
        return bin(n>>1, flag);
    }
}
// @lc code=end

