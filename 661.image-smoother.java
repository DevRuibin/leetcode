/*
 * @lc app=leetcode id=661 lang=java
 *
 * [661] Image Smoother
 */

// @lc code=start
class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int[][] coordinates = new int[][]{
            {-1,-1}, {-1, 0}, {-1, 1},
            {0, -1},  {0,1},
            {1, -1}, {1, 0}, {1, 1}
        };
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = img[i][j];
                int count = 1;
                for (int k = 0; k < 8; k++) {
                    int x = coordinates[k][0] + i;
                    int y = coordinates[k][1] + j;
                    if(x < 0 || x >= m || y < 0 || y >= n){
                        continue;
                    }
                    sum += (img[x][y] & 0xff);
                    count++;
                }
                img[i][j] |= ((sum / count) << 8);
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                img[i][j] = img[i][j]>>8;
            }
        }
        return img;
    }
}
// @lc code=end

