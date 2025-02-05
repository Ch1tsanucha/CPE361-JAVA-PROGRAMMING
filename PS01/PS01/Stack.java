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
        if (isFull()) {
            System.out.println("Stack is Full");
            return;
        }
        stack[size] = number; // Add the element
        size++; // Move to the next index
    }

    void pop() {
        if (ismt()) {
            System.out.println("Stack is Empty");
            return;
        }
        size--; // Move back one index to "remove" the top element
    }

    void top() {
        if (ismt()) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Top: " + stack[size - 1]);
    }

    void size() {
        System.out.println("Size: " + size);
    }

    boolean ismt() {
        return size == 0;
    }

    boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.top();
        stack.pop();
        stack.top();
        stack.push(3);
        stack.top();
        stack.size();
        stack.pop();
        stack.top();
    }
}
