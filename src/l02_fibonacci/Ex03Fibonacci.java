package l02_fibonacci;

import java.math.BigInteger;

/**
 * Created by R.Karimov on 8/25/17.
 */
public class Ex03Fibonacci {

    private static final int MOD = (int) 1e9 + 7;

    private static BigInteger fibonacci(long n) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;

        for (int i = 0; i < n; i++) {
            BigInteger c = a.add(b);
            // a, b <- b, c
            a = b;
            b = c;
        }
        return a;
    }

    BigInteger run2(BigInteger n, BigInteger m) {
        return n;
    }

    public static <T> T run(T n, int m, Class<T> cl) {

//        int a = (int) n;
        return cl.cast(n);

//        System.out.println(n);
//        BigInteger result = fibonacci(n);
//        System.out.println(n + ": " + result);
//        System.out.println(n + " % MOD: " + result.mod(BigInteger.valueOf(MOD)));
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
//        new Ex03Fibonacci().run(111111);
        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime + " ms");
    }
}
