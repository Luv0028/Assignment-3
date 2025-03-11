// 10. Stopping a Thread
class StopThreadExample {
    private volatile boolean running = true;
    public void run() {
        int i = 1;
        while (running) {
            System.out.println(i++);
        }
    }
    public void stop() {
        running = false;
    }
}



