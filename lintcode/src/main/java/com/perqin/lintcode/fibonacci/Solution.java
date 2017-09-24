package com.perqin.lintcode.fibonacci;

public class Solution {
    int fibonacci(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;
        int[] nums = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;
        for (int i = 2; i < n; ++i) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        return nums[n - 1];
    }
}
