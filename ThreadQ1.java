class ThreadQ1 extends Thread {
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
        ThreadQ1 t = new ThreadQ1();
        t.start();
    }
}