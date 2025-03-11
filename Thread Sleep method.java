// 3. Thread Sleep Method
class SleepThread extends Thread {
    private String message;
    private int delay;

    public SleepThread(String message, int delay) {
        this.message = message;
        this.delay = delay;
    }

    public void run() {
        while (true) {
            System.out.println(message);
            try { Thread.sleep(delay); } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}

