/*
 * @lc app=leetcode id=605 lang=java
 *
 * [605] Can Place Flowers
 */

// @lc code=start

import java.util.Arrays;


class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int m) {
        int index = 0;
        int n = 1;
        for (int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i] == 1){
                for (int j = i - n; j < i ; j++) {
                    if(j < 0) continue;
                    if(flowerbed[j] == 1) return false;
                    flowerbed[j] = 2;
                }
                for (int j = i+1; j < i + n + 1; j++) {
                    if(j >= flowerbed.length) break;
                    if(flowerbed[j] == 1) return false;
                    flowerbed[j] = 2;
                }
            }
        }


        for (int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i] == 0){
                index++;
                for (int j = i - n; j < i ; j++) {
                    if(j < 0) continue;
                    flowerbed[j] = 2;
                }
                for (int j = i+1; j < i + n + 1; j++) {
                    if(j >= flowerbed.length) break;
                    flowerbed[j] = 2;
                }
                if(index == m) return true;
            }
        }
        if(m == 0) return true;
        return false;
    }
}
// @lc code=end


