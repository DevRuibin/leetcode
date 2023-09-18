/*
 * @lc app=leetcode id=830 lang=java
 *
 * [830] Positions of Large Groups
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;


class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
       int lIdx=0, rIdx=1;
       char c = s.charAt(lIdx);
       if(s.length() < 3) return new ArrayList<>();
       List<List<Integer>> list = new ArrayList<>();
      char currentC = s.charAt(rIdx);
       for (; rIdx < s.length(); rIdx++) {
            currentC = s.charAt(rIdx);
            if(currentC == c){
                continue;
            }else{
                if(rIdx - lIdx >= 3){
                    List<Integer> g = new ArrayList<>();
                    g.add(lIdx); g.add(rIdx-1);
                    list.add(g);
                }
                c = currentC;
                lIdx = rIdx;
            }
       }
       if(s.charAt(rIdx-1) == c){
        if(rIdx - lIdx  >= 3){
                    List<Integer> g = new ArrayList<>();
                    g.add(lIdx); g.add(rIdx-1);
                    list.add(g);
        }
       }
       return list;

    }
}
// @lc code=end



