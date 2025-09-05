package fibonacci.impl;

import fibonacci.Fibonacci;

public class FibonacciMemoization implements Fibonacci {
    @Override
    public long getFibonacci(int n) {
        long[] fib = new long[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }
}
