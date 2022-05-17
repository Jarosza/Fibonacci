import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FibonacciDemoApp {
    static Map<Integer, BigInteger> results = new HashMap<>();
    public static void main(String[] args) {
        System.out.println("n");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        BigInteger result = fibo(n-1).add(fibo(n - 2));
        results.put(n, result);

        System.out.println(result);
    }
        static BigInteger fibo(int n) {
         if (n == 0) {
            return BigInteger.ZERO;
         }
         if (n == 1) {
            return BigInteger.ONE;
         }
         if(results.containsKey(n)){
             return results.get(n);
         }
         BigInteger result = fibo(n - 1).add(fibo(n - 2));
         results.put(n, result);

            return fibo(n - 1).add(fibo(n - 2));
    }
}