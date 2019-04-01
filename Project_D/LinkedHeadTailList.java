import java.util.Arrays;

public class LinkedHeadTailList<T> implements HeadTailListInterface<T> {

    private Node head, tail;

    public LinkedHeadTailList() {
        head = null;
        tail = null;
    }
    
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
    
    public T removeFront() {
        T elementRemoved = null;
        if (!this.isEmpty()) {
            if (head != null) {
                elementRemoved = this.head.data;
                head = head.next;
            }
        }
        return elementRemoved;
    }
    
    public T removeBack() {
    
    }
    
    public void clear() {
        head = tail = null;
    }
    
    public T getEntry(int givenPosition) {
        Node currentNode = head;
        if (!this.isEmpty() && (givenPosition >= 0 && givenPosition < this.size()))  {
            if (givenPosition == 0) { // singleton list
                return head.data; // or return tail.data
            } else {
                for (int i = 0; i < givenPosition; i++){
                    currentNode = currentNode.next;
                }
                return currentNode.data;
            }
        }
        return null;
    }
    
    public void display() {
        Node currentNode = head;
        T[] result = (T[]) new Object[size()];
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
    
    public int contains(T anEntry) {
        
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
    
    public boolean isEmpty() {
        return this.size() == 0;
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

