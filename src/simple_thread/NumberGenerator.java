package simple_thread;

public class NumberGenerator implements Runnable{
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + "hashcode: " + hashCode());
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
