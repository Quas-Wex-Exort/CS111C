
public class NodeTrace {

	public static void main(String[] args) {
		Node<Integer> nodeA = new Node<Integer>(92);
		Node<Integer> nodeB = new Node<Integer>(37, nodeA);
		Node<Integer> nodeC = new Node<Integer>(16, nodeB);
		Node<Integer> nodeD = new Node<Integer>(45, nodeC);
		
		Node<Integer> firstNode = nodeD;
		// equivalent code without named node variables:
		//Node<Integer> firstNode = new Node(45, new Node(16, new Node(37, new Node(92))));
		
		Node<Integer> current = firstNode;
		//System.out.println(firstNode.next.data);
		firstNode.data = 88;
		current = current.next;
		current.data = 40;
		firstNode.next.data = 13;
		firstNode = firstNode.next;
		firstNode.next = firstNode.next.next;
		/*current = current.next.next;
		System.out.println(current);
		current = current.next;*/

		DoubleNode<Integer> n3 = new DoubleNode<Integer>(4);
		DoubleNode<Integer> n2 = new DoubleNode<Integer>(3);
		DoubleNode<Integer> n1 = new DoubleNode<Integer>(4);
		DoubleNode<Integer> n4 = new DoubleNode<Integer>(4);
		n4 = new DoubleNode<Integer>(1);
		n3 = new DoubleNode<Integer>(2);
		n2 = new DoubleNode<Integer>(3);
		n1 = new DoubleNode<Integer>(1);
		n1.next = n2;
		n2.next = n3;
		n2.previous = n1;
		n3.next = n4;
		n3.previous = n2;
		n4.previous = n3;
		System.out.println(n1.data);
		System.out.println(n2.data);
		System.out.println(n3.data);
		System.out.println(n4.data);

		System.out.println();
		// sets up the chain 1->2->-3->1
		//System.out.println("Should print false: " + isPalindromeDoublyLinkedList(n1, n4));
	}
}
