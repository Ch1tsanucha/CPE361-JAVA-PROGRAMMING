import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestDataStructures {

    private Stack stack;
    private Queue queue;

    @BeforeEach
    public void setUp() {
        stack = new Stack(3);  // Set stack capacity to 3
        queue = new Queue(3);  // Set queue capacity to 3
    }

    @Test
    public void testStackPushPop() {
        stack.push(10);
        stack.push(20);
        stack.push(30);

        assertEquals(30, stack.top());
        stack.pop();
        assertEquals(20, stack.top());
        stack.pop();
        assertEquals(10, stack.top());
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testStackOverflow() {
        stack.push(10);
        stack.push(20);
        stack.push(30);

        assertThrows(IllegalStateException.class, () -> stack.push(40));  // Should throw overflow error
    }

    @Test
    public void testQueueEnqueueDequeue() {
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        assertEquals(10, queue.front());
        queue.dequeue();
        assertEquals(20, queue.front());
        queue.dequeue();
        assertEquals(30, queue.front());
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testQueueOverflow() {
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        assertThrows(IllegalStateException.class, () -> queue.enqueue(40));  // Should throw overflow error
    }

    @Test
    public void testStackUnderflow() {
        assertThrows(IllegalStateException.class, () -> stack.pop());  // Should throw underflow error
    }

    @Test
    public void testQueueUnderflow() {
        assertThrows(IllegalStateException.class, () -> queue.dequeue());  // Should throw underflow error
    }
}
