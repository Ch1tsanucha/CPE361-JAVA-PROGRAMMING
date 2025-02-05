// Rewritten Stack class
class Stack extends MyBuffer {
    int top;

    // Constructor with default size
    Stack() {
        this(10);
    }

    // Constructor with specified size
    Stack(int size) {
        super(size);
        top = -1;
    }

    // Push method to add an element to the stack
    public void push(int x) {
        if (top < items.length - 1) {
            items[++top] = x;
        } else {
            System.out.println("Stack overflow");
        }
    }

    // Pop method to remove and return the top element of the stack
    public int pop() {
        if (top >= 0) {
            return items[top--];
        } else {
            System.out.println("Stack underflow");
            return -1; // Return an invalid value to indicate an error
        }
    }
}

// Rewritten Queue class
class Queue extends MyBuffer {
    int head, tail, count;

    // Constructor with default size
    Queue() {
        this(10);
    }

    // Constructor with specified size
    Queue(int size) {
        super(size);
        head = 0;
        tail = 0;
        count = 0;
    }

    // Add method to enqueue an element
    public void add(int x) {
        if (count < items.length) {
            items[tail] = x;
            tail = (tail + 1) % items.length;
            count++;
        } else {
            System.out.println("Queue overflow");
        }
    }

    // Delete method to dequeue and return an element
    public int delete() {
        if (count > 0) {
            int value = items[head];
            head = (head + 1) % items.length;
            count--;
            return value;
        } else {
            System.out.println("Queue underflow");
            return -1; // Return an invalid value to indicate an error
        }
    }
}

// MyBuffer base class
class MyBuffer {
    int[] items;

    // Constructor with specified size
    MyBuffer(int size) {
        items = new int[size];
    }

    // Method to display the buffer contents
    public void showBuffer() {
        System.out.print("{");
        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i]);
            if (i < items.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    // Method to calculate the average of the buffer
    public double average() {
        double sum = 0;
        for (int i = 0; i < items.length; i++) {
            sum += items[i];
        }
        return (items.length > 0) ? (sum / items.length) : 0.0;
    }
}

// Main application class
public class EX02 {
    public static void main(String[] args) {
        int i;
        Stack st = new Stack(10);
        Queue q = new Queue(10);

        // Test push and add operations
        for (i = 0; i < 11; i++) {
            st.push(i);
            q.add(i);
        }

        // Test pop and delete operations
        for (i = 0; i < 10; i++) {
            System.out.printf("%d, %d\n", st.pop(), q.delete());
        }

        // Repeat to ensure correctness
        for (i = 0; i < 10; i++) {
            st.push(i);
            q.add(i);
        }

        for (i = 0; i < 11; i++) {
            System.out.printf("%d, %d\n", st.pop(), q.delete());
        }
    }
}
