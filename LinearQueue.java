package dsae;

public class LinearQueue {
    private int maxSize; // maximum size of the queue
    private int[] queueArray; // array to store elements
    private int front; // front of the queue
    private int rear; // rear of the queue
    private int currentSize; // current size of the queue

    // Constructor to initialize the queue
    public LinearQueue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return (currentSize == 0);
    }

    // Check if the queue is full
    public boolean isFull() {
        return (currentSize == maxSize);
    }

    // Get the current size of the queue
    public int size() {
        return currentSize;
    }

    // Insert an element at the rear of the queue
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue element.");
            return;
        }
        rear = (rear + 1) % maxSize; // Wrap around to the beginning if rear reaches the end
        queueArray[rear] = item;
        currentSize++;
        System.out.println("Enqueued: " + item);
    }

    // Remove and return the element at the front of the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue element.");
            return -1;
        }
        int removedItem = queueArray[front];
        front = (front + 1) % maxSize; // Wrap around to the beginning if front reaches the end
        currentSize--;
        System.out.println("Dequeued: " + removedItem);
        return removedItem;
    }

    // Get the element at the front of the queue without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return queueArray[front];
    }
}

public class Main {
    public static void main(String[] args) {
        LinearQueue queue = new LinearQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println("Queue size: " + queue.size());
        System.out.println("Front of the queue: " + queue.peek());

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        System.out.println("Queue size: " + queue.size());
        System.out.println("Front of the queue: " + queue.peek());

        queue.enqueue(60);
        queue.enqueue(70);

        System.out.println("Queue size: " + queue.size());
        System.out.println("Front of the queue: " + queue.peek());
    }
}