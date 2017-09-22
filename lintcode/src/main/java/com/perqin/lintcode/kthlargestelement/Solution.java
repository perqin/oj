package com.perqin.lintcode.kthlargestelement;

class Solution {
    /**
     * @param k : description of k
     * @param nums : array of nums
     * @return description of return
     */
    int kthLargestElement(int k, int[] nums) {
        return kthLargestElement(k, nums, 0, nums.length - 1);
    }

    private int kthLargestElement(int k, int[] nums, int left, int right) {
        System.out.println("Search in [" + left + " - " + right + "] for the " + k + "-th largest number");
        for (int i = left; i <= right; ++i) System.out.print(nums[i] + ",");
        System.out.println();
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
        System.out.println("l = " + l + ", r = " + r + ", left = " + left + ", right = " + right);
        if (r >= left && k - 1 <= r) {
            return kthLargestElement(k, nums, left, r);
        } else {
            return kthLargestElement(k, nums, l, right);
        }
    }
}
