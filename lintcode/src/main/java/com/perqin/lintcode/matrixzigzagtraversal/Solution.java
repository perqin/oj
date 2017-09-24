package com.perqin.lintcode.matrixzigzagtraversal;

public class Solution {
    /**
     * @param matrix: a matrix of integers
     * @return an array of integers
     */
    int[] printZMatrix(int[][] matrix) {
        final int row = matrix.length;
        final int col = matrix[0].length;
        int[] result = new int[row * col];
        int line = 0;
        int i = 0;
        int r;
        int c;
        while (true) {
            if (line > row + col - 2) {
                break;
            }

            if (line % 2 == 0) {
                // Upward line: line:0 -> 0:line
                r = row - 1 >= line ? line : row - 1;
                c = line - r;
                while (r >= 0 && r < row && c >= 0 && c < col) {
                    result[i++] = matrix[r][c];
                    ++c;
                    --r;
                }
            } else {
                // Downward line: 0:line -> line:0
                c = col - 1 >= line ? line : col - 1;
                r = line - c;
                while (r >= 0 && r < row && c >= 0 && c < col) {
                    result[i++] = matrix[r][c];
                    --c;
                    ++r;
                }
            }

            ++line;
        }

        return result;
    }
}