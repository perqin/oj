package com.perqin.lintcode.findminimuminrotatedsortedarray;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();
        assertEquals(0, solution.findMin(new int[]{ 4, 5, 6, 7, 0, 1, 2 }));
    }
}
