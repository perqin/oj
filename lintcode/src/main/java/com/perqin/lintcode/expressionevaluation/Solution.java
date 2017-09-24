package com.perqin.lintcode.expressionevaluation;

public class Solution {
    /**
     * @param expression: a list of strings
     * @return an integer
     */
    int evaluateExpression(String[] expression) {
        int[] values = new int[1000];
        int valuesTop = -1;
        char[] ops = new char[1000];
        int opsTop = -1;
        for (String token : expression) {
            final char tk = token.charAt(0);
            switch (tk) {
                case '+':
                case '-':
                case '*':
                case '/':
                case '(':
                case ')':
                    while (true) {
                        if (tk == ')') {
                            if (ops[opsTop] == '(') {
                                --opsTop;
                                break;
                            }
                        } else if (tk == '('
                                || opsTop < 0
                                || ops[opsTop] == '('
                                || (priority(tk) > priority(ops[opsTop]))) {
                            ops[++opsTop] = tk;
                            break;
                        }
                        final int value2 = values[valuesTop--];
                        final int value1 = values[valuesTop--];
                        final char op = ops[opsTop--];
                        values[++valuesTop] = calculate(value1, op, value2);
                    }
                    break;
                default:
                    values[++valuesTop] = Integer.parseInt(token);
                    break;
            }
        }
        while (opsTop >= 0) {
            final int value2 = values[valuesTop--];
            final int value1 = values[valuesTop--];
            final char op = ops[opsTop--];
            values[++valuesTop] = calculate(value1, op, value2);
        }
        return values[0];
    }

    private int priority(char op) {
        switch (op) {
            case '+':
            case '-':
                return 0;
            case '*':
            case '/':
                return 1;
            default:
                return -1;
        }
    }

    private int calculate(int value1, char op, int value2) {
        switch (op) {
            case '+':
                return value1 + value2;
            case '-':
                return value1 - value2;
            case '*':
                return value1 * value2;
            case '/':
                return value1 / value2;
            default:
                return 0;
        }
    }
}
