import java.util.Arrays;

public class HomeworkM5Driver {

	public static void main(String[] args) {
		/*
		System.out.println("******TESTING QUESTION: COUNT DIVISIBLE");
		Node<Integer> firstNode = new Node<Integer>(Integer.valueOf(3),
				new Node<Integer>(Integer.valueOf(8),
						new Node<Integer>(Integer.valueOf(6),
								new Node<Integer>(Integer.valueOf(12)))));
		// sets up the chain 3 -> 8 -> 6 -> 12
		System.out.println("Result is 3: " + countDivisibleBy(firstNode, 3));

		firstNode = new Node<Integer>(Integer.valueOf(2),
				new Node<Integer>(Integer.valueOf(8),
						new Node<Integer>(Integer.valueOf(10),
								new Node<Integer>(Integer.valueOf(4)))));
		// sets up the chain 2 -> 8 -> 10 -> 4
		System.out.println("Result is 0: " + countDivisibleBy(firstNode, 3));
		
		firstNode = null; // represents an empty chain
		System.out.println("Result is 0 (without a crash): " + countDivisibleBy(firstNode, 3));

		firstNode = new Node<Integer>(Integer.valueOf(3)); // singleton chain
		System.out.println("Result is 1: " + countDivisibleBy(firstNode, 3));
		
		System.out.println("\n******TESTING QUESTION: PRINT EVERY OTHER");
		firstNode = new Node<Integer>(Integer.valueOf(3),
				new Node<Integer>(Integer.valueOf(8),
						new Node<Integer>(Integer.valueOf(6),
								new Node<Integer>(Integer.valueOf(12)))));
		// sets up the chain 3 -> 8 -> 6 -> 12
		System.out.println("Should print 3 6");
		printEveryOther(firstNode);
		
		firstNode = new Node<Integer>(Integer.valueOf(3),
				new Node<Integer>(Integer.valueOf(8),
								new Node<Integer>(Integer.valueOf(12))));
		// sets up the chain 3 -> 8 -> 12
		System.out.println("Should print 3 12");
		printEveryOther(firstNode);	
		
		firstNode = null;
		System.out.println("Should print nothing (but not crash)");
		printEveryOther(firstNode);

		firstNode = new Node<Integer>(Integer.valueOf(3));
		System.out.println("Should print 3");
		printEveryOther(firstNode);

		*/

		//System.out.println("\n******TESTING QUESTION: LinkedBag GET MAX");


		LList <Integer> numbersBag = new LList <Integer>();
		numbersBag.add(1);
		numbersBag.add(2);
		numbersBag.add(1);
		numbersBag.add(4);
		numbersBag.add(3);
		numbersBag.insertAfterEvery(4,90);
		System.out.println();
		System.out.println(Arrays.toString(numbersBag.toArray()));

	} // end main

	public static int countMatches(Node<Integer> Node, Integer number) {
		Node<Integer> currentNode = Node;
		int matchCount = 0;

		while (currentNode != null && currentNode.next != null) {
			if (currentNode.data.equals(number)) {
				matchCount++;
			}
			currentNode = currentNode.next; // unchecked assignment....
		}
		return matchCount;

	}
	/*
	public void mystery(Node first) {
		Node current = first; // 17
		while(current.next != null) { // 17-32, 32-14, false
			System.out.print(current.next.data); // 32, 14
			current = current.next; // 32, 14
		}
	} */
	// 32 14

		/*
		System.out.println("The max in the bag is 4: " + numbersBag.getMax());
		numbersBag.add(4);
		System.out.println("The max in the bag is 4: " + numbersBag.getMax());
		numbersBag.add(5);
		System.out.println("The max in the bag is 5: " + numbersBag.getMax());
		numbersBag.clear();
		System.out.println("Should either print null or throw an exception- but NOT a Null " +
				"Pointer Exception");
		System.out.println(numbersBag.getMax());
		numbersBag.add(1);
		numbersBag.add(3);
		numbersBag.add(3);
		numbersBag.add(6);
		System.out.println("The max in the bag is 6: " + numbersBag.getMax());
		System.out.println("The bag still holds 4: " + numbersBag.getCurrentSize());
		*/

