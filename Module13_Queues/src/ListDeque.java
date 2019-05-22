import java.util.ArrayList;
import java.util.List;

public class ListDeque<T> implements DequeInterface<T> {

    private List <T> list;
    private int size;

    public ListDeque() {
        list = new ArrayList<>();
        size = 0;
    }

    public void addToFront(T newEntry) {
        list.add(0,newEntry);
        size++;
    }

    public void addToBack(T newEntry) {
        list.add(newEntry);
        size++;
    }

    public T removeFront() {
        if (!list.isEmpty()) {
            return list.remove(0);
        } else {
            throw new EmptyQueueException();
        }

    }

    public T removeBack() {
        if (!list.isEmpty()) {
            return list.remove(list.size()-1);
        } else {
            throw new EmptyQueueException();
        }
    }

    public T getFront() {
        if (!list.isEmpty()) {
            return list.get(0);
        } else {
            throw new EmptyQueueException();
        }
    }

    public T getBack() {
        if (!list.isEmpty()) {
            return list.get(list.size()-1);
        } else {
            throw new EmptyQueueException();
        }
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void clear() {
        list.clear();
        size = 0;
    }
    
    

}
