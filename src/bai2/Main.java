package bai2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        OddThread o1 = new OddThread("Odd");
        EvenThread e1 = new EvenThread("Even");
        o1.start();
        o1.join();
        e1.start();
//
//        Thread t1 = new Thread(o1);
//        Thread t2 = new Thread(e1);
//
//        t1.start();
//        t1.join();
//        t2.start();

    }
}
