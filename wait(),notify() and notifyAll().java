/ 9. Using wait(), notify(), and notifyAll()
class ProducerConsumer {
    private int data;
    private boolean available = false;
    public synchronized void produce(int value) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        data = value;
        available = true;
        notify();
    }
    public synchronized int consume() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        available = false;
        notify();
        return data;
    }
}




