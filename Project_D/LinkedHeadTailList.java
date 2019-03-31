import java.util.Arrays;

public class LinkedHeadTailList<T> implements HeadTailListInterface<T> {

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
        if (this.isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
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
    public void addBack(T newEntry){
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
    
    public void clear() {
        head = tail = null;
    }
    
    public T getEntry(int givenPosition) {
        Node currentNode = head;
        if (!this.isEmpty() && (givenPosition >= 0 && givenPosition < this.size())) {
            if (givenPosition == 0) {
                return head.data;
            } else if (givenPosition == this.size()) {
                return tail.data;
            } else {
                for (int i = 0; i < givenPosition; i++){
                    currentNode = currentNode.next;
                }
                return currentNode.data;
            }
        }
        return null;
    }
    
    public boolean isEmpty() {
        return this.size() == 0;
    }
    
    public int size() {
        int count = 0;
        Node currentNode = head;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.next;

        }
        return count;
    }
    
    private class Node {
        private T data; // Entry in list
        private Node next; // Link to next node

        private Node(T dataPortion) {
            data = dataPortion;
            next = null;
        } // end constructor

        private Node(T dataPortion, Node nextNode) {
            data = dataPortion;
            next = nextNode;
        } // end constructor

        private T getData() {
            return data;
        } // end getData

        private void setData(T newData) {
            data = newData;
        } // end setData

        private Node getNextNode() {
            return next;
        } // end getNextNode

        private void setNextNode(Node nextNode) {
            next = nextNode;
        } // end setNextNode
    } // end Node
} 

