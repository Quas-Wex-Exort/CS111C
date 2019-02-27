import java.util.Arrays;

public class ArrayHeadTailList<T> implements HeadTailListInterface<T> {

    private T[] listArray;
    private int numberOfElements;
    final private int DEFAULTCAPACITY = 20;

    public ArrayHeadTailList(int initialCapacity) {
    // This format is based on array-based implementation from Module 4
        if (initialCapacity < 1) {
            initialCapacity = DEFAULTCAPACITY;
        }
        listArray - (T[]) new Object[initialCapacity];
    }
    
    @Override
    public void addFront(T newEntry) {
        
    }
    
    @Override
    public void addBack(T newEntry) {
        
    }
    
    @Override
    public T removeFront() {
    
    }
    
    @Override
    public T removeBack() {
        // Simplified below
        //return (!isEmpty()) ? listArray[numberOfElements - 1] : null;
        if (!isEmpty()) {
            return listArray[numberOfElements - 1];
        } else {
            return null; // if list is empty
        }
    }
    
    @Override
    public void display() {
    
    }
    
    @Override
    public T getEntry(int position) {
        if (!isEmpty() && (position > -1 && position <= numberOfElements)) {
            return listArray[position]; // reference to the indicated entry
        } else {
            return null; // according to interface specification, return null if index is out of bounds
        }
    }
    
    @Override
    public int contains(T anEntry) {
        for (int i = 0; i < numberOfElements; i++) {
            if (listArray[i].equals(anEntry) {
                return i;
            }
        }
        return -1; // according to interface specification
    }
    
    // Removes elements But does it retain the capacity??
    @Override
    public void clear() {
        for (int i = 0; i < numberOfElements; i++) {
            listArray[i] = null;
        }
        numberOfElements = 0;
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
