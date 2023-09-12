/*
 * @lc app=leetcode id=1647 lang=java
 *
 * [1647] Minimum Deletions to Make Character Frequencies Unique
 */

// @lc code=start

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

class Solution {
    public int minDeletions(String s) {
        int cont = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            int cNum = map.getOrDefault(s.charAt(i), 0);
            map.put(s.charAt(i), cNum+1);
        } 

        Iterator<Character> iterator = map.keySet().iterator();
        Set<Integer> set = new HashSet<>();
        while(iterator.hasNext()){
            char c = iterator.next();
            int cNum = map.get(c);
            while(cNum >0 && set.contains(cNum)){
                cNum--;
                cont++;
            }
            set.add(cNum);
        }
        return cont;
    }
}
// @lc code=end

