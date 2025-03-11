// 5. Daemon Threads
class DaemonThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Daemon Thread Running");
            try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}

// 6. 
