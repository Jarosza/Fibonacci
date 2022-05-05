import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class FibonacciDemoApp {


    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++){
            System.out.println(i + " ==>" + fibo(i));
        }
    }

        static Map<Integer, BigInteger> results = new HashMap<>();

        static BigInteger fibo(int n){
            if (n == 0) {
                return BigInteger.ZERO;
            }
            if(n == 1) {
                return BigInteger.ONE;
            }
            if (results.containsKey(n)){
                return results.get(n);
            }


            BigInteger result = fibo(n-1).add(fibo(n - 2));
            results.put(n, result);

            return result;

        }
}