class BankAccountQ10 {
    int balance = 10000;

    void withdraw(int amount) {
        int temp = balance;

        try {
            Thread.sleep(1);
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }

        balance = temp - amount;
    }
}

class RaceConditionQ10 {
    public static void main(String[] args) throws Exception {
        BankAccountQ10 b = new BankAccountQ10();

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
