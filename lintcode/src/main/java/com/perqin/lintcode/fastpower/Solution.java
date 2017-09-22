class Solution {
    private static final int MAX_CACHE_SIZE = 1000000;
    private int[] cache = new int[MAX_CACHE_SIZE];
    /*
     * @param a, b, n: 32bit integers
     * @return: An integer
     */
    public int fastPower(int a, int b, int n) {
        for (int i = 0; i <= n; ++i) {
            if (i >= MAX_CACHE_SIZE) break;
            cache[i] = -1;
        }
        return calculateFp(a, b, n);
    }
    
    private int calculateFp(int a, int b, int n) {
        if (n == 0) {
            return 1 % b;
        } else if (n == 1) {
            return a % b;
        } else if (n < MAX_CACHE_SIZE && cache[n] != -1) {
            return cache[n];
        } else {
            int x = fastPower(a, b, n /  2);
            int y;
            if (n % 2 == 0) {
                y = x;
            } else {
                y = fastPower(a, b, n - n / 2);
            }
            int result = (int) (((long) x * (long) y) % b);
            if (n < MAX_CACHE_SIZE) {
                cache[n] = result;
            }
            return result;
        }
    }
};