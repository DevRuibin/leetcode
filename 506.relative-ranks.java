/*
 * @lc app=leetcode id=506 lang=java
 *
 * [506] Relative Ranks
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public String[] findRelativeRanks(int[] score) {
       if(score.length == 1){
              return new String[]{"Gold Medal"};
       }else if(score.length == 2){
              if(score[0] > score[1]){
                     return new String[]{"Gold Medal", "Silver Medal"};
              }else{
                     return new String[]{"Silver Medal", "Gold Medal"};
              }
       }
       int max = Integer.MIN_VALUE;
        for(int i = 0; i < score.length; i++){
            max = Math.max(max, score[i]);
        }
        int[] possibleScore = new int[max + 1];
        for(int i = 0; i < score.length; i++){
            possibleScore[score[i]] = i + 1;
        }
        int count = 0;
        HashMap<Integer, String> map = new HashMap<>();
        int i = possibleScore.length - 1;
        while(count < 3){
            if(possibleScore[i] != 0){
                if(count == 0){
                    map.put(i, "Gold Medal");
                }else if(count == 1){
                    map.put(i, "Silver Medal");
                }else{
                    map.put(i, "Bronze Medal");
                }
                count++;
            }
            i--;
        }
        count++;
        for(; i >= 0; i--){
            if(possibleScore[i] != 0){
                map.put(i, String.valueOf(count++));
            }
        }
        String[] result = new String[score.length];
        for(int j = 0; j < score.length; j++){
            result[j] = map.get(score[j]);
        }
        return result;
    }
}
// @lc code=end

