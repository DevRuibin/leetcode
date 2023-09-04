/*
 * @lc app=leetcode id=405 lang=java
 *
 * [405] Convert a Number to Hexadecimal
 */

// @lc code=start

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";
        Map<String, String> map = new HashMap<>();
        map.put("0000", "0");
        map.put("0001", "1");
        map.put("0010", "2");
        map.put("0011", "3");
        map.put("0100", "4");
        map.put("0101", "5");
        map.put("0110", "6");
        map.put("0111", "7");
        map.put("1000", "8");
        map.put("1001", "9");
        map.put("1010", "a");
        map.put("1011", "b");
        map.put("1100", "c");
        map.put("1101", "d");
        map.put("1110", "e");
        map.put("1111", "f");
        StringBuilder sb = new StringBuilder();
        char[] chars = new char[4];
        int i = 0;
        while(i < 8){
            chars[3] = (char)((num & 0x1) + '0'); num = num >> 1;
            chars[2] = (char)((num & 0x1) + '0'); num = num >> 1;
            chars[1] = (char)((num & 0x1) + '0'); num = num >> 1;
            chars[0] = (char)((num & 0x1) + '0'); num = num >> 1;
            sb.append(map.get(new String(chars)));
            i++;
        }
        sb.reverse();
        String res = sb.toString();
        int j = 0;
        while(j < res.length() && res.charAt(j) == '0'){
            j++;
        }
        return res.substring(j);
        
    }
}
// @lc code=end


