package bai1;

public class NumberGenerator implements Runnable{
    private String name;
    public NumberGenerator(String name) {
        this.name=name;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.printf(" Doi tuong %s: Number: %d,+ Hashcode: %d\n",this.name, i ,this.hashCode());
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
                System.out.println("my thread interrupted");
        }
    }

}
