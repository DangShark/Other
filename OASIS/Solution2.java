public class Solution2 {
    /**
     * Tính số Fibonacci thứ n.
     *
     * @param n số thứ tự trong dãy Fibonacci cần tính
     * @return Số Fibonacci thứ n.
     */
    public static long fibonacci(long n) {
        if (n < 0) {
            return -1;
        } else {
            long[] fib = new long[(int) (10000)];
            fib[0] = 0;
            fib[1] = 1;
            for (int i = 2; i <= n; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
            if (fib[(int) n] < -1000) {
                return Long.MAX_VALUE;
            }
            return fib[(int) n];
        }
    }
}
