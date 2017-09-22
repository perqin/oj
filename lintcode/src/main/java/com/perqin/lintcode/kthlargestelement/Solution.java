package com.perqin.lintcode.kthlargestelement;

public class Solution {
  /*
   * @param k : description of k
   * @param nums : array of nums
   * @return: description of return
   */
  public int kthLargestElement(int k, int[] nums) {
      return kthLargestElement(k, nums, 0, nums.length - 1);
  }
  
  private int kthLargestElement(int k, int[] nums, int left, int right) {
      int tmp;
      if (left == right) {
          return nums[k - 1];
      }
      int pivot = nums[left];
      int l = left, r = right;
      while (l < r) {
          while (l <= right && nums[l] >= pivot) {
              ++l;
          }
          while (r >= left && nums[r] <= pivot) {
              --r;
          }
          // nums[r] >= pivot >= nums[l]
          if (l < r) {
              tmp = nums[r];
              nums[r] = nums[l];
              nums[l] = tmp;
              ++l;
              --r;
          }
      }
      if (k - 1 <= r) {
          return kthLargestElement(k, nums, left, r);
      }
      if (k - 1 >= l) {
          return kthLargestElement(k - l, nums, l, right);
      }
      return nums[k];
  }
};
