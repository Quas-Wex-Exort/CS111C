import java.util.*;

public class HomeworkM3Driver {

	public static void main(String[] args) {
		
		System.out.println("******TESTING QUESTION 39: TESTING IF BAG IS A SET");
		BagInterface<String> wordBag = new ArrayBag<>();
		System.out.println("Bag is set? true: " + isSet(wordBag));
		System.out.println("The contents of the bag should be (in ANY order- the order might not match): \n[]");
		System.out.println(Arrays.toString(wordBag.toArray()));
		wordBag.add("hi");
		System.out.println("Bag is set? true: " + isSet(wordBag));
		System.out.println("The contents of the bag should be (in ANY order- the order might not match): \n[hi]");
		System.out.println(Arrays.toString(wordBag.toArray()));
		wordBag.add("HI");
		wordBag.add("hello");
		System.out.println("Bag is set? true: " + isSet(wordBag));
		System.out.println("The contents of the bag should be (in ANY order- the order might not match): \n[hi, HI, hello]");
		System.out.println(Arrays.toString(wordBag.toArray()));
		wordBag.add("hi");
		System.out.println("Bag is set? false: " + isSet(wordBag));
		System.out.println("The contents of the bag should be (in ANY order- the order might not match): \n[hi, HI, hello, hi]");
		System.out.println(Arrays.toString(wordBag.toArray()));
		BagInterface<Integer> aBag = new ArrayBag<>();

		aBag.add(17);
		aBag.add(31);
		aBag.add(29);
		aBag.add(42);
		aBag.add(16);
		aBag.remove(31);
		System.out.println(Arrays.toString(aBag.toArray()));



		System.out.println("\n******TESTING QUESTION 41: CREATING SHORT STRING LIST");
		ListInterface<String> wordList = new AList<>();
		wordList.add("ape");
		wordList.add("dog");
		wordList.add("cockroach"); 
		wordList.add("baboon");
		wordList.add("frog");
		wordList.add("spider");
		wordList.add("cat");

		ListInterface<String> shortWordList = createShortWordList(wordList,4);
		System.out.println("The contents of the list should be (in THIS ORDER): \n[ape, dog, cat]");
		System.out.println(Arrays.toString(shortWordList.toArray()));

		System.out.println("\n******TESTING QUESTION 42: FINDING LAST POSITION");
		List<String> itemList = new ArrayList<>();
		itemList.add("adam");
		itemList.add("frank");
		itemList.add("betty");
		itemList.add("sue");
		itemList.add("sam");
		itemList.add("frank");
		itemList.add("sue");
		itemList.add("terry");
		itemList.add("adam");
		itemList.add("frank");
		System.out.println("The index should be: \n9\n" + lastPosition(itemList, "frank"));

		ListInterface<Integer> aList = new AList<>();
		aList.add(8);
		aList.add(9);
		aList.add(6);
		aList.add(3);
		aList.add(8);
		aList.add(6);
		aList.add(1);
		System.out.println(Arrays.toString(aList.toArray()));
		System.out.println(recursiveCountMultiples(aList, 3));


		System.out.println("\n******TESTING QUESTION 43: LIST COMPARISON");
		List<Integer> numList1 = new ArrayList<Integer>();
		numList1.add(1);
		numList1.add(3);
		numList1.add(1);
		numList1.add(5);
		numList1.add(7);
		ListInterface<Integer> numList2 = new AList<Integer>();
		System.out.println("Equivalent should be: \nfalse\n" + equivalentLists(numList1, numList2));		
		numList2.add(1);
		System.out.println("Equivalent should be: \nfalse\n" + equivalentLists(numList1, numList2));	
		numList2.add(3);
		numList2.add(1);
		numList2.add(5);
		System.out.println("Equivalent should be: \nfalse\n" + equivalentLists(numList1, numList2));
		numList2.add(7);
		System.out.println("Equivalent should be: \ntrue\n" + equivalentLists(numList1, numList2));
		numList2.add(8);
		System.out.println("Equivalent should be: \nfalse\n" + equivalentLists(numList1, numList2));
		numList1.add(8);
		numList1.add(10);
		System.out.println("Equivalent should be: \nfalse\n" + equivalentLists(numList1, numList2));

		
		System.out.println("\n******TESTING EXTRA CREDIT QUESTION 44: MOVE THE MINIMUM TO THE FRONT");
		List<Integer> numberList = new ArrayList<Integer>();
		prioritizeMinimumValue(numberList);
		System.out.println("The list should contain: \n[]\n" + numberList);
		numberList.add(4);
		prioritizeMinimumValue(numberList);
		System.out.println("The list should contain: \n[4]\n" + numberList);
		numberList.add(3);
		numberList.add(1);
		numberList.add(5);
		numberList.add(7);
		prioritizeMinimumValue(numberList);
		System.out.println("The list should contain: \n[1, 4, 3, 5, 7]\n" + numberList);
		numberList.add(0);
		prioritizeMinimumValue(numberList);
		System.out.println("The list should contain: \n[0, 1, 4, 3, 5, 7]\n" + numberList);


	}

