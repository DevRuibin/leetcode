/*
 * @lc app=leetcode id=278 lang=java
 *
 * [278] First Bad Version
 */

// @lc code=start
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
       if(n == 1) return 1;
        int l = 0, r = n-1; 
        while(l < r) {
            int mid = l + (r - l) / 2;
            if(isBadVersion(mid+1)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l + 1;
    }
}
// @lc code=end

