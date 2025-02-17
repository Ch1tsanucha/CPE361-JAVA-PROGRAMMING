class Queue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public Queue(int capacity) {
        this.queue = new int[capacity];
        this.capacity = capacity;
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    void enqueue(int number) {
        try {
            if (isFull()) {
                throw new IllegalStateException("Queue is Full");
            }
            rear = (rear + 1) % capacity;
            queue[rear] = number;
            size++;
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    void dequeue() {
        try {
            if (isEmpty()) {
                throw new IllegalStateException("Queue is Empty");
            }
            front = (front + 1) % capacity;
            size--;
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    int front() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is Empty");
        }
        return queue[front];
    }

    int rear() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is Empty");
        }
        return queue[rear];
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {
        Queue queue = new Queue(4);
        queue.enqueue(0);
        System.out.println("Front: " + queue.front());
        System.out.println("Rear: " + queue.rear());
        queue.enqueue(4);
        System.out.println("Front: " + queue.front());
        System.out.println("Rear: " + queue.rear());
        System.out.println("Size: " + queue.size());
        queue.dequeue();
        System.out.println("Size: " + queue.size());
        queue.dequeue();
        System.out.println("Size: " + queue.size());
        if (queue.isEmpty()) {
            System.out.println("Queue is Empty");
        }
    }
}
