class RunnableQ2 implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Pooja");
            try {
                Thread.sleep(200);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        RunnableQ2 r = new RunnableQ2();
        Thread t = new Thread(r);
        t.start();
    }
}