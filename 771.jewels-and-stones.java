/*
 * @lc app=leetcode id=771 lang=java
 *
 * [771] Jewels and Stones
 */

// @lc code=start
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
       int[][] bucket = new int[26][2];
       for (int i = 0; i < stones.length(); i++) {
            char c = stones.charAt(i);
            if(c <= 'Z'){
                bucket[c - 'A'][0] +=1;
            }else{
                bucket[c - 'a'][1] += 1;
            }
       } 
       int res = 0;
       for (int i = 0; i < jewels.length(); i++) {
            char c = jewels.charAt(i);
            if(c <= 'Z'){
                int idx = c - 'A';
                res += bucket[idx][0];

            }else{
                int idx = c - 'a';
                res += bucket[idx][1];
            }
       }
       return res;
    }
}
// @lc code=end

