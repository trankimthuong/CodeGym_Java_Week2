package hien_thi_so_chan_le;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new EvenThread();
        Thread t2 = new OddThread();

        t2.start();
        try {
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        t1.start();

    }
}
