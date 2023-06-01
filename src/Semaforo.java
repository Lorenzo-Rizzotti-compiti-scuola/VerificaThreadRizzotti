public class Semaforo {
    private volatile boolean isLocked = false;

    public synchronized void lock() throws InterruptedException {
        while (isLocked) {
            wait();
        }
        isLocked = true;
    }

    public synchronized void release() {
        isLocked = false;
        notify();
    }
}
