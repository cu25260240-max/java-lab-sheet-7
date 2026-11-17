class BankAccountQ11 {
    int balance = 10000;

    synchronized void withdraw(int amount) {
        balance = balance - amount;
    }
}

class SynchronizedQ11 {
    public static void main(String[] args) throws Exception {
        BankAccountQ11 b = new BankAccountQ11();

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
