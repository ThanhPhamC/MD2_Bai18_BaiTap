package bai3;

public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization l1 = new LazyPrimeFactorization(11);
        OptimizedPrimeFactorization o1 = new OptimizedPrimeFactorization(11);
//        l1.run();
//        o1.run();
        Thread t1 = new Thread(l1);
        Thread t2 = new Thread(o1);
        t1.start();
        t2.start();
    }
}
