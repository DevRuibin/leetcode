/*
 * @lc app=leetcode id=492 lang=java
 *
 * [492] Construct the Rectangle
 */

// @lc code=start
class Solution {
    public int[] constructRectangle(int area) {
       int root = (int)Math.sqrt(area);
       for (int i = root; i >= 1; i--){
           if(area % i == 0){
               return new int[]{area / i, i};
           }
        }
        return new int[]{area, 1};  
    }
}
// @lc code=end

