/*
 * @lc app=leetcode id=628 lang=java
 *
 * [628] Maximum Product of Three Numbers
 */

// @lc code=start


class Solution {
    public int maximumProduct(int[] nums) {

        if(nums.length == 3){
            return nums[0] * nums[1] * nums[2];
        }
        Arrays.sort(nums);
        int n = nums.length;
        int n1 = nums[0];
        int n2 = nums[1];
        int n3 = nums[n - 1];

        int p1 = nums[n-1];
        int p2 = nums[n-2];
        int p3 = nums[n-3];

        int p2P3 = p2 * p3;
        int n1N2 = n1 * n2;
        if(p1 <= 0){
            return p1 * p2P3;
        }
        if(n1 >= 0){
            return p1 * p2P3;
        }

        if(n1N2 > p2P3){
            return n1N2 * p1;
        }

        if(p2P3 >= n1N2){
            return p1 * p2P3;
        }
        return 0;

        // -n1 * -n2 * p1
        // if n1 < 0, n2 < 0
        // and n1 * n2 > p2 * p3

        // p1 * p2 * p3
        // if p1 > 0, p2 > 0 
        // and p2 * p3 > n1 * n2
    }
}
// @lc code=end

