import java.util.Vector;

public class Queue {
    private Vector<Integer> queue;
    private int capacity;

    public Queue(int capacity) {
        this.queue = new Vector<>();
        this.capacity = capacity;
    }

    public void enqueue(int number) {
        if (queue.size() >= capacity) {
            throw new IllegalStateException("Queue is Full");
        }
        queue.add(number);
    }

    public void dequeue() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Queue is Empty");
        }
        queue.remove(0);
    }

    public int front() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Queue is Empty");
        }
        return queue.get(0);
    }

    public int rear() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Queue is Empty");
        }
        return queue.get(queue.size() - 1);
    }

    public int size() {
        return queue.size();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public boolean isFull() {
        return queue.size() == capacity;
    }
}
