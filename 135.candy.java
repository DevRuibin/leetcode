/*
 * @lc app=leetcode id=135 lang=java
 *
 * [135] Candy
 */

// @lc code=start
import java.util.Map;
import java.util.HashMap;

class Solution {
    public int candy(int[] ratings) {
        int[] candies = new int[ratings.length];
        for (int i = 0; i < candies.length; i++) {
            candies[i] = 1;
        }
        for (int i = 0; i < candies.length - 1; i++) {
            if(ratings[i+1] > ratings[i]){
                candies[i+1] = candies[i] +1;
            }
        }

        for (int i = candies.length-2; i >=0 ; i--) {
            if(ratings[i] > ratings[i+1]){
                candies[i] = Math.max(candies[i], candies[i+1] + 1);
            }
        }
        int sum = 0;
        for (int i : candies) {
            sum += i;
        }
        return sum;
    }
}
// @lc code=end

