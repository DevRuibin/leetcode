/*
 * @lc app=leetcode id=867 lang=java
 *
 * [867] Transpose Matrix
 */

// @lc code=start
class Solution {
    public int[][] transpose(int[][] matrix) {
       int h = matrix.length;
       int w = matrix[0].length; 
       int[][] res = new int[w][h];
       for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                res[j][i] = matrix[i][j];
            }
       }
       return res;
    }
}
// @lc code=end

