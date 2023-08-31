/*
 * @lc app=leetcode id=119 lang=java
 *
 * [119] Pascal's Triangle II
 */

// @lc code=start

import java.util.List;


class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<Integer>();
        row.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            int size = row.size();
            System.out.println(row);
            //row.add(1);
            for(int j=0; j<size-1; j++){
                row.add(row.get(0) + row.get(1));
                row.remove(0);
            }
            //row.remove(0);
            row.add(1);
        }
        return row;
    }
}
// @lc code=end

