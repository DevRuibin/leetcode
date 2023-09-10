/*
 * @lc app=leetcode id=1359 lang=java
 *
 * [1359] Count All Valid Pickup and Delivery Options
 */

// @lc code=start
class Solution {
    public int countOrders(int n) {
       int slots = n * 2;
       long validServices = 1l;
       int mod = 1_000_000_000 + 7;
       while(slots > 0){
            int validService = slots * (slots-1) / 2 % mod;
            validServices *= validService;
            validServices %= mod;
            slots -= 2;

       } 
       return (int)validServices;
    }
}
// @lc code=end

