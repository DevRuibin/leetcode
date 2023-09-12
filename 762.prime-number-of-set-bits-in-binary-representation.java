/*
 * @lc app=leetcode id=762 lang=java
 *
 * [762] Prime Number of Set Bits in Binary Representation
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

class Solution {

    Set<Integer> primeSet = new HashSet<>();

    public Solution(){
        Collection<Integer> c = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31);
        primeSet.addAll(c);
    }
    public int countPrimeSetBits(int left, int right) {
        int res = 0;
        for (int i = left; i < right+1; i++) {
            int count = count1(i);
            if(isPrime(count)) res++;
        }
        return res;
    }

    private boolean isPrime(int num){
        return primeSet.contains(num);
    }

    private int count1(int num){
        int count = 0;
        while(num > 0){
            num = num & (num -1);
            count++;
        }
        return count;
    }
}
// @lc code=end

