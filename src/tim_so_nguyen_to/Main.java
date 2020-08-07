package tim_so_nguyen_to;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new LazyPrimeFactorization());
        Thread t2 = new Thread(new OptimizedPrimeFactorization());
        t2.start();
        t1.start();
    }
}
