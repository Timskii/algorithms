package fibonacci.impl;

import fibonacci.Fibonacci;

public class FibonacciRecursiveImpl implements Fibonacci {
    @Override
    public long getFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }
}
