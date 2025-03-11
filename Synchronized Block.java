// 7. Synchronized Block
class SyncBlockExample {
    private int balance = 1000;
    public void withdraw(int amount) {
        synchronized (this) {
            balance -= amount;
            System.out.println("Balance after withdrawal: " + balance);
        }
    }
}

