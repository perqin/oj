package com.perqin.lintcode.findminimuminrotatedsortedarray;

public class Solution {
  /**
   * @param nums: a rotated sorted array
   * @return the minimum number in the array
   */
  int findMin(int[] nums) {
      return findMin(nums, 0, nums.length - 1);
  }

  private int findMin(int[] nums, int left, int right) {
      if (left == right) {
          return nums[left];
      }
      if (nums[left] < nums[right]) {
          return nums[left];
      }
      final int mid = (right + left) / 2;
      if (nums[left] <= nums[mid]) {
          return findMin(nums, mid + 1, right);
      } else {
          return findMin(nums, left, mid);
      }
  }
}
