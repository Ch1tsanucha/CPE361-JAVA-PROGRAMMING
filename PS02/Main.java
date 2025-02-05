class Buffer {
    protected int[] items;
    protected int size = 0;
    protected int header = 0;
    protected int isQueue = 0;
    public void showBuffer() {
        // Display the contents of the buffer
        System.out.println(java.util.Arrays.toString(items));
    }
    
    public double average() {
        // Calculate the average of the elements in the buffer
        double sum = 0;
        System.out.println("header = "+header);
        for (int i = header; i< size+isQueue ;i++) {
            sum += items[i];
        }
         System.out.println("sum = "+sum);
         System.out.println("szie = "+size);

        return sum / size;
    }


}

class Stack extends Buffer {
    private int top = -1;
    public void push(int x) {
        // Push an element onto the stack
        items[++top] = x;
        size++;
    }
    
    public int pop() {
        // Pop an element from the stack
        size--;
        return items[top--];
    }
}

class Queue extends Buffer {
    private int head = 0;
    private int tail = 0;

    public Queue(){
        isQueue = 1;
    }
    
    public void add(int x) {
        
        // Add an element to the rear of the queue
        items[tail] = x;
        tail = (tail + 1) % items.length;
        size++;
    }
    
    public int delete() {
        // Remove an element from the front of the queue
        int x = items[head];
        head = (head + 1) % items.length;
        header = (header + 1 )% items.length;
        size--;
        return x;
    }
}

public class Main {
    public static void main(String[] args) {
        // Stack example
        Stack stack = new Stack();
        stack.items = new int[5];
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack:");
        stack.showBuffer();
        System.out.println("Popped: " + stack.pop());
        System.out.println("Average: " + stack.average());

        // Queue example
        Queue queue = new Queue();
        queue.items = new int[5];
        queue.add(4);
        queue.add(5);
        queue.add(6);
        System.out.println("\nQueue:");
        queue.showBuffer();
        System.out.println("Deleted: " + queue.delete());
        System.out.println("Average: " + queue.average());
    }
}