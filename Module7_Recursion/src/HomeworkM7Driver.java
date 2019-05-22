import java.util.*;

public class HomeworkM7Driver {

	public static void main(String[] args) {


		System.out.println("******TESTING Q WITHOUT U");
		System.out.println("\nAll of these should be false. They do NOT contain a \"q\" that is not immediately followed by a \"u\"");
		System.out.println("uuquqt: true " + qNotFollowedByU("uuquqt"));
		//System.out.println("auquqt: true: " + qNotFollowedByU("auquqt"));
		System.out.println("quota: true: " + qNotFollowedByU("quota"));
		System.out.println("michael: false: " + qNotFollowedByU("michael"));
		System.out.println("qqt: true: " + qNotFollowedByU("qqt"));
		System.out.println("auquqtq: true " + qNotFollowedByU("auquqtq"));
		System.out.println("hello: \t\tfalse: " + qNotFollowedByU("hello")); // no q at all- odd length
		System.out.println("cats: \t\tfalse: " + qNotFollowedByU("cats")); // no q at all- even length
		System.out.println("a: \t\tfalse: " + qNotFollowedByU("a")); // no q at all- single letter
		System.out.println("quite: \t\tfalse: " + qNotFollowedByU("quite")); // q followed by u at the beginning
		System.out.println("equal: \t\tfalse: " + qNotFollowedByU("equal")); // q followed by u in the middle- odd length
		System.out.println("aqua: \t\tfalse: " + qNotFollowedByU("aqua"));    // q followed by u in the middle- even length
		System.out.println("nonsensewordqu: false: " + qNotFollowedByU("nonsensewordqu")); // q followed by u at the end
		System.out.println("QUOTE: \t\tfalse: " + qNotFollowedByU("QUOTE")); // q followed by u in caps
		System.out.println("qu: \t\tfalse: " + qNotFollowedByU("qu")); // q followed by u and nothing else
		System.out.println("\"\": \t\tfalse: " + qNotFollowedByU("")); // empty string	

		System.out.println("\nAll of these should be true. They DO contain a \"q\" that is not immediately followed by a \"u\"");
		System.out.println("aaauqaqu: \ttrue: " + qNotFollowedByU("aaauqaqu"));
		System.out.println("ququququq: true " + qNotFollowedByU("ququququq"));
		System.out.println("qat: \t\ttrue: " + qNotFollowedByU("qat")); // q without u at the beginning
		System.out.println("cinq: \t\ttrue: " + qNotFollowedByU("cinq")); // q without u at the end- even length
		System.out.println("drinq: \t\ttrue: " + qNotFollowedByU("drinq")); // q without u at the end- odd length
		System.out.println("nonsenseqword: \ttrue: " + qNotFollowedByU("nonsenseqword")); // q without u in the middle
		System.out.println("aquaq: \t\ttrue: " + qNotFollowedByU("aquaq")); // q without u in a word that also has a "qu" before it
		System.out.println("qaqu: \t\ttrue: " + qNotFollowedByU("qaqu")); // q without u in a word that also has a "qu" after it
		System.out.println("qiteu: \t\ttrue: " + qNotFollowedByU("qiteu")); // q without u right after, but with a u later on
		System.out.println("q: \t\ttrue: " + qNotFollowedByU("q")); // q all on its own- single letter
		System.out.println("qq: \t\ttrue: " + qNotFollowedByU("qq")); // q all on its own- double letter
		System.out.println("uq: \t\ttrue: " + qNotFollowedByU("uq")); // q with a u before it
		System.out.println("Qtip: \t\ttrue: " + qNotFollowedByU("Qtip")); // q without a u in caps
		System.out.println("Qutipq: "+ qNotFollowedByU("Qutipq")); // q without a u in caps



		System.out.println("\n******TESTING ARRAY REVERSER");
		int[] array1 = {1, 2, 3, 4, 5};
		System.out.println("Before reverse: " + Arrays.toString(array1));
		System.out.println("After reverse should be");
		printReverse(array1);
		reverseArray(array1);
		System.out.println(Arrays.toString(array1));
		System.out.println("After reversing back should be");
		printReverse(array1);
		reverseArray(array1);
		System.out.println(Arrays.toString(array1));

		int[] array2 = {1, 2, 3, 4, 5, 6};
		System.out.println("\nBefore reverse: " + Arrays.toString(array2));
		System.out.println("After reverse should be");
		printReverse(array2);
		reverseArray(array2);
		System.out.println(Arrays.toString(array2));
		System.out.println("After reversing back should be");
		printReverse(array2);
		reverseArray(array2);
		System.out.println(Arrays.toString(array2));

		int[] array3 = {1, 2};
		System.out.println("\nBefore reverse: " + Arrays.toString(array3));
		System.out.println("After reverse should be");
		printReverse(array3);
		reverseArray(array3);
		System.out.println(Arrays.toString(array3));
		int[] array4 = {1};
		System.out.println("\nBefore reverse: " + Arrays.toString(array4));
		System.out.println("After reverse should be");
		printReverse(array4);
		reverseArray(array4);
		System.out.println(Arrays.toString(array4));
		int[] array5 = {};
		System.out.println("\nBefore reverse: " + Arrays.toString(array5));
		System.out.println("After reverse should be");
		printReverse(array5);
		reverseArray(array5);
		System.out.println(Arrays.toString(array5));


		System.out.println("\n******TESTING GET FREQUENCY OF");
		LinkedBag <Integer> numbersLinkedBag = new LinkedBag <Integer>();
		System.out.println("The bag contains[] \n\t\t" + Arrays.toString(numbersLinkedBag.toArray()));
		System.out.println("Should be 0: " + numbersLinkedBag.getFrequencyOf(1));
		numbersLinkedBag.add(1);
		numbersLinkedBag.add(2);
		numbersLinkedBag.add(1);
		numbersLinkedBag.add(4);
		numbersLinkedBag.add(3);
		numbersLinkedBag.add(1);
		System.out.println("The bag contains[1, 3, 4, 1, 2, 1] \n\t\t" + Arrays.toString(numbersLinkedBag.toArray()));
		System.out.println("Should be 3: " + numbersLinkedBag.getFrequencyOf(1));
		System.out.println("Should be 1: " + numbersLinkedBag.getFrequencyOf(4));
		System.out.println("Should be 0: " + numbersLinkedBag.getFrequencyOf(5));
		System.out.println("The bag still contains  [1, 3, 4, 1, 2, 1] \n\t\t\t" + Arrays.toString(numbersLinkedBag.toArray()));
		numbersLinkedBag.add(1);
		numbersLinkedBag.add(2);
		numbersLinkedBag.add(1);
		numbersLinkedBag.add(4);
		numbersLinkedBag.add(3);
		numbersLinkedBag.add(1);
		System.out.println("Should be 6: " + numbersLinkedBag.getFrequencyOf(1));
		System.out.println("Should be 2: " + numbersLinkedBag.getFrequencyOf(4));
		System.out.println("Should be 0: " + numbersLinkedBag.getFrequencyOf(5));
		numbersLinkedBag.clear();
		System.out.println(Arrays.toString(numbersLinkedBag.toArray()));


		System.out.println("\n******TESTING EXTRA CREDIT COUNT POSITIVES");
		BagInterface <Integer> numbersBag = new LinkedBag <Integer>();
		numbersBag.add(2);
		numbersBag.add(-1);
		numbersBag.add(3);
		numbersBag.add(5);
		numbersBag.add(-2);
		numbersBag.add(-4);
		numbersBag.add(1);
		System.out.println("The bag contains[1, -4, -2, 5, 3, -1, 2] \n\t\t" + Arrays.toString(numbersBag.toArray()));
		System.out.println("There are 4 positives: " + countPositives(numbersBag));
		System.out.println("The bag still contains  [1, -4, -2, 5, 3, -1, 2] \n\t\t\t" + Arrays.toString(numbersBag.toArray()));
		numbersBag.clear();
		numbersBag.add(-2);
		numbersBag.add(-4);
		numbersBag.add(-3);
		System.out.println("The bag contains[-3, -4, -2] \n\t\t" + Arrays.toString(numbersBag.toArray()));
		System.out.println("There are 0 positives: " + countPositives(numbersBag));
		System.out.println("The bag still contains  [-3, -4, -2] \n\t\t\t" + Arrays.toString(numbersBag.toArray()));
		numbersBag.clear();
		numbersBag.add(2);
		numbersBag.add(4);
		numbersBag.add(3);
		System.out.println("The bag contains[3, 4, 2] \n\t\t" + Arrays.toString(numbersBag.toArray()));
		System.out.println("There are 3 positives: " + countPositives(numbersBag));
		System.out.println("The bag still contains  [3, 4, 2] \n\t\t\t" + Arrays.toString(numbersBag.toArray()));
		numbersBag.clear();
		System.out.println("The bag contains[] \n\t\t" + Arrays.toString(numbersBag.toArray()));
		System.out.println("There are 0 positives: " + countPositives(numbersBag));
		System.out.println("The bag still contains  [] \n\t\t\t" + Arrays.toString(numbersBag.toArray()));
		numbersBag.add(3);
		System.out.println("The bag contains[3] \n\t\t" + Arrays.toString(numbersBag.toArray()));
		System.out.println("There are 1 positives: " + countPositives(numbersBag));
		System.out.println("The bag still contains  [3] \n\t\t\t" + Arrays.toString(numbersBag.toArray()));
		numbersBag.clear();
		numbersBag.add(-3);
		System.out.println("The bag contains[-3] \n\t\t" + Arrays.toString(numbersBag.toArray()));
		System.out.println("There are 0 positives: " + countPositives(numbersBag));
		System.out.println("The bag still contains  [-3] \n\t\t\t" + Arrays.toString(numbersBag.toArray()));


	}

