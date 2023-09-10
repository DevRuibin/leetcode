/*
 * @lc app=leetcode id=733 lang=java
 *
 * [733] Flood Fill
 */

// @lc code=start
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) return image;
       int h = image.length;
       int w = image[0].length;
       fill(image, sr, sc, image[sr][sc], color, h, w);
       return image;
       
    }
    public void fill(int[][] image, int sr, int sc, int oldColor, int color, int h, int w) {
        if(sr < 0 || sr >= h || sc < 0 || sc >= w) return;
        if(image[sr][sc] != oldColor) return;
        image[sr][sc] = color;
        fill(image, sr+1, sc, oldColor, color, h, w);
        fill(image, sr-1, sc, oldColor, color, h, w);
        fill(image, sr, sc-1, oldColor, color, h, w);
        fill(image, sr, sc+1, oldColor, color, h, w);
    }
}
// @lc code=end

