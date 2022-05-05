import java.math.BigInteger;

public class FibonacciDemoApp {


    public static void main(String[] args) {
        for (int i = 1; i < 50; i++){
            System.out.println(i + " ==>" + fibo(i));
        }
    }

        static BigInteger fibo (int n){
            if (n == 0) {
                return BigInteger.ZERO;
            }
            if (n == 1) {
                return BigInteger.ONE;
            }

            return fibo(n - 1).add(fibo(n - 2));

        }
}