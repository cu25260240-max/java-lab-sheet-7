class MyThreadQ4 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + ": " + i);
        }
    }
}

class TwoThreadQ4 {
    public static void main(String[] args) {
        MyThreadQ4 t1 = new MyThreadQ4();
        MyThreadQ4 t2 = new MyThreadQ4();

        t1.setName("Thread 1");
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}
