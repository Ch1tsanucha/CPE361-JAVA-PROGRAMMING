//Circular Queue

public class Queue {
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

        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = number;
        size++;
    }

    void dequeue() {
        if (ismt()) {
            System.out.println("Queue is Full");
            return;
        }
        front = (front + 1) % capacity;
        size--;
    }

    void front() {
        System.out.println("front" + queue[front]);
    }

    void rear() {
        System.out.println("rear" + queue[rear]);
    }

    void size() {
        System.out.println("size " + size);
    }

    boolean ismt() {
        return size == 0;
    }

    boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {
        Queue queue = new Queue(4);
        queue.enqueue(0);
        queue.front();
        queue.rear();
        queue.enqueue(4);
        queue.front();
        queue.rear();
        queue.size();
        queue.dequeue();
        queue.size();
        queue.dequeue();
        queue.size();
        if(queue.ismt()){
            System.out.println("queue is Empty");
        }
    }
}
