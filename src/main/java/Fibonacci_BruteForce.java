public class Fibonacci_BruteForce {
    public int fib(int n) {
        // https://visualgo.net/en/recursion
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
