/*
 * @lc app=leetcode id=350 lang=java
 *
 * [350] Intersection of Two Arrays II
 */

// @lc code=start

// I need to modify the code to make it suitable for this problem.

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

class Solution {
    public int[] intersect (int[] nums1, int[] nums2) {
        int nums1Len = nums1.length;
        int nums2Len = nums2.length;
        if(nums1Len > nums2Len) return intersect(nums2, nums1);
        nums2 = quickSort(nums2, 0, nums2Len - 1);
        List<Integer> res1 = new ArrayList<>();
        List<Integer> res2 = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        if(nums1Len == 0 || nums2Len == 0) return new int[0];
        for (int i = 0; i < nums1Len; i++) {
            int index = binarySearch(nums2, nums1[i]);
            if(index == -1) continue;
            res2.add(nums1[i]);
            if(set.contains(nums1[i])) continue;
            set.add(nums1[i]);
            int j = index;
            while(j < nums2Len && nums2[j] == nums1[i]) j++;
            int count = j - index;
            j = index;
            while(j >= 0 && nums2[j] == nums1[i]) j--;
            count += index - j;
            count--;
            for (int k = 0; k < count; k++) {
                res1.add(nums1[i]);
            }
            
        }

        List<Integer> finalList = res1.size() < res2.size() ? res1 : res2;
        return finalList.stream().mapToInt(Integer::intValue).toArray();
    }

    private int binarySearch(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = (right - left) / 2 + left;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
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


// @lc code=end

