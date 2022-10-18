package bai1;

public class Main {

    public static void main(String[] args) {
        NumberGenerator n1 = new NumberGenerator("thanh");
        NumberGenerator n2 = new NumberGenerator("hung");
        Thread t1 = new Thread(n1);
        Thread t2 = new Thread(n2);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }
}
