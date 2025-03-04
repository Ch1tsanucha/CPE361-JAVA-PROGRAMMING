import java.util.Vector;

public class Stack {
    private Vector<Integer> stack;
    private int capacity;

    public Stack(int capacity) {
        this.stack = new Vector<>();
        this.capacity = capacity;
    }

    public void push(int number) {
        if (stack.size() >= capacity) {
            throw new IllegalStateException("Stack is Full");
        }
        stack.add(number);
    }

    public void pop() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is Empty");
        }
        stack.remove(stack.size() - 1);
    }

    public int top() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is Empty");
        }
        return stack.get(stack.size() - 1);
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public boolean isFull() {
        return stack.size() == capacity;
    }
}
