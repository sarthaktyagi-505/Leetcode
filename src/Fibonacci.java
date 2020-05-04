public class Fibonacci {
    public int fib(int N) {
        if(N == 0)
            return 0;
        if(N == 1)
            return 1;
        else
            return fib(N-1) + fib(N-2);

    }

    public static void main(String[] args) {
        int N = 10;
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fib(N));
    }
}
