/*
 * @lc app=leetcode id=509 lang=java
 *
 * [509] Fibonacci Number
 */

// @lc code=start
class Solution {
    public int fib(int n) {
       if(n==0){
           return 0;
        }else if(n==1){
            return 1;
        }
        int prev = 0;
        int curr = 1;
        for(int i = 2; i <= n; i++){
            int temp = curr;
            curr = prev + curr;
            prev = temp;
        }
        return curr;
    }
}
// @lc code=end

