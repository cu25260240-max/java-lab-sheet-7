class BufferQ13 {
    int value;
    boolean available = false;

    synchronized void produce(int n) throws Exception {
        while (available)
            wait();

        value = n;
        available = true;

        System.out.println("Produced: " + n);
        notifyAll();
    }

    synchronized void consume() throws Exception {
        while (!available)
            wait();

        System.out.println("Consumed: " + value);
        available = false;

        notifyAll();
    }
}

class ProducerConsumerQ13 {
    public static void main(String[] args) {
        BufferQ13 b = new BufferQ13();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++)
                    b.produce(i);
            }
            catch (Exception e) {
                System.out.println(e);
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++)
                    b.consume();
            }
            catch (Exception e) {
                System.out.println(e);
            }
        });

        producer.start();
        consumer.start();
    }
}
