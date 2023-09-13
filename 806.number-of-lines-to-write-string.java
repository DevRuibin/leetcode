/*
 * @lc app=leetcode id=806 lang=java
 *
 * [806] Number of Lines To Write String
 */

// @lc code=start
class Solution {
    public int[] numberOfLines(int[] widths, String s) {
       int row = 0;
       int column = 0;
       int columnWidth = 0;
       for (int i = 0; i < s.length(); i++) {
            int width = widths[s.charAt(i) - 'a'];
            columnWidth += width;
            if(columnWidth > 100){
                i--;
                column = columnWidth - width;
                columnWidth = 0;
                row++;
            }else if(columnWidth == 100){
                columnWidth = 0;
                row++;
                column = 100;
            }
       } 
        if(columnWidth != 0){
            row++;
            column = columnWidth;
     
        }
        return new int[] {row, column};
    }
}
// @lc code=end

