public class Stack {
    private int[] stack;
    private int size; // Represents the current size of the stack
    private int capacity; // Maximum capacity of the stack

    public Stack(int capacity) {
        this.stack = new int[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    void push(int number) {
        try {
            if (isFull()) {
                throw new IllegalStateException("Stack is Full");
            }
            stack[size] = number; // Add the element
            size++; // Move to the next index
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    void pop() {
        try {
            if (isEmpty()) {
                throw new IllegalStateException("Stack is Empty");
            }
            size--; // Move back one index to "remove" the top element
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    int top() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is Empty");
        }
        return stack[size - 1];
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
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        System.out.println("Top: " + stack.top());
        stack.pop();
        System.out.println("Top: " + stack.top());
        stack.push(3);
        System.out.println("Top: " + stack.top());
        System.out.println("Size: " + stack.size());
        stack.pop();
        System.out.println("Top: " + stack.top());
    }
}
