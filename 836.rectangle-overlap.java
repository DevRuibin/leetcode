/*
 * @lc app=leetcode id=836 lang=java
 *
 * [836] Rectangle Overlap
 */

// @lc code=start
class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x1 = rec1[0], y1 = rec1[1];
        int x2 = rec1[2], y2 = rec1[3];
        int a1 = rec2[0], b1 = rec2[1];
        int a2 = rec2[2], b2 = rec2[3];

        return !(
            (b1 >= y2) ||
            (y1 >= b2) ||
            (a1 >= x2) ||
            (a2  <= x1)
        );

    }
}
// @lc code=end

