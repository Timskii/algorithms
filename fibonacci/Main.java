package fibonacci;

import fibonacci.impl.FibonacciRecursiveImpl;

public class Main {
    public static void main(String[] args) {
        Fibonacci fibonacciRecursive = new FibonacciRecursiveImpl();
        int n = 10;
        System.out.println(fibonacciRecursive.getFibonacci(n));
    }
}
