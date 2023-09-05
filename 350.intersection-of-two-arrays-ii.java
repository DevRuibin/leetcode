/*
 * @lc app=leetcode id=350 lang=java
 *
 * [350] Intersection of Two Arrays II
 */

// @lc code=start

// I need to modify the code to make it suitable for this problem.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int[] intersect (int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for(int i = 0; i < nums1.length; i++){
            if(map1.containsKey(nums1[i])){
                map1.put(nums1[i], map1.get(nums1[i]) + 1);
            }else{
                map1.put(nums1[i], 1);
            }
        }

        for(int i = 0; i < nums2.length; i++){
            if(map2.containsKey(nums2[i])){
                map2.put(nums2[i], map2.get(nums2[i]) + 1);
            }else{
                map2.put(nums2[i], 1);
            }
        }

        List<Integer> set = new ArrayList<>();
        for(Integer key: map1.keySet()){
            if(map2.containsKey(key)){
                int count = Math.min(map1.get(key), map2.get(key));
                for(int i = 0; i < count; i++){
                    set.add(key);
                }
            }
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}
// @lc code=end


// @lc code=end

