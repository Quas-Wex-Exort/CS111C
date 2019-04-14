import java.util.Objects;

public class LinkedHeadTailList<T extends Comparable<? super T>> implements HeadTailListInterface<T>, Comparable<LinkedHeadTailList<T>> {
    private Node head, tail;
    private int size = 0;

    public LinkedHeadTailList() {
        head = null;
        tail = null;
        size = 0;

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
            head = tail = newNode;
        }
        size++;
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
            head = tail = newNode;
        }
        size++;
    }

    public T removeFront() {
        T result = null;
        if (!this.isEmpty()) {
            if (head != null) {
                result = head.getData(); // get old head's value
                head = head.getNextNode(); // set new head
            }
            size--;
        }
        return result;
    }

    public T removeBack() {
        T tailRemoved = null;
        if (!this.isEmpty()) {
            if (head == tail) { // singleton chain
                head = null;
                tail = null;
            } else {
                Node nodeBeforeTail = head;
                while (nodeBeforeTail.getNextNode() != tail) {
                    nodeBeforeTail = nodeBeforeTail.getNextNode();
                }
                tail = nodeBeforeTail; // set new tail
                tailRemoved = tail.getNextNode().getData(); // get old tail's value
                tail.next = null; // delete original tail
            }
            size--;
        } else {
            return null;
        }
        return tailRemoved;
    }


    public void clear() {
        head = tail = null;
        size = 0;
    }

    public T getEntry(int givenPosition) {
        Node currentNode = head;

        if (!this.isEmpty() && (givenPosition >= 0 && givenPosition < this.size())) {
            int index = 0;
            while (currentNode.getNextNode() != null && index < givenPosition) {
                currentNode = currentNode.getNextNode();
                index++;
            }
            return currentNode.getData();
        }
        return null;
    }

    public void display() {
        Node currentNode = head;
        System.out.print("[");
        while (currentNode != null) {
            if (currentNode.next!=null) {
                System.out.print(currentNode.data+", ");
            } else {
                System.out.print(currentNode.data);
            }
            currentNode = currentNode.next;
        }
        System.out.print("]");
        if(!this.isEmpty()) {
            System.out.println("\thead=" + head.getData() + "\ttail=" + tail.getData());
        }
    }

    public int contains(T anEntry){
        Node currentNode = head;
        int position = -1;
        boolean found = false;
        int i = 0;
        while (currentNode != null && !found && i < this.size()) {
            if (anEntry.equals(currentNode.data)) {
                position = i;
                found = true;
            } else {
                currentNode = currentNode.next;
                i++;
            }
        }
        return position;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (this.head == null);
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof LinkedHeadTailList) {
            LinkedHeadTailList list = (LinkedHeadTailList) obj;
            return this.compareTo(list) == 0;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(head, tail);
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
