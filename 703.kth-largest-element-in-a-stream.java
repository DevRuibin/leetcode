/*
 * @lc app=leetcode id=703 lang=java
 *
 * [703] Kth Largest Element in a Stream
 */

// @lc code=start
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

class KthLargest {
    private int k;
    private List<Integer> nums;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        Arrays.sort(nums);
        this.nums = new ArrayList<>();
        
        for (int i = nums.length-1; i >= 0; i--) {
            this.nums.add(nums[i]);
        }
        
    }
    
    public int add(int val) {
        int i = 0;
        for (; i < nums.size(); i++) {
            if(val < nums.get(i)){
                continue;
            }else{
                break;
            }
        }
        nums.add(i, val);
        return nums.get(k-1);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
// @lc code=end

