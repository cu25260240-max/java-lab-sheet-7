class JoinQ7 extends Thread {
    public void run() {
        int sum = 0;

        for (int i = 1; i <= 10000; i++) {
            sum += i;
        }

        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) throws Exception {
        JoinQ7 t = new JoinQ7();

        t.start();
        t.join();

        System.out.println("Task finished");
    }
}
