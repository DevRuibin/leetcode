/*
 * @lc app=leetcode id=717 lang=java
 *
 * [717] 1-bit and 2-bit Characters
 */

// @lc code=start
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int len = bits.length; 
        if(bits[len-1] != 0) return false;
        for (int i = 0; i < bits.length - 1; i++) {
            if(bits[i] == '0'){
                continue;
            }
            if(bits[i] == 1){
                i++;
                if(i >= bits.length - 1) return false;
                
            }
        }
        return true;
    }
}
// @lc code=end

