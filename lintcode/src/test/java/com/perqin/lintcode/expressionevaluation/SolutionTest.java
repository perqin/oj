package com.perqin.lintcode.expressionevaluation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();
        assertEquals(2, solution.evaluateExpression(new String[]{
                "2", "*", "6", "-", "(", "23", "+", "7", ")", "/", "(", "1", "+", "2", ")"
        }));
    }
}
