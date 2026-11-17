class PriorityQ8 extends Thread {
    public void run() {
        System.out.println(getName() + " is running");
    }

    public static void main(String[] args) {
        PriorityQ8 t1 = new PriorityQ8();
        PriorityQ8 t2 = new PriorityQ8();

        t1.setName("High Priority");
        t2.setName("Low Priority");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        System.out.println(t1.getName() + ": " + t1.getPriority());
        System.out.println(t2.getName() + ": " + t2.getPriority());

        t1.start();
        t2.start();
    }
}
