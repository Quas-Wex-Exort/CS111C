import java.util.Arrays;
import java.util.Objects;

//public class LinkedHeadTailList<T> implements HeadTailListInterface<T> {
public class LinkedHeadTailList<T extends Comparable<? super T>> implements HeadTailListInterface<T>, Comparable<LinkedHeadTailList<T>> {
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
            head = tail = newNode;
        }
    }
	
    public void addBack(T newEntry){
        Node newNode = new Node(newEntry);
		if (!this.isEmpty()) {
            newNode.setNextNode(null);
            tail.setNextNode(newNode);
            tail = newNode;
        } else {
            head = tail = newNode;
        }
    }

    public T removeFront() {
        T result = null;
        if (!this.isEmpty()) {
            if (head != null) {
                result = head.getData(); // get old head's value
                head = head.getNextNode(); // set new head
            }
        }
        return result;
    }

    public T removeBack() {
        T tailRemoved = null;
        if (!this.isEmpty()) {
            if (head == tail) { // singleton chain
                head = tail = null;
            } else {
                Node nodeBeforeTail = head;
                while (nodeBeforeTail.getNextNode() != tail) {
                    nodeBeforeTail = nodeBeforeTail.getNextNode();
                }
                tail = nodeBeforeTail; // set new tail
                tailRemoved = tail.getNextNode().getData(); // get old tail's value
                tail.next = null; // delete original tail
            }
        } else {
            return null;
        }
        return tailRemoved;
    }


    public void clear() {
        head = tail = null;
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
        T[] result = (T[]) new Comparable[size()]; // unchecked casting...
        int index = 0;
        while (currentNode != null && index < this.size()) {
            result[index] = currentNode.data;
            currentNode = currentNode.next;
            index++;
        }

        if (!this.isEmpty()) {
            System.out.println(Arrays.toString(result) + "  head= " + head.getData() + "  tail" +
                    "=" + tail.getData());
        } else {
            System.out.println("[]");
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
        int count = 0;
        Node currentNode = head;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.getNextNode();
        }
        return count;
    }

    public boolean isEmpty() {
        return this.head == null;
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
