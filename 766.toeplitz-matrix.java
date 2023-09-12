/*
 * @lc app=leetcode id=766 lang=java
 *
 * [766] Toeplitz Matrix
 */

// @lc code=start
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int h = matrix.length;
        int w = matrix[0].length;
        for (int i = 0; i < matrix.length - 1; i++) {
            int leftMost = matrix[i][0];
            for (int j = 1; j < matrix[0].length; j++) {
                if(i + j >= h) break;
                if(leftMost != matrix[i+j][j]) return false;
            }
        }

        for (int i = 0; i < matrix[0].length-1; i++) {
            int topMost = matrix[0][i];
            for (int j = 1; j < matrix.length; j++) {
                if(i + j >= w) break;
                if(topMost != matrix[j][j+i]) return false;
            }
        }
        return true;
    }
}
// @lc code=end

