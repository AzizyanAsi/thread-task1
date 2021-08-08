public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
        MyThread T1 = new MyThread();

        T1.start();
        Thread.sleep(1000);
        T1.isActive = false;

    }
}
