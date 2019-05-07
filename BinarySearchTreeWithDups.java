import java.util.*;

public class BinarySearchTreeWithDups<T extends Comparable<? super T>> extends BinarySearchTree<T>
		implements SearchTreeInterface<T>, java.io.Serializable {

	public BinarySearchTreeWithDups() {
		super();
	}

	public BinarySearchTreeWithDups(T rootEntry) {
		super(rootEntry);
		setRootNode(new BinaryNode <T>(rootEntry));
	}

	@Override
	public T add(T newEntry) {
		T result = newEntry;
		if (isEmpty()) {
			setRootNode(new BinaryNode <T>(newEntry));
		} else {
			addEntryHelperNonRecursive(newEntry);
		}
		return result;
	}

	// YOUR CODE HERE! THIS METHOD CANNOT BE RECURSIVE.
	private void addEntryHelperNonRecursive(T newEntry) {
		BinaryNode <T> currentNode = getRootNode();
		boolean found = false;
		// int comparison = newEntry.compareTo(currentNode.getData()); // getRootData()

		while (!found) {
			//int comparison = newEntry.compareTo(currentNode.getData()); // getRootData()
			if (newEntry.compareTo(currentNode.getData()) == 0) { // newEntry == rootData
				if (currentNode.hasLeftChild()) {
					currentNode = currentNode.getLeftChild();
				} else {
					currentNode.setLeftChild(new BinaryNode <>(newEntry));
					found = true;
				}
			} else if (newEntry.compareTo(currentNode.getData()) < 0) {
				if (currentNode.hasLeftChild()) {
					currentNode = currentNode.getLeftChild();
				} else {
					currentNode.setLeftChild(new BinaryNode <>(newEntry));
					found = true;
				}

			} else { // if comparison > 0
				if (currentNode.hasRightChild()) {
					currentNode = currentNode.getRightChild();
				} else {
					currentNode.setRightChild(new BinaryNode <>(newEntry));
					found = true;
				}
			} // end last else
		} // end while()
	} // end addEntryHelperNonRecursive()


	// YOUR CODE HERE! THIS METHOD CANNOT BE RECURSIVE.
	// MAKE SURE TO TAKE ADVANTAGE OF THE SORTED NATURE OF THE BST!
	public int countEntriesNonRecursive(T target) {
		int count = 0;
		BinaryNode <T> currentNode = getRootNode();

		while (currentNode != null) { //&& !currentNode.isLeaf()) {
			if (target.compareTo(currentNode.getData()) > 0) { // target > currentNode, traverse
				// right subtree
				currentNode = currentNode.getRightChild();
			} else if (target.compareTo(currentNode.getData()) < 0) { //target < currentNode,
				// traverse
				// left subtree
				currentNode = currentNode.getLeftChild();
			} else { // target == currentNode
				count++;
				currentNode = currentNode.getLeftChild();
			}
		}
		return count;
	}

	// YOUR CODE HERE! MUST BE RECURSIVE! YOU ARE ALLOWED TO CREATE A PRIVATE HELPER.
	// MAKE SURE TO TAKE ADVANTAGE OF THE SORTED NATURE OF THE BST!
	public int countGreaterRecursive(T target) {
		return countGreaterRecursiveHelper(getRootNode(), target);
	}

	private int countGreaterRecursiveHelper(BinaryNode <T> node, T target) {
		int count = 0;
		if (node != null) {
			if (target.compareTo(node.getData()) < 0) { // target < nodeData
				count++;
			}
			if (node.hasRightChild()) {
				count = count + countGreaterRecursiveHelper(node.getRightChild(), target);
			}
			if (node.hasLeftChild()) {
				count = count + countGreaterRecursiveHelper(node.getLeftChild(), target);
			}
		} else {
			return 0;
		}

		return count;
	}

	// YOUR CODE HERE! MUST USE A STACK!! MUST NOT BE RECURSIVE!
	// MAKE SURE TO TAKE ADVANTAGE OF THE SORTED NATURE OF THE BST!
	public int countGreaterWithStack(T target) {
		int count = 0;
		BinaryNode <T> rootNode = getRootNode();
		Stack <BinaryNode <T>> nodeStack = new Stack <>();
		//Stack <BinaryNode <T>> nodeStack2 = new Stack <>();
		nodeStack.push(rootNode);

		while (!nodeStack.isEmpty() && rootNode != null) {
			BinaryNode <T> topStack = nodeStack.pop();
			if (topStack.hasLeftChild()) {
				nodeStack.push(topStack.getLeftChild());
				//nodeStack2.push(topStack.getLeftChild());
			}
			if (topStack.hasRightChild()) {
				nodeStack.push(topStack.getRightChild());
				//nodeStack2.push(topStack.getRightChild());
			}
			if (target.compareTo(topStack.getData()) < 0) {
				count++;
			}
		}
		return count;
	}


	// YOUR EXTRA CREDIT CODE HERE! THIS METHOD MUST BE O(n).
	// YOU ARE ALLOWED TO USE A HELPER METHOD. THE METHOD CAN BE ITERATIVE OR RECURSIVE.

	public int countUniqueValues() {
		return countUniqueValuesHelper(getRootNode());
	}
	// Either use stacks or a simple search algorithm
	private int countUniqueValuesHelper(BinaryNode<T> root) {
		BinaryNode<T> currentNode = root;
		BinaryNode<T> parentNode = null;
		int count = 0;
		if(currentNode != null) {

			if (currentNode.getData().compareTo(currentNode.getLeftChild().getData()) == 0) {
				parentNode = currentNode;
				currentNode = currentNode.getLeftChild();
			} else {
				parentNode = currentNode;
				count = count + countUniqueValuesHelper(parentNode);
			}
			if (currentNode.getData().compareTo(currentNode.getRightChild().getData()) == 0) {
				parentNode = currentNode;
				currentNode = currentNode.getRightChild();
			} else {
				parentNode = currentNode;
				count = count + countUniqueValuesHelper(parentNode);
			}

		}
		return count;
	}

	/*
	public int countUniqueValues() {
		//TreeSet<T> someTree = new TreeSet <>();
		LinkedHashSet<T> hashTable = new LinkedHashSet<T>();
		return countUniqueValuesHelper(getRootNode(), hashTable);
	}

	private int countUniqueValuesHelper(BinaryNode<T> root, LinkedHashSet<T> hashTable){

		if (root!=null){
			hashTable.add(root.getData());
			countUniqueValuesHelper(root.getLeftChild(),hashTable);
			countUniqueValuesHelper(root.getRightChild(),hashTable);
		}
		return hashTable.size();
	}*/

	public int getLeftHeight() {
		BinaryNode<T> rootNode = getRootNode();
		if(rootNode==null) {
			return 0;
		} else if(!rootNode.hasLeftChild()) {
			return 0;
		} else {
			return rootNode.getLeftChild().getHeight();
		}
	}

	public int getRightHeight() {
		BinaryNode<T> rootNode = getRootNode();
		if(rootNode==null) {
			return 0;
		} else if(!rootNode.hasRightChild()) {
			return 0;
		} else {
			return rootNode.getRightChild().getHeight();
		}
	}
	


}