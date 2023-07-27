import java.util.LinkedList;

class Buffer {
    private LinkedList<Integer> buffer;
    private int capacity;

    public Buffer(int capacity) {
        this.buffer = new LinkedList<>();
        this.capacity = capacity;
    }

    public void produce(int value) throws InterruptedException {
        synchronized (this) {
            while (buffer.size() == capacity) {
                wait();
            }

            buffer.add(value);
            System.out.println("Produced: " + value);
            notifyAll();
        }
    }

    public void consume() throws InterruptedException {
        synchronized (this) {
            while (buffer.isEmpty()) {
                wait();
            }

            int value = buffer.removeFirst();
            System.out.println("Consumed: " + value);
            notifyAll();
        }
    }
}

class Producer implements Runnable {
    private Buffer buffer;
    private int numProductions;

    public Producer(Buffer buffer, int numProductions) {
        this.buffer = buffer;
        this.numProductions = numProductions;
    }

    @Override
    public void run() {
        for (int i = 0; i < numProductions; i++) {
            try {
                buffer.produce(i);
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    private Buffer buffer;
    private int numConsumptions;

    public Consumer(Buffer buffer, int numConsumptions) {
        this.buffer = buffer;
        this.numConsumptions = numConsumptions;
    }

    @Override
    public void run() {
        for (int i = 0; i < numConsumptions; i++) {
            try {
                buffer.consume();
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ProducerConsumerITC {
    public static void main(String[] args) {
    System.out.println("Name : APARNA MOHAN");
        System.out.println("Reg no : SJC 22MCA-2013");
        System.out.println("Course code : 20MCA132");
        System.out.println("Date : 27/6/2023");
        Buffer buffer = new Buffer(5);
        int numProductions = 10;
        int numConsumptions = 10;

        Producer producer = new Producer(buffer, numProductions);
        Consumer consumer = new Consumer(buffer, numConsumptions);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
    }
}

