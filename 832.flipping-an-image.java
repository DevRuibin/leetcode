/*
 * @lc app=leetcode id=832 lang=java
 *
 * [832] Flipping an Image
 */

// @lc code=start
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int l = 0;
            int r = image[0].length-1;
            while(l <= r){
                int iAtL = image[i][l] ^ 1;
                int iAtR = image[i][r] ^ 1;
                image[i][r] = iAtL;
                image[i][l] = iAtR;
                l++; r--;
            }
        }
        return image;
    }

}
// @lc code=end

