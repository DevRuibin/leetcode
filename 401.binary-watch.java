/*
 * @lc app=leetcode id=401 lang=java
 *
 * [401] Binary Watch
 */

// @lc code=start

import java.util.ArrayList;

class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        int hour = 0, minute = 0;
        List<String> res = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            for(int j = 0; j < 60; j++){
                if(Integer.bitCount(i) + Integer.bitCount(j) == turnedOn){
                    res.add(String.format("%d:%02d", i, j));
                }
            }
        }
        return res;
    }
}
// @lc code=end

