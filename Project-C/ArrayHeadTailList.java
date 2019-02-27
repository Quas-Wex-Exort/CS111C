import java.util.Arrays;

/**
 * Array-based implementation of this course's HeadTailListInterface.
 */ 
public class ArrayHeadTailList<T> implements HeadTailListInterface<T> {

    private T[] listArray;
    private int numberOfElements;
  
    public ArrayHeadTailList(int initialCapacity) {
        // This format is based on array-based implementation from Module 4
        if (initialCapacity < 1) {
            //initialCapacity = SOMEDEFAULTCAPACITYHERE;
            initialCapacity = 1; // ???
        }
        listArray = (T[]) new Object[initialCapacity];
    }
    
    @Override
    public void addFront(T newEntry) {
        if (isEmpty()) {
            listArray[0] = newEntry;
            numberOfElements++;
        } else if (!isEmpty() && numberOfElements == listArray.length) {
            int doubledCapacity = listArray.length * 2;
            // when the array is full, expand the array by doubling
            // shift everything down +1
            // Maybe create a temporary list holder, add newEntry to first index of that temp list
            // then copy temp list to listArray(which has doubled in size)? 
            // Check ensureCapacity() from previous modules
	    tempListArray = (T[]) new Object[doubledCapacity]; // ????
		
		
            numberOfElements++;
        } else { // numberOfElements > 0, but not full
            for (int i = numberOfElements; i > 0; i--) {
				listArray[i] = listArray[i - 1];
            }
            listArray[0] = newEntry;
            numberOfElements++;
        }
    }
    
    @Override
    public void addBack(T newEntry) {
        if (numberOfElements == listArray.length) { // if full
            int doubledCapacity = listArray.length * 2; // when the array is full, expand the array by doubling
            listArray = Arrays.copyOf(listArray, doubledCapacity);
        }
        // Add newEntry to end of the list: Find the first occurrence of null after the last element, 
        // that is probably the end of the list.
        /* for (int i = 0; i < listArray.Length; i++) {
               if (listArray[i].equals(null) {
                   listArray[i] = newEntry;
                   break;
               }
           }
           numberOfElements++;
          */
    }
    
    @Override
    public T removeFront() {
        if (!isEmpty()) {
            T firstElementRemoved = listArray[0];
            /* 
           
            Shifting happens here...
            
            */
            numberOfElements -= 1; // decrease list size by 1
            return firstElementRemoved; // reference to the removed item
        } else {
            return null; // if list is empty
        }
    }
    
    @Override
    public T removeBack() {
        // Simplified below
        //return (!isEmpty()) ? listArray[numberOfElements - 1] : null;
        if (!isEmpty()) {
            return listArray[numberOfElements - 1]; // reference to the removed item
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
                return i; // the position of the entry that was found
            }
        }
        return -1; // not found
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
