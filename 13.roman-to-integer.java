/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        Map <Character, Integer> romanIntMap = new HashMap<>();
        romanIntMap.put('I', 1);
        romanIntMap.put('V', 5);
        romanIntMap.put('X', 10);
        romanIntMap.put('L', 50);
        romanIntMap.put('C', 100);
        romanIntMap.put('D', 500);
        romanIntMap.put('M', 1000);

        int result = 0;
        int prev = 0;
        for (int i = s.length() - 1; i >= 0; i--){
            int curr = romanIntMap.get(s.charAt(i));
            if(curr >= prev){
                result += curr;
            } else {
                result -= curr;
            }
            prev = curr;
        }
        return result;
    }
}
// @lc code=end

