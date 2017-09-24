package com.perqin.lintcode.fastpower;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();
        assertEquals(2, solution.fastPower(2, 3, 31));
        assertEquals(0, solution.fastPower(100, 1000, 1000));
    }
}
