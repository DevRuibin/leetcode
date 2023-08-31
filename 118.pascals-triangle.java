/*
 * @lc app=leetcode id=118 lang=java
 *
 * [118] Pascal's Triangle
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        if (numRows == 0) {
            return triangle;
        }
        List<Integer> firstRow = new ArrayList<Integer>();
        firstRow.add(1);
        triangle.add(firstRow);
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> row = generateRow(i + 1, prevRow);
            triangle.add(row);
        }
        return triangle;
    }

    public List<Integer> generateRow(int rowLevel, List<Integer> prevRow){
        List<Integer> row = new ArrayList<Integer>();
        row.add(1);
        
        for(int i = 0; i<rowLevel-2; i++){
            row.add(prevRow.get(i) + prevRow.get(i+1));
        }
        row.add(1);
        
       
        return row;
    }
}
// @lc code=end

