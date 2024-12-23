public class Fibo {
    public static void main(String[] args) {
        System.out.println(goodFibo(30));
    }
    public static int badFibo(int n) {
        if (n == 0) {
            return 0;
        }
        return badFibo(n-1) + badFibo(n-2);	
    }

    public static int goodFibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return goodFibo(n-1) + goodFibo(n-2);	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
