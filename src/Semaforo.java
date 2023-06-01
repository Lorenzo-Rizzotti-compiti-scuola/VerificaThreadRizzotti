public class Semaforo {
    private volatile int value = 0;

    public synchronized void lock() throws InterruptedException {
        while (value > 2) {
            wait();
        }
        value++;
    }

    public synchronized void release() {
        value--;
        notify();
    }
}
