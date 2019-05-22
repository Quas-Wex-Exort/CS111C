import java.util.Arrays;
import java.util.*;

public class HomeworkM6Driver {

	// I recommend changing these to smaller numbers to start with!
	// Then once you think you have a good solution, you can increase them for more robust testing.
	public static final int LIST_SIZE = 10;
	public static final int SINGLE_DUPLICATE_NUMBERS = 10; // minimum number of numbers on the list that will appear twice (have a "single duplicate"
	public static final int DOUBLE_DUPLICATE_NUMBERS = 5;  // minimum number of numbers on the list that will appear three times (have a "duplicate duplicate")
	
	
	public static void main(String[] args) {
		
		// set up an Integer list that is guaranteed to have some single and double duplicates
		List<Integer> numbers = new ArrayList<>();
		Random generator = new Random();
		int max = 5 * LIST_SIZE;
		int min = -1 * max;
		int randomRange = max - min + 1;
		
		// add the first round of numbers
		int originalNumbersToAdd = LIST_SIZE- SINGLE_DUPLICATE_NUMBERS - DOUBLE_DUPLICATE_NUMBERS;
		numbers.add(min); // adding the min and max number to help test for array out of bounds errors
		numbers.add(min);
		numbers.add(max);
		numbers.add(max);
		numbers.add(0);  // adding 0 as a special test case
		numbers.add(0); 
		originalNumbersToAdd-=6;
		for(int i=0; i<originalNumbersToAdd; i++) {
			numbers.add(generator.nextInt(randomRange) + min);			
		}
		
		// add duplicate numbers
		Collections.shuffle(numbers);
		for(int i=0; i<SINGLE_DUPLICATE_NUMBERS; i++) {
			numbers.add(numbers.get(i));
		}
		for(int i=0; i<DOUBLE_DUPLICATE_NUMBERS; i++) {
			numbers.add(numbers.get(i));
		}
		
		// print the list sorted (might help with testing)
		Collections.sort(numbers);
		System.out.println("The original list:");
		System.out.println(numbers);
		Collections.shuffle(numbers);
		
		// the results should be the same for both methods
		System.out.println("\nThe duplicate lists from both methods- these should match!");
		List<Integer> duplicateList = findDuplicatesBad(numbers);
		Collections.sort(duplicateList);
		System.out.println(duplicateList);

		System.out.println("\nUsing findDuplicatesLinear()...");
		duplicateList = findDuplicatesLinear(numbers);
		Collections.sort(duplicateList);
		System.out.println(duplicateList);


	}
	/*
	public static List<Integer> findDuplicatesBad(List<Integer> numbers) {
		List<Integer> duplicateList = new ArrayList<Integer>();
		for(int i=0; i<numbers.size(); i++) { // O(1)
			int numberEvaluating = numbers.get(i); // O(1)
			boolean duplicateFound = false;
			
			for(int j=i+1; j<numbers.size() && !duplicateFound; j++) { // O(1)
				int numberChecking = numbers.get(j); // O(1)
				
				if(numberEvaluating==numberChecking && !duplicateList.contains(numberEvaluating)) {
					duplicateFound = true; // contains() is O(n)
					
					for(int k=j; k<numbers.size(); k++) { // O(1)
						if(numberChecking==Integer.valueOf(numbers.get(k))) { // O(1)
							duplicateList.add(numberChecking); // O(n)
						}
					}
				}
			}
		}
		return duplicateList;
	}

	 */

	public static List<Integer> findDuplicatesBad(List<Integer> numbers) {
		List<Integer> duplicateList = new ArrayList<Integer>();
		for(int i=0; i<numbers.size(); i++) {
			int numberEvaluating = numbers.get(i);
			boolean duplicateFound = false;

			for(int j=i+1; j<numbers.size() && !duplicateFound; j++) {
				int numberChecking = numbers.get(j);

				if(numberEvaluating==numberChecking && !duplicateList.contains(numberEvaluating)) {
					duplicateFound = true;

					for(int k=j; k<numbers.size(); k++) {
						if(numberChecking==Integer.valueOf(numbers.get(k))) {
							duplicateList.add(numberChecking);
						}
					}
				}
			}
		}
		return duplicateList;
	}


	// Must be linear time O(n)
	// Avoid nested loops! Can maybe use multiple for-loops that are one after the other, just not
	// nested!
	/*
	public static List<Integer> findDuplicatesLinear(List<Integer> numbers) {

		List <Integer> tempList = new ArrayList <>();
		List <Integer> finalList = new ArrayList <>();


		for (int i = 0; i < numbers.size() && (i != numbers.size() - 1); i++) {
			if (numbers.get(i).equals(Integer.valueOf(numbers.get(i + 1)))) {
				tempList.add(numbers.get(i));
			}
			if (i > 0 && (i < numbers.size() - 1) && !numbers.get(i - 1).equals(Integer.valueOf(numbers.get(i)))) {
				tempList.add(numbers.get(i));
				//tempList.remove(tempList.lastIndexOf(numbers.get(i)));
			}
		}

		/*for (int i = 0; i < tempList.size(); i++) {
			if (i > 0 && i < tempList.size()-1) {
				int previous = tempList.get(i-1);
				int next = tempList.get(i+1);
				if (tempList.get(i).equals(tempList.get(i - 1)) && tempList.get(i).equals(tempList.get(i + 1))) {
					finalList.remove(finalList.lastIndexOf(numbers.get(i)));
				}
				finalList.add(tempList.get(i));
			}
		}
		return finalList;
		return tempList;
	}
	*/

	public static List<Integer> findDuplicatesLinear(List<Integer> numbers) {
		List<Integer> duplicateList = new ArrayList<Integer>();
		HashMap<Integer, Boolean> library = new HashMap<>();

		for (int i = 0; i < numbers.size(); i++) {
			Integer num = numbers.get(i);
			if (library.containsKey(num)) {
				duplicateList.add(num);
			} else {
				library.put(num, true);
			}
		}

		return duplicateList;
	}

}
