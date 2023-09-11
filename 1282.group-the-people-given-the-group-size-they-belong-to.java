/*
 * @lc app=leetcode id=1282 lang=java
 *
 * [1282] Group the People Given the Group Size They Belong To
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> map = new HashMap<>(); 
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < groupSizes.length; i++) {
            List<Integer> members = map.getOrDefault(groupSizes[i], new ArrayList<>());
            members.add(i);
            map.put(groupSizes[i], members);
            if(members.size() == groupSizes[i]) {
                map.remove(groupSizes[i]);
                res.add(members);
            }

        }
        return res;
    }
}
// @lc code=end

