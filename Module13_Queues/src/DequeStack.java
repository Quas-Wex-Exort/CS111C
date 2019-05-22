import java.util.EmptyStackException;

public class DequeStack<T> implements StackInterface<T> {

    private DequeInterface<T> deque;

    public DequeStack() {
        deque = new LinkedDeque<>();
    }

    public void push(T newEntry) {
        deque.addToFront(newEntry);
    }

    public T pop() {
        if (!deque.isEmpty()) {
            return deque.removeFront();
        } else {
            throw new EmptyStackException();
        }
    }

    public T peek() {
        if (!deque.isEmpty()) {
            return deque.getFront();
        } else {
            throw new EmptyStackException();
        }
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }

    public void clear() {
        deque.clear();
    }
}