		/*


		System.out.println("\n******TESTING QUESTION: LList ADD ALL");
		LList<String> produceList = new LList<String>();
		produceList.addAll(new String[]{"peach"});
		System.out.println("The list contains[peach] \n\t\t " + Arrays.toString(produceList.toArray()));
		String[] stringArray = { "banana", "date", "grape", "eggplant",	"jicama", "grape" };
		produceList.addAll(stringArray);
		System.out.println("The list contains[peach, banana, date, grape, eggplant, jicama, grape] \n\t\t "
						+ Arrays.toString(produceList.toArray()));
		System.out.println("Size is 7: " + produceList.getLength());



		System.out.println("\n******TESTING QUESTION: LList REMOVE ALL");
		LList<Integer> numberList = new LList<Integer>();
		System.out.println("Before removing 1, the list contains " + Arrays.toString(numberList.toArray()));
		numberList.removeAll(1);
		System.out.println("After, the list contains[]  \n\t\t\t" + Arrays.toString(numberList.toArray()) +  "\tSize is 0: " + numberList.getLength());
		numberList.add(1);
		System.out.println("Before removing 1, the list contains " + Arrays.toString(numberList.toArray()) );
		numberList.removeAll(1);
		System.out.println("After, the list contains[]  \n\t\t\t" + Arrays.toString(numberList.toArray()) +  "\tSize is 0: " + numberList.getLength());		
		numberList.add(1);
		numberList.add(1);
		numberList.add(1);
		System.out.println("Before removing 1, the list contains " + Arrays.toString(numberList.toArray()) +  "\tSize is 3: " + numberList.getLength());
		numberList.removeAll(1);
		System.out.println("After, the list contains[]  \n\t\t\t" + Arrays.toString(numberList.toArray()) +  "\tSize is 0: " + numberList.getLength());		
		numberList.add(1);
		numberList.add(1);
		numberList.add(2);
		numberList.add(4);
		numberList.add(1);
		numberList.add(5);
		numberList.add(1);
		System.out.println("Before removing 1, the list contains " + Arrays.toString(numberList.toArray()) );
		numberList.removeAll(1);
		System.out.println("After, the list contains[2, 4, 5] \n\t\t\t" + Arrays.toString(numberList.toArray()) +  "\tSize is 3: " + numberList.getLength());		
		numberList.clear();
		numberList.add(1);
		numberList.add(1);
		numberList.add(3);
		numberList.add(1);
		numberList.add(1);
		numberList.add(4);
		numberList.add(1);
		numberList.add(5);
		numberList.add(1);
		numberList.add(1);
		System.out.println("Before removing 1, the list contains " + Arrays.toString(numberList.toArray()));
		numberList.removeAll(1);
		System.out.println("After, the list contains[3, 4, 5] \n\t\t\t" + Arrays.toString(numberList.toArray()) +  "\tSize is 3: " + numberList.getLength());		
		System.out.println("Before removing 5, the list contains " + Arrays.toString(numberList.toArray()) );
		numberList.removeAll(5);
		System.out.println("After, the list contains[3, 4] \n\t\t\t" + Arrays.toString(numberList.toArray()) +  "\tSize is 2: " + numberList.getLength());	
		numberList.add(2, 4);
		numberList.add(5);
		System.out.println("Before removing 4, the list contains " + Arrays.toString(numberList.toArray()) );
		numberList.removeAll(4);
		System.out.println("After, the list contains[3, 5] \n\t\t\t" + Arrays.toString(numberList.toArray()) +  "\tSize is 2: " + numberList.getLength());	

		System.out.println("\n******TESTING QUESTION EXTRA CREDIT: DOUBLE NODE PALINDROME");
		DoubleNode<Integer> n3 = new DoubleNode<Integer>(4);
		DoubleNode<Integer> n2 = new DoubleNode<Integer>(3);		
		DoubleNode<Integer> n1 = new DoubleNode<Integer>(4);
		n1.next = n2;
		n2.next = n3;
		n2.previous = n1;
		n3.previous = n2;
		// sets up the chain 4->3-> 4
		System.out.println("Should print true: " + isPalindromeDoublyLinkedList(n1, n3));
		
		DoubleNode<Integer> n4 = new DoubleNode<Integer>(4);
		n3 = new DoubleNode<Integer>(3);
		n2 = new DoubleNode<Integer>(3);		
		n1 = new DoubleNode<Integer>(4);
		n1.next = n2;
		n2.next = n3;
		n2.previous = n1;
		n3.next = n4;
		n3.previous = n2;
		n4.previous = n3;
		// sets up the chain 4->3->-3->4
		System.out.println("Should print true: " + isPalindromeDoublyLinkedList(n1, n4));

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
		// sets up the chain 1->2->-3->1
		System.out.println("Should print false: " + isPalindromeDoublyLinkedList(n1, n4));
		
		n4 = new DoubleNode<Integer>(4);
		n3 = new DoubleNode<Integer>(3);
		n2 = new DoubleNode<Integer>(4);		
		n1 = new DoubleNode<Integer>(3);
		n1.next = n2;
		n2.next = n3;
		n2.previous = n1;
		n3.next = n4;
		n3.previous = n2;
		n4.previous = n3;
		// sets up the chain 4->3->-4->3
		System.out.println("Should print false: " + isPalindromeDoublyLinkedList(n1, n4));

		n1 = new DoubleNode<Integer>(3);
		// sets up the chain 3
		System.out.println("Should print true: " + isPalindromeDoublyLinkedList(n1, n1));
		
		n1 = null;
		System.out.println("Should print true and not crash: " + isPalindromeDoublyLinkedList(n1, n1));
	}
	

	public static void printEveryOther(Node firstNode) {
		Node currentNode = firstNode;
		int startPosition = 1;

		while (currentNode != null) {
			if ((startPosition % 2) != 0) {
				int everyOtherData = (int) currentNode.data;
				System.out.print(everyOtherData + " ");
			} //else {
				// What to do with positions that are even?, 2,4,6....
				// Is it necessary to even deal with even-numbered positions?
			//}
			currentNode = currentNode.next;
			startPosition++;
		}
		System.out.println();
	}

	public static int countDivisibleBy(Node<Integer> firstNode, int divisor) {
		// Number is divisible by the divisor if the remainder is 0
		Node <Integer> currentNode = firstNode;
		int count = 0;

		// How is writing a while-loop more efficient than a for-loop???
		while (currentNode != null) {
			Integer currentInteger = currentNode.data; // assign value ".data" of node to Integer
			// object
			if (currentInteger % divisor == 0) {
				count++;
			}
			currentNode = currentNode.next; // move pointer to the next node
			// Error, according to IDE, "unchecked assignment"???
		}
		return count; // will still return 0 if count is 0
		//if(count > 0) {
		// return count;
		// } else {
		// return 0;   }
	}

	public static boolean isPalindromeDoublyLinkedList(DoubleNode<Integer> firstNode,
			DoubleNode<Integer> lastNode)  {
		if (firstNode == null) {
			// according to this driver, it should return true anyway
			return true;
		}

		/*if (!firstNode.data.equals(lastNode.data)) {
			return false;
		}*/
		// the elements traversed by the path of ".previous" must be the same exact elements
		// traversed by the path of ".next"
		// Use '.previous' to traverse backwards.
		/*while (firstNode != lastNode) {
			//if (firstNode.data != lastNode.data) { // number objects are compared using .equals
			//if (firstNode != lastNode) { <--- is always false anyway!
				// return false;
			//}
			if (!firstNode.data.equals(lastNode.data)) {
				return false; // else return true
			}
			firstNode = firstNode.next;
			/*if (firstNode == lastNode) {
			//if (firstNode.data.equals(lastNode.data)) { // if not equal, do nothing???
				break;
				//return false;
			}*/
		//lastNode = lastNode.previous;
		/*}

		return true;
	}
	*/

}
