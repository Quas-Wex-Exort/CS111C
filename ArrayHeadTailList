import java.util.Arrays;

public class ArrayHeadTailList<T> implements HeadTailListInterface<T> {

    private T[] listArray;
    private int numberOfElements;

    public ArrayHeadTailList(int initialCapacity) {
    // if initialCapacity < 1, can set initialCapacity to 1 or greater?
    // if initialCapacity < 1) { initialCapacity = some default value }
    
    // This format is based on array-based implementation from Module 4
        T[] tempList = (T[]) new Object[initialCapacity];
        listArray = tempList;
        numberOfElements = 0;
    }
    
    @Override
    public T getEntry(int position) {
        if (!isEmpty() && (position > -1 && position <= numberOfElements)) {
            return listArray[position];
        } else {
            return null; // according to interface specification
        }
    }
    
    @Override
    public int contains(T anEntry) {
        for (int i = 0; i < numberOfElements; i++) {
            if (listArray[i].equals(anEntry) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void clear() {
        for (int i = 0; i < numberOfElements; i++) {
            listArray[i] = null;
        }
        numberOfElements = 0;

        /*
        for (T element : listArray) {
            element = null;
        }
        numberOfElements = 0;
        */
    }

    @Override
    public int size() {
        return numberOfElements;
    }

    @Override
    public boolean isEmpty() {
        return (numberOfElements == 0);
        /* if (numberOfElements == 0) {
               return true;
           } else {
               return false;
           }
        */
    }

}
