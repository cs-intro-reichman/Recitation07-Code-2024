public class Factorial {

    public static void main(String[] args) {

    }
    public static long iterativeFactorial(int n) {
        if (n <= -1) {
            throw new ArithmeticException(n + " cannot be negative!");
        } 
        if (n <= 1) {
            return 1;
        } 
        long res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        assert res > 0: "overflow has been occurred";
        return res;
    }

    public static int recursiveFactorial(int n) {
        if (n <= -1) {
            throw new ArithmeticException(n + " cannot be negative!");
        } 
        if (n <= 1) {
            return 1;
        } 
        int res = n * recursiveFactorial(n - 1);
        assert (res % n == 0) : "overflow has been occurred";
        return res;
    }
        
}

        