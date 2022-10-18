package bai3;

public class OptimizedPrimeFactorization implements Runnable {
    private int n;

    public OptimizedPrimeFactorization(int n) {
        this.n = n;
    }
    public void run(){
        if (this.n<2){
            System.out.printf("%d khong la so nguyen to",this.n);
        }else {
            boolean check= true;
            for (int i = 2; i <= Math.pow(this.n,0.5); i++) {
                if (this.n % i != 0) {
                } else {
                    check=false;
                    break;
                }
            }  if (check){
                System.out.println("kiem tra theo oz "+ this.n+ " la so nguyen to");
            }else {
                System.out.println("kiem tra theo oz "+ this.n+ " khong la so nguyen to");

            }

        }
    }
}
