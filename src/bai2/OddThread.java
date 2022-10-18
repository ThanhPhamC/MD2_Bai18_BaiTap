package bai2;

public class OddThread extends Thread {
    private String name;
    public OddThread(String name) {
        this.name=name;
    }
    public void  run(){
        try {
            for (int i = 0; i < 10; i++) {
                if (i%2!=0){
                    System.out.println("So le" +i);
                    Thread.sleep(10);
                }
            }
        }catch (InterruptedException e){
            System.out.println("my thread interrupted");
        }
    }
}
