package com.perqin.lintcode.kthlargestelement;

public class Solution {
    /**
     * @param k : description of k
     * @param nums : array of nums
     * @return description of return
     */
    int kthLargestElement(int k, int[] nums) {
        return kthLargestElement(k, nums, 0, nums.length - 1);
    }

    private int kthLargestElement(int k, int[] nums, int left, int right) {
        int tmp;
        if (left == right) {
            return nums[left];
        }
        int pivot = nums[left];
        int l = left;
        int r = right;
        while (l < r) {
            while (l <= right && nums[l] > pivot) {
                ++l;
            }
            while (r >= left && nums[r] < pivot) {
                --r;
            }
            // nums[r] >= pivot >= nums[l]
            if (l <= r) {
                tmp = nums[r];
                nums[r] = nums[l];
                nums[l] = tmp;
                ++l;
                --r;
            }
        }
        if (r >= left && k - 1 <= r) {
            return kthLargestElement(k, nums, left, r);
        } else {
            return kthLargestElement(k, nums, l, right);
        }
    }
}
