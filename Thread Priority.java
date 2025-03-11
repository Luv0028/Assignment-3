// 4. Thread Priority
class PriorityThread extends Thread {
    public PriorityThread(String name) {
        super(name);
    }
    public void run() {
        System.out.println(getName() + " is running");
    }
}

