/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int buyDay = 0;
        int sellDay = 1;
        while(sellDay < prices.length){
            if(prices[sellDay] < prices[buyDay]){
                buyDay = sellDay;
            }else{
                max = Math.max(max, prices[sellDay] - prices[buyDay]);
                sellDay++;
            }
        }
        return max;
    }
}
// @lc code=end

