/*
 * @lc app=leetcode id=859 lang=java
 *
 * [859] Buddy Strings
 */
class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()) return false;
        if(s.length() == 1) return false;
        if(s.length() == 2){
            return  (s.charAt(0) == s.charAt(1) &&
                    s.charAt(0) == goal.charAt(0) &&
                    s.charAt(1) == goal.charAt(1)) || (
                        s.charAt(0) != s.charAt(1) &&
                        s.charAt(1) == goal.charAt(0) &&
                        s.charAt(0) == goal.charAt(1)
                    );
        } 
        int[] buckets = new int[26];
        int[][] differ = new int[2][2]; 
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != goal.charAt(i)){
                count++;
                if(count >2) return false;
                differ[0][count-1] = s.charAt(i);
                differ[1][count-1] = goal.charAt(i);
                
            }
            buckets[s.charAt(i) - 'a'] +=1;
        }
        if(count == 1) return false;
        if(count == 2){
            if(differ[0][1] == differ[1][0] && (differ[0][0] == differ[1][1])) return true;
            return false;
        }
        for (int i = 0; i < 26; i++) {
            if(buckets[i] > 1) return true;
        }
        return false;
    }
}