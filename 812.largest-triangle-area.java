/*
 * @lc app=leetcode id=812 lang=java
 *
 * [812] Largest Triangle Area
 */

// @lc code=start
class Solution {
    public double largestTriangleArea(int[][] points) {
        double area = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i+1; j < points.length; j++) {
                for (int k = j+1; k < points.length; k++) {
                    area = Math.max(area, cal_area(points[i], points[j], points[k]));
                }
            }
        }
        return area;
    }

    public double cal_area(int[] x1, int[] x2, int[] x3){
        double a = x1[0] * (x2[1] - x3[1]);
        double b = x2[0] * (x3[1] - x1[1]);
        double c = x3[0] * (x1[1] - x2[1]);
        double area = 0.5 * Math.abs(a + b + c);
        return area;
    }
}
// @lc code=end

