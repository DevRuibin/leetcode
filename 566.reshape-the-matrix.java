/*
 * @lc app=leetcode id=566 lang=java
 *
 * [566] Reshape the Matrix
 */

// @lc code=start
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length; int n = mat[0].length;
        if(m * n != r * c) return mat;
        int[][] res = new int[r][c];
        int row = 0; int col = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                res[row][col] = mat[i][j];
                col++;
                if(col == c){
                    row++;
                    col = 0;
                }
            }
        }
        return res;
    }
}
// @lc code=end

