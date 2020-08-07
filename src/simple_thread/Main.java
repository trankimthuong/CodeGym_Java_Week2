package simple_thread;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new NumberGenerator());
        Thread t2 = new Thread(new NumberGenerator());
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}
