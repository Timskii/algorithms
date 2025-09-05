package fibonacci.impl;

import fibonacci.Fibonacci;

public class FibonacciIterativeImpl implements Fibonacci {
    @Override
    public long getFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        long fib = 1, prev = 1;
        for (int i = 2; i < n; i++) {
            long temp = fib;
            fib += prev;
            prev = temp;
        }
        return fib;
    }
}
