// 8. Thread Deadlock
class DeadlockExample {
    static final Object lock1 = new Object();
    static final Object lock2 = new Object();
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                synchronized (lock2) {
                    System.out.println("Thread 1 locked both resources");
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                synchronized (lock1) {
                    System.out.println("Thread 2 locked both resources");
                }
            }
        });
        t1.start();
        t2.start();
    }
}


