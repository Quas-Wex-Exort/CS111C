import java.util.Objects;

public class VoterHashTableSeparateChaining {

	private Node<Voter>[] hashTable;
	private int tableSize;


	public VoterHashTableSeparateChaining(int size) {
		hashTable = (Node<Voter>[]) new Node[size];
		tableSize = size;

	}
	
	public int getHashLocation(int voterID) {
		return (voterID % tableSize) + 1;
	}


	public boolean addVoter(Voter voterToAdd) {
		int hashLocation = getHashLocation(voterToAdd.getId());
		if (hashTable[hashLocation] == null) {
			hashTable[hashLocation] = new Node <Voter>(voterToAdd);
		} else {
			Node <Voter> currentNode = hashTable[hashLocation];
			while (!hashTable[hashLocation].getData().equals(voterToAdd)) {
				if (currentNode.getNextNode() == null) {
					currentNode.setNextNode(new Node <Voter>(voterToAdd));
					return true;
				} else {
					currentNode = currentNode.getNextNode();
				}
			} // end while
			currentNode.setNextNode(new Node <Voter>(voterToAdd));
		} // end outer else
		return false;
	}

	public Voter getVoter(int voterID) {
		int hashLocation = getHashLocation(voterID);
		Node <Voter> voterToFind = hashTable[hashLocation];

		if (hashTable[hashLocation].getData().equals(voterToFind.getData())) {
			return hashTable[hashLocation].getData();
		} else {
			Node <Voter> currentNode = hashTable[hashLocation];

			while (currentNode != null) {
				if (voterToFind.getData().equals(currentNode.getData())) {
					return currentNode.getData();
				} else {
					currentNode = currentNode.next;
				}
			}
		}
		return null;
	}

	public void printTable() {
		for (int i = 0; i < tableSize; i++) {
			if (hashTable[i] != null) {
				System.out.print(i + ": ");
				Node<Voter> current = hashTable[i];
				while (current != null && current.next != null) {
					System.out.print(current.data.getName() + " -> ");
					current = current.next;
				}
				System.out.println(current.data.getName());
			}
		}
	}

}
