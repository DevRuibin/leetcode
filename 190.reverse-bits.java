/*
 * @lc app=leetcode id=190 lang=java
 *
 * [190] Reverse Bits
 */

// @lc code=start
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String s = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        for (int i = 0; i < 32 - s.length(); i++) {
            sb.append('0');
        }
        return Integer.parseUnsignedInt(sb.toString(), 2);

    }
}
// @lc code=end

