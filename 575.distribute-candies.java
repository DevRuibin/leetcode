/*
 * @lc app=leetcode id=575 lang=java
 *
 * [575] Distribute Candies
 */

// @lc code=start
import java.util.HashSet;
import java.util.Set;
class Solution {
    public int distributeCandies1(int[] candyType) {
        Set types = new HashSet();
        for(int type : candyType){
            types.add(type);
        }
        return Math.min(types.size(), candyType.length / 2);
    }

    public int distributeCandies(int[] candyType){
        boolean[] types = new boolean[200001];
        int count = 0;
        for(int type : candyType){
            if(!types[type + 100000]){
                types[type + 100000] = true;
                count++;
            }
        }
        return Math.min(count, candyType.length / 2);
    }
}
// @lc code=end

