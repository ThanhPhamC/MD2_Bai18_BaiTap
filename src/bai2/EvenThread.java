package bai2;

public class EvenThread extends Thread{
    private String name;
    public EvenThread(String name) {
        this.name=name;
    }
    public void  run(){
        try {
            for (int i = 0; i < 10; i++) {
                if (i%2==0){
                    System.out.println("So chan" +i);
                    Thread.sleep(15);
                }
            }
        }catch (InterruptedException e){
            System.out.println("my thread interrupted");
        }
    }
}
