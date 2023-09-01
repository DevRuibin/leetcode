/*
 * @lc app=leetcode id=228 lang=java
 *
 * [228] Summary Ranges
 */

// @lc code=start
class Solution {
    public List<String> summaryRanges(int[] nums) {
        if(nums.length == 0){
            return new ArrayList<>();
        }
        List<String> res = new ArrayList<>();
        int start = nums[0];
        int end = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == end + 1){
                end = nums[i];
            }else{
                if(start == end){
                    res.add(String.valueOf(start));
                }else{
                    res.add(start + "->" + end);
                }
                start = nums[i];
                end = nums[i];
            }
        }
        if(start == end){
            res.add(String.valueOf(start));
        }else{
            res.add(start + "->" + end);
        }
        return res;
    }
}
// @lc code=end

