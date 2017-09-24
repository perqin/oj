package com.perqin.lintcode.matrixzigzagtraversal;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{ 1, 2, 5, 9, 6, 3, 4, 7, 10, 11, 8, 12 }, solution.printZMatrix(new int[][]{
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        }));
    }
}
