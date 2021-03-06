package chapter1.exercise1;

import edu.princeton.cs.algs4.StdOut;

import java.math.BigInteger;

/**
 * Fibonacci数列
 * 运行一个小时，看能得到结果的N最大是多少
 */
public class Question19_Fibonacci {
    public static void main(String[] args) {
        for (int N = 0; N < 100; N++)
            StdOut.println(N + " " + fibonacci2(N));
    }

    private static long fibonacci1(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return fibonacci1(N - 1) + fibonacci1(N - 2);
    }

    private static BigInteger[] fib = new BigInteger[100];

    /**
     * 采用数组保存已计算过的值，瞬间计算完毕
     */
    private static BigInteger fibonacci2(int N) {
        if (N == 0) fib[0] = new BigInteger("0");
        else if (N == 1) fib[1] = new BigInteger("1");
        else {
            if (fib[N] == null)
                fib[N] = fibonacci2(N - 1).add(fibonacci2(N - 2));
        }
        return fib[N];
    }
}
