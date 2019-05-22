public class StudentNode_Tester {

    public static void main(String[] args) {

        Student s1 = new Student("Allison", "A123");
        Student s2 = new Student("Barb", "B691");
        Student s3 = new Student("Carl", "C208");
        Student s4 = new Student("Dannie", "D810");
        Student s5 = new Student("Earl", "E890");

        // Typically, there are no named references and named objects for Node.
        // This tester is for education purposes only.

        // Creates the chain s4 -> s3 -> s2 -> s1
        // s4 is the head/firstNode, s1 is the tail.lastNode
        Node <Student> node1 = new Node <>(s1, null); // This is the
        // tail of the node chain, hence the "null" on the "next" field,
        // meaning it signifies the end of the chain
        Node <Student> node2 = new Node <>(s2, node1); // holds Student2
        Node <Student> node3 = new Node <>(s3, node2); // holds Student 3
        Node <Student> node4 = new Node <>(s4, node3); // holds Student 4

        System.out.println("\nHead of the chain: " + node1);
        System.out.println("\nHead of the chain: " + node1.getData()); // Nodes
        // are
        // objects, what is stored is the memory address of node1
        System.out.println("Head of the chain: " + node4.data); // node1
        // .getData();

        System.out.println("Second of the chain: " + node3.data); // cannot
        // do this since we do not have access to elements in between the
        // tail and head of the chain.

        // Creates the same chain, without the named references
        Node <Student> firstNode = new Node <>(s4,
                new Node <>(s3,
                        new Node <>(s2,
                                new Node <>(s1, null))));

        System.out.println("\nHead of the chain: " + firstNode.data);
        System.out.println("Second in the chain: " + firstNode.next.data);
        System.out.println("Third in the chain: " + firstNode.next.next.data);
        System.out.println("Fourth in the chain: " + firstNode.next.next.next.data);

        // throws nullpointer exception
        //System.out.println("Fifth in the chain: " + firstNode.next.next
        // .next.next.getData());
        // Prints null, since there's no fifth node

        // We're allowed to print null and test null on equality operator,
        // not allowed to invoke on null, will result in NullPointer Exception
        System.out.println("Fifth in the chain: " + firstNode.next.next.next.next);

        // Use boolean to print message
        if (firstNode.next.next.next.next == null) {
            System.out.println("There's no fifth node.");
        }

        // What if we want to change the data of one of our nodes?
        // What if we want to swap some Student? Let's point the second node
        // to Earl instead.
        // Swap Carl with Earl

        // firstNode.next.data = points to the second node, Carl
        firstNode.next.data = s5; // make second node point to s5, Earl
        System.out.println("Second in the chain: " + firstNode.next.getData());

        System.out.println();
        // Testing printRoster() method
        System.out.println("New list after swapping Carl with Earl");
        printRoster(firstNode);

        System.out.println();
        printStudentsWithA(firstNode);

        System.out.println();
        printRoster(null); // if the first element is null... no crashing
        printRoster(new Node<Student>(s3)); // if we have a singleton list.. no crashing

        // The list is now s5 -> s3 -> s2 -> s1
        System.out.println();
        // Inserting at the second position.
        Node<Student> head = new Node<Student>(s1);
        Node<Student> newNode = new Node<Student>(s2);
        // adds a new node to the end of a 1-element list
        head.next = newNode;

        // adds a new node to the end of a >1-element list
        newNode = new Node<Student>(s3);
        // Let's traverse to the end by creating a temporary pointer
        Node<Student> lastNode = head;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;

        printRoster(head);
        // This code does not check for special cases!
        // Insert a new node in between Barb and Carl, so find position 2!
        // Current list: Allison, Barb, Carl -> 1,2,3
        newNode = new Node<Student>(s4); // Dannie is s4
        int positionToInsert = 3;
        int nodeBeforePosition = 2;
        Node<Student> nodeBefore = head;
        for (int i = 0; i < nodeBeforePosition-1; i++) {
            nodeBefore = nodeBefore.next;
        }
        newNode.next = nodeBefore.next; // Dannie.next refers to Barb's next, which is Carl
        nodeBefore.next = newNode; // Barb's.next refers to Dannie
        System.out.println();
        printRoster(head);

        // REMOVE, no error checking for empty and singleton

        // Removing from the beginning
        head = head.next; // print BDC
        System.out.println();
        printRoster(head);

        System.out.println();
        // removing from the middle - Dannie
        int nodeToRemovePosition = 2; // Barb 1, Dannie 2
        nodeBeforePosition = 1;
        for(int i = 0; i < nodeBeforePosition-1; i++) {
            nodeBefore = nodeBefore.next;
        }

        nodeBefore.next = nodeBefore.next.next;
        printRoster(head); // prints Barb and Carl after removing Dannie

        System.out.println();
        // removing from the end - Carl
        nodeToRemovePosition = 2; // Barb 1, Dannie 2
        nodeBeforePosition = 1;
        for(int i = 0; i < nodeBeforePosition-1; i++) {
            nodeBefore = nodeBefore.next;
        }

        nodeBefore.next = nodeBefore.next.next;
        printRoster(head); // prints Barb after removing Carl
        // Remove from the end
    } // end main()

    public static void printRoster(Node<Student> head) {
        Node<Student> current = head;

        while (current != null) {
            Student currentStudent = current.data;
            System.out.println(currentStudent);
            current = current.next;
        }
    } // end printRoster

    public static void printStudentsWithA(Node<Student> head) {
        Node <Student> current = head;

        while (current != null) {
            Student currentStudent = current.data;
            if (currentStudent.getStudentID().startsWith("A")) {
                // conditional to only process some elements but still prints the roster that
                // satisfies the conditional
                System.out.println(currentStudent);
            }
            current = current.next;
        }
    } // end printStudentsWithA()


    // Empty list/chain or 1-element (singleton),
    // Empty list: firstNode == null
    // Singleton list: firstNode.next == null
    // Avoid NullPointerExceptions. You always need to check for these cases to make sure your
    // code, won't crash in these situations!

    /* ITERATING THE CHAIN */
    // always advance the temporary node to go through the whole chain!
    // When we have a chain of nodes, we usually refer to the chain (or
    // list) by just one node: the head of the chain.
    // Then within each chain, each node points to a single piece of data and the next node in
    // the chain.
    // However, we will frequently want to access all the objects in our chain.
    // To do this, we use a temporary node to iterate the chain.

    // The temporary node initially points to the first node in the chain.
    // Then we repeatedly point the temporary node to the next node and
    // access the data until we reach the end of the list.
    // When we are done with this process, we throw away the temporary
    // node since we do not need it anymore.

    // Node currentNode = firstNode -> currentNode is the temporary Node
    // This creates an alias -> the value on the right side ( a memory
    // address) is placed into the variable on the left side, currentNode
    // and firstNode now point to the same Node object.

    // The code below iterates through the whole chain while using while
    // loop and the temporary node, currentNode.
    /* Node currentNode = firstNode;
    while(currentNode != null) {
        Student currentStudent = currentNode.data;
        // process the Student
        currentNode = currentNode.next;
    } THIS CODE SHALL CRASH IF currentNode is actually null!
    */
        // Once currentNode reaches null, loop shall stop!
    // Remember, it's okay to compare null using  == or !=, it will not crash the program.

    /* Common Errors */
    // Do not iterate using firstNode - this will modify the value of firstNode!
    // Use a temporary node! Update the temporary node, usually called the currentNode!
    // Do not iterate until 'current.next == null' -> this will miss the last element of the
    // chain! It will miss processing the last element!


    /* INSERTING AN ELEMENT */
    // Insert at the beginning, middle, or end of the chain
    // We have to make sure that our approaches work for both empty and singleton lists!

    /* INSERTING AT THE END */
    // Approach:
    // Find the last element in the chain, and insert the new node as that element's next!
    /*
    Node lastNode = firstNode;
    while(lastnode != null) {
        lastNode = lastNode.next;
    }
    lastNode.next = newNode;
    */

    // Check for special cases for crashing: empty bag and singleton bag
    // Empty bag: firstNode is always null, but then so is the lastNode, thus the code will crash!
    /*
    if(firstNode == null) { // empty list
        firstNode = newNode; // will point to the newNode, list will have 1 element after
    } else { // if list is not empty!
        Node lastNode = firstNode;
        while(lastnode.next != null) {
        lastNode = lastNode.next;
        }
        lastNode.next = lastNode.next;
    }
     */

    /* INSERTING AT THE BEGINNING */
    // Approach:
    // Make the new node point to the firstNode as next
    // Make firstNode refer to the new node

    // newNode.next = firstNode;
    // firstNode = newNode;

    // Check for special cases
    // Won't crash on an empty bag since empty bag/singleton bag has null as first!

    // No need for shifting the remaining elements when inserting at the beginning.
    /* ERRORS */
    // Do not flip the order

    /* INSERTING IN THE MIDDLE */
    // Approach: Set the previous node's next to the new node/
    // Set the new node's next to the previous node's old next.

    // newNode.next = nodeBefore.next;
    // nodeBefore.next = newNode;

    // This requires us to find nodeBefore!
    // We can traverse to the insertPosition -1 to get to this node.

    // Check for special cases - empty bag/list and singleton bag/list.


    /* REMOVING FROM THE BEGINNING */
    // Approach: Make firstNode point to firstNode.next
    // firstNode = firstNode.next; <- this will crash on an empty bag! SO, implement a conditional!
    // On a singleton list, since firstNode is null, it's okay!

    /* REMOVING FROM THE MIDDLE */
    // Approach: Set previous node's NEXT to the to-be-removed node's NEXT
    // nodeBefore.next = nodeToRemove.next; OR -> will crash on an empty list
    // nodeBefore.next = nodeBefore.next.next;
    // This requires us to find the nodeBefore! We can traverse to the removePosition -1 to get
    // this node.
    // Check for special cases for crashing: empty list, singleton list

    /* REMOVE FROM THE END */
    // Same process as the removing from the middle.

    /* NODE REFERENCES AND ASSIGNMENT */
    // When traversing a chain of linked nodes, you will use a temporary node reference to point
    // each node in the chain.
    // Node currentNode = firstNode;
    // This line of code creates an alias between currentNode and firstNode.
    // It's critical to understand the difference between reassigning currentNode to a new
    // reference and making changes to the contents of currentNode.

    // Reassigning currentNode
    // If you reassign currentNode to point to a different node like this:
    // currentNode - someOtherNode
    // This breaks the alias link between currentNode and firstNode. They are no longer aliases.
    // firstNode should not be changed! you advance the current reference through the chain, just
    // reassigning currentNode does not change the chain!
    // currentNode now points to a new place in memory.
    // currentNode must always be written on the left side of the assignment!
    // currentNode = someNode;
    // currentNode - currentNode.next;

    // You can also use currentNode to change the value of firstNode!
    // If you change the actual value of currentNode, the change will also happen to firstNode -
    // because currentNode and firstNode are aliases of each other!
    // They refer to the same place in memory.
    // You do this by putting currentNode.data on the left side of an assignment.
    // currentNode.data = newData;
    // currentNode.data.setNewData(..);

    // Changing the chain through currentNode
    // This is how you can change the structure of the chain using a temporary node!
    // You advance the current reference through the chain, and then make a change to the next
    // node through currentNode.
    // You do this by putting currentNode.next on the left side of an assignment:
    // currentNode.next = newNode;

    // currentNode = .. some new node
    // -> changes what currentNode refers to, does not change the chain

    // currentNode.data = some other data
    // -> changes the DATA contained in the actual chain

    // currentNode.next = .. some other node
    // -> changes the STRUCTURE of the actual chain

    /*******************************************************************/
    // NODE REFERENCES AND ASSIGNMENT: .data on the left of =
    // Examples:
    // currentNode.data = someData;
    // currentNode.data.changeData();
    // firstNode.data = someData;
    // firstNode.data.changeData();
    // --> changes the data contained in the chain
    // --> DOES NOT CHANGE the structure of the chain
    // --> DOES NOT CHANGE what firstNode or currentNode points to

    // NODE REFERENCES AND ASSIGNMENT: node on the left of =
    // Examples:
    // currentNode = someNode;
    // currentNode - someNode.next;
    // --> CHANGES what currentNode points to
    // --> DOES NOT CHANGE the structure of the chain, current is just temporary!

    // firstNode = someNode;, firstNode = someNode.next;
    // CHANGES what firstNode points to
    // CHANGES structure of the chain, changes the beginning of the chain

    // NODE REFERENCES AND ASSIGNMENT: node.next on the left of =
    // Examples:
    // currentNode.next = someNode;
    // currentNode.next = someNode.next;
    // firstNode.next = someNode;
    // firstNode.next = someNode.next;
    // --> DOES NOT CHANGE what currentNode or firstNode points to
    // --> CHANGES the structure of the actual chain by changing which nodes are linked together






} // end class
