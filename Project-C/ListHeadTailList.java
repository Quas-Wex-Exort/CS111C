import java.util.*;

public class ListHeadTailList<T> implements HeadTailListInterface<T> {

    private List<T> list;

    public ListHeadTailList(int initialCapacity) {
        if (initialCapacity < 1) {
            initialCapacity = 1;
        }
        list = new ArrayList<T>(initialCapacity);
    }

    public void addFront(T anEntry) {
        list.add(0, anEntry);
    }

    public void addBack(T anEntry) {
        list.add(anEntry);
    }

    @Override
    public T removeFront() {
        if (!isEmpty()) {
            return list.remove(0);
        } else {
            return null;
        }
    }

    @Override
    public T removeBack() {
        if (!isEmpty()) {
            return list.remove(list.size()-1);
        } else {
            return null;
        }
    }

    @Override
    public void clear() {
        for (int index = 1; index <= list.size(); index++)
            list.clear();
    }

    @Override
    public T getEntry(int givenPosition) {
        if (!isEmpty() && givenPosition > -1 && givenPosition <= list.size()) {
            return list.get(givenPosition);
        } else {
            return null;
        }
    }

    @Override
    public void display() {
        System.out.println(Arrays.toString(list.toArray()));

    }
   
    public int contains(T anEntry) {
        return list.indexOf(anEntry);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

}