	public static boolean qNotFollowedByU(String word) {
		return qNotFollowedByUHelper(word.toLowerCase(), 0, 1);
	}
	private static boolean qNotFollowedByUHelper(String word, int start, int next) {
		boolean flag = false;
		if (word.length() == 0 || word.length() == start) {
			return flag;
		}
		if (start < next) {
			if (word.charAt(word.length() - 1) == 'q') {
				flag = true;
			} else if (word.charAt(start) == 'q' && word.charAt(next) == 'u') {
				flag = false;
			} else if (word.charAt(start) == 'q' && word.charAt(next) != 'u') {
				flag = true;
			} else {
				flag = qNotFollowedByUHelper(word, start + 1, next + 1);
			}
		}
		return flag;
	}

	/*public static boolean qNotFollowedByU(String word){
		// Making a single case copy make comparing simpler
		String lowerCaseWord = word.toLowerCase();

		return qHelper(0,lowerCaseWord);
	}

	private static boolean qHelper( int count ,String searchWord) {

		if (searchWord.length() > count +1){
			if(searchWord.charAt(count) == 'q' && searchWord.charAt(count+1) == 'u'){
				return false;
			}else {
				return qHelper(count+1, searchWord);
			}
		} else {
			return true;
		}
	}*/

	/*
	// CURRENT SOLUTION!
	private static boolean qNotFollowedByUHelper(String word, int start, int next) {
		//String wordInLowerCase = word.toLowerCase();
		if (word.length() == 0 || word.length() == start) {
			return false;
		}
		if (start < next) {
			if (word.charAt(word.length() - 1) == 'q') {
				return true;
			}
			if (word.charAt(start) == 'q' && word.charAt(next) == 'u') {
				return false;
1			} else if (word.charAt(start) == 'q' && word.charAt(next) != 'u') {
				return true;
			} else {
				return qNotFollowedByUHelper(word, start + 1, next + 1);
			}
		} else {
			return qNotFollowedByUHelper(word, start + 1, next + 1);
		}
		//return qNotFollowedByUHelper(word, start + 1, next + 1);
	}
	*/

