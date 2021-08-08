public class MyThread extends Thread {
    volatile boolean isActive = true;

    @Override
    public void run() {
        while (isActive) {
        }
        System.out.println("Thread is finished");
    }
}
