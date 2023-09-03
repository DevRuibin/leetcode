/*
 * @lc app=leetcode id=202 lang=java
 *
 * [202] Happy Number
 */

// @lc code=start

import java.util.Set;

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n!=1){
            n = sumOfSquares(n);
            if(set.contains(n)){
                return false;
            }else{
                set.add(n);
            }
        }
        return true;
    }

    private int sumOfSquares(int n){
        int sum = 0;
        while(n!=0){
            sum += (n%10)*(n%10);
            n = n/10;
        }
        return sum;
    }
}
// @lc code=end

