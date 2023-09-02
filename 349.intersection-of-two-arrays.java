/*
 * @lc app=leetcode id=349 lang=java
 *
 * [349] Intersection of Two Arrays
 */

// @lc code=start
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int nums1Len = nums1.length;
        int nums2Len = nums2.length;
        if(nums1Len == 0 || nums2Len == 0) return new int[0];
        if(nums1Len > nums2Len) return intersection(nums2, nums1);
        nums2 = quickSort(nums2, 0, nums2Len - 1);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1Len; i++) {
            if(set.contains(nums1[i])) continue;
            if(binarySearch(nums2, nums1[i])) set.add(nums1[i]);
        }
        int [] res = new int[set.size()];
        int i = 0;
        for (Integer num : set) {
            res[i++] = num;
        }
        return res;
    }

    private boolean binarySearch(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = (right - left) / 2 + left;
            if(nums[mid] == target) return true;
            else if(nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }

    private int[] quickSort(int[] nums, int left, int right){
        if(left >= right) return nums;
        int pivot = nums[left];
        int i = left, j = right;
        while(i < j){
            while(i < j && nums[j] >= pivot) j--;
            nums[i] = nums[j];
            while(i < j && nums[i] <= pivot) i++;
            nums[j] = nums[i];
        }
        nums[i] = pivot;
        quickSort(nums, left, i - 1);
        quickSort(nums, i + 1, right);
        return nums;
    }
}
// @lc code=end

