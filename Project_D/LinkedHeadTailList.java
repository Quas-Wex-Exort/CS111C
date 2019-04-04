import java.util.Arrays;

public class LinkedHeadTailList<T extends Comparable<? super T>> implements HeadTailListInterface<T>, Comparable<LinkedHeadTailList<T>> {

    private Node head, tail;

    public LinkedHeadTailList() {
        
        head = null;
        tail = null;
    }
    
    /**
     * Adds a new entry to the beginning of the list. 
     * Entries currently in the list are shifted down.
     * The list's size is increased by 1.
     * 
     * @param newEntry The object to be added as a new entry.
     */
    public void addFront(T newEntry) {
        
        Node newNode = new Node(newEntry);
        if (!this.isEmpty()) {
            newNode.setNextNode(head);
            head = newNode;
        } else {
            tail = newNode;
            head = newNode;
        }
    }
    
    /**
     * Adds a new entry to the end of the list. 
     * Entries currently in the list are unaffected.
     * The list's size is increased by 1.
     * 
     * @param newEntry The object to be added as a new entry.
     */
    public void addBack(T newEntry) {
        
        Node newNode = new Node(newEntry);
        if (!this.isEmpty()) {
            newNode.setNextNode(null);
            tail.setNextNode(newNode);
            tail = newNode;
        } else {
            head = newNode;
            tail = newNode;
        }
    }
    
    /**
     * Removes an entry from the beginning of the list. 
     * Entries currently in the list are shifted up.
     * The list's size is decreased by 1.
     * 
     * @return A reference to the removed entry or null if the list is empty.
     */
    public T removeFront() {
        
        T headRemoved = null;
        if (!this.isEmpty()) {
            if (head != null) {
                headRemoved = this.head.data; // get old head's value
                head = head.next; // set new head 
            }
        }
        return headRemoved;
    }
    
    /**
     * Removes an entry from the end of the list. 
     * Entries currently in the list are unaffected.
     * The list's size is decreased by 1.
     * 
     * @return A reference to the removed entry or null if the list is empty.
     */
    public T removeBack() {
        
        T tailRemoved = null;
        if (!this.isEmpty()) {
            if (head == tail) { // singleton chain
                head = null;
                tail = null;
            } else {
                Node nodeBeforeTail = head;
                while (nodeBeforeTail.next != tail) {
                    nodeBeforeTail = nodeBeforeTail.next;
                }
                tail = nodeBeforeTail; // set new tail
                tailRemoved = tail.next.data; // get old tail's value
                tail.next = null; // delete original tail
            }
        } else {
            return null;
        }
        return tailRemoved;
    }
    
    /** 
     * Removes all entries from this list. 
     */
    public void clear() {
        head = tail = null;
    }
    
    /**
     * Retrieves the entry at a given position in this list.
     * 
     * @param givenPosition An integer that indicates the position of the desired entry.
     * @return A reference to the indicated entry or null if the index is out of bounds (less
     * than zero, greater than or equal to the size).
     */
    public T getEntry(int givenPosition) {
        
        Node currentNode = head;

        if (!this.isEmpty() && (givenPosition >= 0 && givenPosition < this.size()))  {
            int index = 0;
            while (index < givenPosition) {
                currentNode = currentNode.next;
                index++;
            }
            return currentNode.data;
        }
        return null;
    }
    
    /**
     * Displays the contents of the list to the console, in order.
     */
    public void display() {
        
        Node currentNode = head;
        T[] result = (T[]) new Comparable[size()];
        int index = 0;
        while (currentNode != null &&  index < this.size()) {
            result[index] = currentNode.data;
            currentNode = currentNode.next;
            index++;
        }
        
        if (!this.isEmpty()) {
            System.out.println(Arrays.toString(result) + "\t\thead= " + head.data + "\t\ttail= " + tail.data);
        } else {
            System.out.println("[]");
        }
    }
    
    /**
     * Checks whether this list contains a given entry.
     * 
     * @param anEntry the object to search for in the list.
     * @return the position of the entry that was found or -1 if the object is not found.
     */
    public int contains(T anEntry) {
        
        Node currentNode = head;
        int position = -1;
        boolean found = false;
        int index = 0;
        
        while (currentNode != null && !found && index < this.size()) {
            if (anEntry.equals(currentNode.data) {
                found = true;
                position = index;
            } else {
                currentNode = currentNode.next; 
                index++;
            }
        }
        return position;
    }
    
    /**
     * Gets the length of this list.
     * 
     * @return The integer number of entries currently in the list.
     */
    public int size() {
        int count = 0;
        Node currentNode = head;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.next;
        }
        return count;
    }
    
    /**
     * Checks whether this list is empty.
     * 
     * @return True if the list is empty, or false if the list contains one or more elements.
     */
    public boolean isEmpty() {
        return this.size() == 0;
    }
    
    /**
     * Implements comparable.
     * Compares the lists element by element.
     * If mismatched elements are found, compare the lists based on that element. 
     * If no mismatched elements are found after iterating through both lists, compare the lists by their sizes. 
     * Return 0 if both lists have the same length, -1 if the calling list is shorter, or 1 if parameter list is shorter.
     */
    @Override
    public int compareTo(LinkedHeadTailList<T> otherList) {
        
        int compareVal = Integer.compare(this.size(), otherList.size());
        Node currentNode = head;
        int position = 0;
        
        while (currentNode != null && otherList.getEntry(position) != null) {
            if ((currentNode.data.compareTo(otherList.getEntry(position))) < 0) {
                return -1;
            } else if ((currentNode.data.compareTo(otherList.getEntry(position))) > 0) {
                return 1;
            } else { // keep looking for mismatched elements...
                currentNode = currentNode.next;
                position++;
            }

        }
        // If all elements are equal, compare the lengths of lists.
        if (compareVal == 0) {
            return 0;
        } else {
            return (compareVal > 0 ? 1 : -1);
        }
    }

    @Override
    public int hashCode() {
        
        return Objects.hash(head, tail);
    }
    
    private class Node {
        
        private T data; // Entry in list
        private Node next; // Link to next node

        private Node(T dataPortion) {
            data = dataPortion;
            next = null;
        }

        private Node(T dataPortion, Node nextNode) {
            data = dataPortion;
            next = nextNode;
        }

        private T getData() {
            return data;
        }

        private void setData(T newData) {
            data = newData;
        }

        private Node getNextNode() {
            return next;
        }

        private void setNextNode(Node nextNode) {
            next = nextNode;
        }
    } // end Node
} 

