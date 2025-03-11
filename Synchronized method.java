// 6. Synchronized Method
class BankAccount {
    private int balance = 1000;
    public synchronized void withdraw(int amount) {
        balance -= amount;
        System.out.println("Balance after withdrawal: " + balance);
    }
}

