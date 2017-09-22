package com.perqin.lintcode.fibonacci;

import java.util.Scanner;


public class Fibonacci {
    public static class Solution {
        private int[] nums;

        public int fibonacci(int n) {
            if (n == 1) return 0;
            if (n == 2) return 1;
            nums = new int[n + 1];
            nums[0] = 0;
            nums[1] = 1;
            for (int i = 2; i < n; ++i) {
                nums[i] = nums[i - 1] + nums[i - 2];
            }
            return nums[n - 1];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();
        int index = scanner.nextInt();
        System.out.println(String.valueOf(solution.fibonacci(index)));
    }
}
