class MyThreadQ5 extends Thread {
    MyThreadQ5(String name) {
        super(name);
    }

    public void run() {
        try {
            Thread.sleep((int)(Math.random() * 501));
            System.out.println(getName() + " is working");
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class RandomThreadQ5 {
    public static void main(String[] args) {
        new MyThreadQ5("Reader").start();
        new MyThreadQ5("Writer").start();
        new MyThreadQ5("Logger").start();
    }
}