	/*
	A set is an unordered collection of objects that does not allow duplicates.
	Write a complete method from the client perspective that determines if a bag is also a set.
	A bag is a set if it contains no duplicates.
	 */
	public static boolean isSet(BagInterface<String> wordBag) {
		if (!wordBag.isEmpty() || wordBag.getCurrentSize() > 1) {
			BagInterface<String> tempBag = new ArrayBag<>();

			boolean check = true;
			while (wordBag.getCurrentSize() > 0) {
				String temp = wordBag.remove();
				if (wordBag.getFrequencyOf(temp) > 0) {
					check = false;
				}
				tempBag.add(temp);
			}

			// putting items back into original bag
			while(tempBag.getCurrentSize() > 0) {
				String tempStr = tempBag.remove();
				wordBag.add(tempStr);
			}

			return check;
		} else {
			return true;
		}
	}

	/**
	 Write a complete method from the client perspective to create a new ListInterface object that
	 contains all Strings on a wordList that are shorter than a specific length.
	 */
	public static ListInterface<String> createShortWordList(ListInterface<String> wordList, int length) {
		if (!wordList.isEmpty()) {
			ListInterface <String> tempWordList = new AList <>();

			for (int i = 1; i <= wordList.getLength(); i++) {
				String currentWord = wordList.getEntry(i);
				if (currentWord.length() < length) {
					tempWordList.add(currentWord);
				}
			} // end for
			return tempWordList;
		}
		return null;
	} // The first if is not needed - the loop will not execute if the list is empty.

	/**
	 If the item appears more than once, return the position of the last appearance.
	 Decide what to do if the item is not on the list. Make sure your action is logical!
	 The wordList parameter should be unchanged when the method completes.
	 Note that there is a lastIndexOf method in the ArrayList class.
	 Do not use this method- you will receive 0 points for using this. (You are essentially re-writing this method for yourself!)
	 */
	public static int lastPosition(List<String> wordList, String targetWord) {
		if (!wordList.isEmpty()) {
			if (wordList.contains(targetWord)) {
				int index = 0;
				int found = -1;

				while (index < wordList.size()) {
					if (wordList.get(index).equals(targetWord)) {
						found = index;
					}
					index++;
				}
				return found;

			} else { // if list does not contain targetWord...
				return -99;
			}
		} else { // if list is empty
			return -99;
		}
	} // The if is not needed- the loop will not execute if the list is empty

	public static int recursiveCountMultiples(ListInterface<Integer> list, int number) {
		return recursiveCountMultiplesHelper(list, 1, list.getLength(), number);
	}
	public static int recursiveCountMultiplesHelper(ListInterface<Integer> list, int start,
			int end, int number) {
		int countOfMultiples = 0;
		if (!list.isEmpty()) {

			if (list.getEntry(start) % number == 0 && start <= end) {
				countOfMultiples++; //countOfMultiples + 1;
				recursiveCountMultiplesHelper(list, start+1,end,number);
			}

		} else {
			return 0;
		}
		return countOfMultiples;
	}

	/**
	 Write a complete method from the client perspective to determine if a List and ListInterface
	 of numbers have equivalent contents- meaning the same numbers in the same order.
	 */
	/*
	public static boolean equivalentLists(List<Integer> numberList,
			ListInterface<Integer> numberListInterface) {
		if (!numberList.isEmpty() && !numberListInterface.isEmpty()) {
			if (numberList.size() == numberListInterface.getLength()) {
				for (int i = 0; i < numberList.size(); i++ ) {
					for (int j = 1; j <= numberListInterface.getLength(); j++) {
						if (numberList.get(i) == numberListInterface.getEntry(j)) {
							return true;
						}
					}
				}
			}
		}
		return false;
	} // The element at position x in the ListInterface is in position x+1 on the list use equals,
	// not ==, to compare objects (including Integer objects)
	*/

	/**
	 Find the minimum value in a List and move that value to the front of the list.
	 *//*
	public static void prioritizeMinimumValue(List<Integer> numberList) {
		if (!numberList.isEmpty()) {
			int lengthOfList = numberList.size();
			int minimum = numberList.get(0);
			int indexOfMinimum = 0;
			int countOfMinimum = 0;
			for (int i = 0; i < numberList.size(); i++) {
				if (numberList.get(i) < minimum) {
					minimum = numberList.get(i);
					countOfMinimum++;
					if (countOfMinimum > 1) {
						indexOfMinimum = i;
						numberList.remove(i);
						numberList.add(0, minimum);
					}
				}
			}
		}
	} // Does not accomplish the task- will prioritize every smaller value as it is found,
	// not just the one minimum
	*/

	public static boolean equivalentLists(List<Integer> numberList, ListInterface<Integer> numberListInterface) {
		if (numberList.size() == numberListInterface.getLength()) {
			for (int i = 0; i < numberList.size(); i++) {
				if (numberList.get(i) != numberListInterface.getEntry(i+1)) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	public static void prioritizeMinimumValue(List<Integer> numberList) {
		if (numberList.size() > 1) {
			int smallestIndex = 0;
			for (int i = 1; i < numberList.size(); i++) {
				if (numberList.get(i) < numberList.get(smallestIndex)) {
					smallestIndex = i;
				}
			}

			if (smallestIndex > 0) {
				Integer temp = numberList.remove(smallestIndex);
				numberList.add(0, temp);
			}
		}
	}
}
