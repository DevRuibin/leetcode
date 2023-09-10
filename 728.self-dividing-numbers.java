/*
 * @lc app=leetcode id=728 lang=java
 *
 * [728] Self Dividing Numbers
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> l = new ArrayList<>();
        for (int i = left; i < right +1; i++) {
            if(selfDividingNumber(i)) l.add(i);
        }
        return l;
        
    }

    private boolean selfDividingNumber(int n){
        int originalNum = n;
        while(n != 0){
            int rem = n % 10;
            if(rem == 0) return false;
            if(originalNum % rem != 0) return false;
            n /= 10;
        }
        return true;
    }
}
// @lc code=end