	// Proposed solution
	/*
	public static boolean qNotFollowedByU(String word) {
		word = word.toLowerCase();
		if (word.length() == 0) return false;
		return qNotFollowedByUHelper(word, word.charAt(0), 1);
	}

	private static boolean qNotFollowedByUHelper(String word, char previous, int startIndex) {
		if (startIndex < word.length()) {
			char newChar = word.charAt(startIndex);
			if (previous == 'q' && newChar != 'u') {
				return true;
			} else {
				return qNotFollowedByUHelper(word, newChar, startIndex+1);
			}
		} else if (previous == 'q') {
			return true;
		} else {
			return false;
		}
	}
	 */


	public static void reverseArray(int[] array) {
		//reverseArrayHelper(array,0);
		reverseArrayHelper(array,0, array.length-1);
	}
	private static void reverseArrayHelper(int[] array, int start, int end) {
		if (start == end || start > end) {
			return;
		} else {//start < end) {
			int tempVal = array[start];
			array[start] = array[end];
			array[end] = tempVal;
			reverseArrayHelper(array,start+1, end-1);
		}
	}
	/*
	private static void reverseArrayHelper(int[] array, int start, int end) {
		if (array.length > 0) {
			if (start == end) {
				System.out.println(array[start]);
			} else {
				System.out.print(array[end] + ", ");
				reverseArrayHelper(array, start, end - 1);
			}
		} else {
			return;

		}
	}
	*/

	// a printing method for testing purposes
	public static void printReverse(int[] array) {
		System.out.print("[");
		for (int i = array.length - 1; i > 0; i--) {
			System.out.print(array[i] + ", ");
		}
		if (array.length > 0) {
			System.out.print(array[0]);
		}
		System.out.println("]");
	}

	public static int countPositives(BagInterface<Integer> bag) {
		return countPositivesHelper(bag, 0);
	}

	private static int countPositivesHelper(BagInterface<Integer> bag, int count) {
		int numberRemoved;
		count = 0;

		if (bag.getCurrentSize() == 0) {
			return count;
		} else {
			numberRemoved = bag.remove();
			if (numberRemoved > 0) {
				count = 1 + countPositivesHelper(bag, count);
			}
			bag.add(numberRemoved);
		}
		return count;
	}
	// Non-recursive
	/*
	public static int countPositives(BagInterface<Integer> bag) {
		int count = 0;
		Integer item = bag.remove();
		if (item != null) {
			boolean check = item > 0;
			count = check ? 1 + countPositives(bag) : countPositives(bag);
			bag.add(item);
			return count;
		} else {
			return count;
		}

	}
	 */
}


