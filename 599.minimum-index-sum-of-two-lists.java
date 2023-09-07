/*
 * @lc app=leetcode id=599 lang=java
 *
 * [599] Minimum Index Sum of Two Lists
 */

// @lc code=start
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
       if(list1.length > list2.length) return findRestaurant(list2, list1);
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < list2.length; i++){
            map.put(list2[i], i);
        }
        int min = Integer.MAX_VALUE;
        List<String> res = new ArrayList<>();
        for(int i = 0; i < list1.length; i++){
            if(map.containsKey(list1[i])){
                if(i + map.get(list1[i]) < min){
                    res.clear();
                    res.add(list1[i]);
                    min = i + map.get(list1[i]);
                }else if(i + map.get(list1[i]) == min){
                    res.add(list1[i]);
                }

            }
        }
        return res.toArray(new String[res.size()]);
        

    }
}
// @lc code=end

