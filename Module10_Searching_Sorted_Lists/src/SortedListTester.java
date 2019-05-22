
public class SortedListTester {

	public static void main(String[] args) {
		SortedListInterface<String> wordList = new SortedArrayList<>(); // or SortedLinkedList
		wordList.add("delta");
		wordList.display();
		wordList.add("beta");
		wordList.display();
		wordList.add("alpha");
		wordList.display();
		wordList.add("gamma");
		wordList.display();            
		wordList.add("beta");
		wordList.display();     
	
		System.out.println("Removing position 4: " + wordList.remove(4));
		wordList.display();
		System.out.println("Remove of BETA successful?: " + wordList.remove("BETA"));		
		wordList.display();
		System.out.println("Remove of beta successful?: " + wordList.remove("beta"));		
		wordList.display();
		wordList.add("delta");
		wordList.display();
		int position = wordList.getPosition("delta");  
		System.out.println("delta is in position " + position);
		position = wordList.getPosition("epsilon"); 	 
		System.out.println("epsilon is in position " + position);


	}

}
