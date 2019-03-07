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
    
    /*
    @Override
    public int contains(T anEntry) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(anEntry)) {
                return i;
            }
        }

        return -1;
    }
    */
    public int contains(T anEntry) {
        if (list.contains(anEntry)) {
            return list.indexOf(anEntry);
        } else {
            return -1;
        }
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
