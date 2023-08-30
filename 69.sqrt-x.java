/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start
class Solution {
    public int mySqrt1(int x) {
        int l = 0;
        while ((l + 1) * ((long)(l + 1)) <= x) {
            l++;
        }
        return l;
    }
    public int mySqrt2(int x) {
        int l = 0;
        long a = 1;
        int d = 3;
        while (a <= x) {
            a = a + d;
            d = d + 2;
            l++;
        }
        return l;
    }

    public int mySqrt3(int x) {
        int l = 0;
        int r = x;
        int mid = x;
        if(x == 1) return 1;
        while(l != r-1){
            mid = (r + l) /2;
            long sqaure = (long)mid * mid;
            if(sqaure == x) return mid;
            else if(sqaure < x) l = mid;
            else r = mid;
        }
        return l;
    }

    public int mySqrt4(int x) {
        if(x < 2) return x;
        int x0 = x / 2;
        int x1 = newton(x, x0);
        while(x0 > x1){
            x0 = x1;
            x1 = newton(x, x0);
        }
        return x0;
        
    }

    public int mySqrt(int x) {
        if(x < 1) return x;
        long x0 = x;
        long x1 = newton(x, x0);
        while(x0 > x1){
            x0 = x1;
            x1 = newton(x, x0);
        }
        return (int)x0;
        
    }

    // if x is very large, x*x will overflow, so use long
    private long newton(long x, long x0){
        return (x0 + x / x0) / 2;
    }

    private int newton(int x, int x0){
        return (x0 + x / x0) / 2;
    }


}
// @lc code=end

