public class Node_Trace {

    public static void main(String []args) {

        // Node object stores 2 things - the piece of data and the memory location
        /*
        Node<Integer> nodeA = new Node<Integer>(92);
        // data is 92, next is null

        Node<Integer> nodeB = new Node<Integer>(37, nodeA);
        // first param is the value of the data of nodeB, second param is the value for 'next' -
        // the value for 'next is the value of nodeA.next which is equal to null, the tail of the
        // chain
        // the value nodeB.next refers to the same memory address nodeA points to - aliases of
        // each other.
        // nodeA is an aliases of nodeB.next

        Node<Integer> nodeC = new Node<Integer>(16, nodeB);
        // data of nodeC = 16, nodeC.next points to nodeB

        Node<Integer> nodeD = new Node<Integer>(45, nodeC);
        // data of nodeD = 45, nodeD.next points to nodeC -> so nodeD.next and nodeC are aliases
        // that points to the same memory address

        // Chain: 45 -> 16 -> 37 -> 92 - built from back to front!

        Node<Integer> firstNode = nodeD; // evaluates the value of nodeD (on the right side of
        // assignment) then store it into a temporary node called firstNode
        // nodeD and firstNode are now aliases, the first node of the chain, references the same
        // place in memory.

        // equivalent code without named node variables;
        // Node<Integer> firstNode = new Node(45, new Node(16, new Node(37, new Node(92))));

        Node<Integer> current = firstNode; // creating another alias! value of the firstNode gets
        // put into 'current'

        firstNode.data = 88;
        current = current.next; // current.next is  the second node
        // changing what 'current' refers to does not change the chain
        // Are you changing the node, the actual data, or are you making the node point to
        // something else?

        current.data = 40;
        firstNode.next.data = 13;
        firstNode = firstNode.next; // changes the structure of the chain, no more reference to
        // the original first node = 88 -> garbage collected!

        firstNode.next = firstNode.next.next; // .next.next refers to the '92' node
        current = current.next.next; // current.next.next = null (the absence of a value)
        // change what current points to but no change to structure
        System.out.println(current); // can print null
        current = current.next; // throws an exception! current.next is null, hence the
        // nullpointer exception!
        */

        // QUESTION 1: Node Trace A
      /* Node<Integer> n0 = new Node<Integer>(88);
        Node<Integer> n1 = new Node<Integer>(12, n0);
        Node<Integer> n2 = new Node<Integer>(43, n1);
        Node<Integer> n3 = new Node<Integer>(67, n2);
        Node<Integer> n4 = new Node<Integer>(95, n3);

        Node<Integer> firstNode = n4; // line 1
        System.out.println("\nLINE 1");
        printRoster(firstNode);
       // System.out.println("LINE 5 current.data " + current.data);

        Node<Integer> current = firstNode; // line 2
        System.out.println("\nLINE 2");
        printRoster(firstNode);
        System.out.println("LINE 2 current.data " + current.data);

        current = current.next; // line 3
        System.out.println("\nLINE 3");
        printRoster(firstNode);
        System.out.println("LINE 3 current.data = " + current.data);

        System.out.println("\nLINE 4");
        firstNode = firstNode.next; // line 4
        printRoster(firstNode);
        System.out.println("LINE 4 current.data = " + current.data);

        current.next.data = 36; // line 5
        System.out.println("\nLINE 5");
        printRoster(firstNode);
        System.out.println("LINE 5 current.data " + current.data);

        current.next = current.next.next.next; // line 6
        System.out.println("\nLINE 6");
        printRoster(firstNode);
        System.out.println("LINE 6 current.data " + current.data);


        firstNode.data = 17; // line 7
        System.out.println("\nLINE 7");
        printRoster(firstNode);
        System.out.println("LINE 7 current.data " + current.data);

        current = current.next; // line 8
        System.out.println("\nLINE 8");
        printRoster(firstNode);
        System.out.println("LINE 8 current.data " + current.data);

        firstNode.next = current.next; // line 9
        System.out.println("\nLINE 9");
        printRoster(firstNode);
        System.out.println("LINE 9 current.data " + current.data);
        */
        Node a = new Node(5);
        Node b = new Node(3, a);
        Node c = new Node(7, b);
        Node d = new Node(2, c);
        Node firstNode = d;
        Node currentNode = firstNode;
        firstNode = firstNode.next;
        printRoster(firstNode);
        //Node currentNode = firstNode;
        /*while(currentNode.next != null) {
            System.out.print(currentNode.data);
            currentNode = currentNode.next;
        } */


    }
    public static void printRoster(Node<Integer> head) {
        Node<Integer> current = head;

        while (current != null) {
            Integer currentStudent = current.data;
            System.out.println(currentStudent);
            current = current.next;
        }
    } // end printRoster
    /*public static void method(Node firstNode) {
        Node secondNode = firstNode.next;
        Node currentNode = secondNode;

        while(currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    } */

    public static void method(Node firstNode) {
        while(firstNode != null) {
            System.out.println(firstNode.data);
            firstNode = firstNode.next;
        }
    }


} // end class
