class BankAccountQ12 {
    int balance = 10000;
    Object lock = new Object();

    void withdraw(int amount) {
        synchronized (lock) {
            balance = balance - amount;
        }
    }
}

class SyncBlockQ12 {
    public static void main(String[] args) throws Exception {
        BankAccountQ12 b = new BankAccountQ12();

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++)
                b.withdraw(1);
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++)
                b.withdraw(1);
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Balance: " + b.balance);
    }
}
