package bai3;

public class LazyPrimeFactorization implements Runnable {
    private int n;

    public LazyPrimeFactorization(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        if (this.n < 2) {
            System.out.println("%s khong la so nguyen to" + this.n);
        } else {
            boolean check =true;
            for (int i = 2; i < this.n; i++) {
                    if (this.n % i != 0) {

                    } else {
                        check=false;
                        break;
                    }
            }
            if (check){
                System.out.println("kiem tra theo lazy "+ this.n+ " la so nguyen to");
            }else {
                System.out.println("kiem tra theo lazy "+ this.n+ " khong la so nguyen to");
            }
        }


    }
}
