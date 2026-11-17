class MyThreadQ9 extends Thread {
    public void run() {
        System.out.println(getName() + " Priority: " + getPriority());
    }
}

class FiveThreadQ9 {
    public static void main(String[] args) {
        int p[] = {2, 4, 6, 8, 10};

        for (int i = 0; i < 5; i++) {
            MyThreadQ9 t = new MyThreadQ9();
            t.setName("Thread " + (i + 1));
            t.setPriority(p[i]);
            t.start();
        }
    }
}
