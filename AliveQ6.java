class AliveQ6 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Running " + i);
            try {
                Thread.sleep(300);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        AliveQ6 t = new AliveQ6();

        System.out.println("Before start: " + t.isAlive());

        t.start();
        Thread.sleep(100);

        System.out.println("While running: " + t.isAlive());

        t.join();
        System.out.println("After finish: " + t.isAlive());
    }
}
