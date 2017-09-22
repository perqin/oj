package com.perqin.lintcode.kthlargestelement;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void kthLargestElement() {
        Solution solution = new Solution();
        assertEquals(4, solution.kthLargestElement(3, new int[]{ 9,3,2,4,8 }));
    }
}
