package com.perqin.lintcode.fibonacci;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();
        assertEquals(0, solution.fibonacci(1));
        assertEquals(1, solution.fibonacci(2));
        assertEquals(34, solution.fibonacci(10));
    }
}
