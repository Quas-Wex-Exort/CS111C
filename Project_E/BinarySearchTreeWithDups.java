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

	// YOUR CODE HERE! THIS METHOD CANNOT BE RECURSIVE
	private void addEntryHelperNonRecursive(T newEntry) {
		BinaryNode<T> currentNode = getRootNode();
		BinaryNode<T> newNode = new BinaryNode<T>(newEntry);
		boolean found = false;
		while(currentNode != null &&!found) {
			int compareVal = currentNode.getData().compareTo(newEntry);
			if (compareVal < 0) {
				BinaryNode <T> rightChild = currentNode.getRightChild();
				if (rightChild == null) {
					currentNode.setRightChild(newNode);
					found = true;
				} else {
					currentNode = rightChild; // or currentNode = leftChild;
				}
			} else {
				BinaryNode<T> leftChild = currentNode.getLeftChild();
				if (leftChild == null) {
					currentNode.setLeftChild(newNode);
					found = true;
				} else {
					currentNode = leftChild;
				}
			}
		}
	}

	/*private void addEntryHelperNonRecursive(T newEntry) {
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
	*/

	// YOUR CODE HERE! THIS METHOD CANNOT BE RECURSIVE.
	// MAKE SURE TO TAKE ADVANTAGE OF THE SORTED NATURE OF THE BST!
    public int countEntriesNonRecursive(T target) {
        int count = 0;
        BinaryNode <T> currentNode = getRootNode();

        while (currentNode != null) {
            int compareVal = currentNode.getData().compareTo(target);
            if (compareVal == 0) {
                count++;
                currentNode = currentNode.getLeftChild();
            } else if (compareVal < 0) {
                currentNode = currentNode.getLeftChild();
            } else {
                currentNode = currentNode.getRightChild();
            }
        }
        return count;
    }

	// YOUR CODE HERE! MUST BE RECURSIVE! YOU ARE ALLOWED TO CREATE A PRIVATE HELPER.
	// MAKE SURE TO TAKE ADVANTAGE OF THE SORTED NATURE OF THE BST!
	public int countGreaterRecursive(T target) {
		return countGreaterRecursiveHelper(getRootNode(), target);
	}

	private int countGreaterRecursiveHelper(BinaryNode<T> node, T target) {
	    if (node != null) {
            T data = node.getData();
            int comparison = data.compareTo(target);
            BinaryNode<T> leftChild = node.getRightChild();
            if (comparison > 0) {
                BinaryNode<T> rightChild = node.getLeftChild();
                return 1 + countGreaterRecursiveHelper(rightChild, target) + countGreaterRecursiveHelper(leftChild, target);
            } else {
                return countGreaterRecursiveHelper(leftChild, target);
            }
	    } else {
	        return 0;
        }
	}

	/*
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
    */

	// The method counts the number of elements in the tree greater than the parameter.
	// YOUR CODE HERE! MUST USE A STACK!! MUST NOT BE RECURSIVE!
	// MAKE SURE TO TAKE ADVANTAGE OF THE SORTED NATURE OF THE BST!
	public int countGreaterWithStack(T target) {
		int count = 0;
		Stack <BinaryNode<T>> nodeStack = new Stack <>();
		nodeStack.push(getRootNode());

		while (!nodeStack.isEmpty()) {
			BinaryNode <T> topNodeFromStack = nodeStack.pop();
			if (topNodeFromStack != null) {
				int compareVal = topNodeFromStack.getData().compareTo(target);
				if (compareVal > 0) {
					count++;
					nodeStack.push(topNodeFromStack.getLeftChild());
					nodeStack.push(topNodeFromStack.getRightChild());
				} else {
					nodeStack.push(topNodeFromStack.getRightChild());
				}
			}
		}
		return count;
	}

	/*
	public int countGreaterWithStack(T target) {
		int count = 0;
		BinaryNode <T> rootNode = getRootNode();
		Stack <BinaryNode <T>> nodeStack = new Stack <>();
		nodeStack.push(rootNode);
		int compareVal = target.compareTo(topStack.getData());
		while (!nodeStack.isEmpty() && rootNode != null) {
			BinaryNode <T> topStack = nodeStack.pop();
			if (topStack.hasLeftChild()) {
				nodeStack.push(topStack.getLeftChild());
			}
			if (topStack.hasRightChild()) {
				nodeStack.push(topStack.getRightChild());
			}
			if (compareVal < 0) {
				count++;
			}
		}
		return count;
	}
	 */


	// YOUR EXTRA CREDIT CODE HERE! THIS METHOD MUST BE O(n).
	// YOU ARE ALLOWED TO USE A HELPER METHOD. THE METHOD CAN BE ITERATIVE OR RECURSIVE.
	public int countUniqueValues() {
		//TreeSet<T> someTree = new TreeSet <>();
		Set<T> set = new HashSet<T>();
		return countUniqueValuesHelper(getRootNode(), set);
	}

	private int countUniqueValuesHelper(BinaryNode<T> root, Set<T> set) {
		if (root != null){
			set.add(root.getData());
			countUniqueValuesHelper(root.getLeftChild(),set);
			countUniqueValuesHelper(root.getRightChild(),set);
		}
		return set.size();
	}

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

