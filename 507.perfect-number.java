/*
 * @lc app=leetcode id=507 lang=java
 *
 * [507] Perfect Number
 */

// @lc code=start
class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num == 1){
            return false;
        }
        int[] perfectNumber = getAllPerfectNumbers(31);
        for(int i = 0; i < perfectNumber.length; i++){
            if(num == perfectNumber[i]){
                return true;
            }
        }
        return false;
        
    }
    private int[] getAllPerfectNumbers(int n){
        int[] primes=new int[]{2,3,5,7,13,17,19,31};
        int[] perfectNumber = new int[primes.length];
        for(int i = 0; i < primes.length; i++){
            perfectNumber[i] = (int)(Math.pow(2, primes[i] - 1) * (Math.pow(2, primes[i]) - 1));
        }
        return perfectNumber;

    }
}
// @lc code=end

