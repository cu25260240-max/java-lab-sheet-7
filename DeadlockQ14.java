class DeadlockQ14 {
    static Object Lock1 = new Object();
    static Object Lock2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (Lock1) {
                System.out.println("Thread 1 locked Lock1");

                try {
                    Thread.sleep(100);
                }
                catch (Exception e) {}

                synchronized (Lock2) {
                    System.out.println("Thread 1 locked Lock2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (Lock2) {
                System.out.println("Thread 2 locked Lock2");

                try {
                    Thread.sleep(100);
                }
                catch (Exception e) {}

                synchronized (Lock1) {
                    System.out.println("Thread 2 locked Lock1");
                }
            }
        });

        t1.setDaemon(true);
        t2.setDaemon(true);

        t1.start();
        t2.start();
    }
}
