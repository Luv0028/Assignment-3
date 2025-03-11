

// 2. Create a thread by implementing the Runnable interface
class HelloRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello, World!");
        }
    }
}
    

