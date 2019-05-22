import java.util.*;

public class StudentHashTableDriver {

	public static void main(String[] args) {

		AnotherStudent s1 = new AnotherStudent(22, "Irving");
		AnotherStudent s2 = new AnotherStudent(49, "Ocean");
		AnotherStudent s3 = new AnotherStudent(7, "California");
		AnotherStudent s4 = new AnotherStudent(8, "Greenwich");
		AnotherStudent s5 = new AnotherStudent(78, "Mason");
		AnotherStudent s6 = new AnotherStudent(58, "Judah");
		AnotherStudent s7 = new AnotherStudent(32, "Brannan");
		AnotherStudent[] theStudents = {s1, s2, s3, s4, s5, s6, s7};
		
		StudentHashTable studentTable = new StudentHashTable(7);
		
		for(AnotherStudent s : theStudents) {
			studentTable.addStudent(s);
		}

		/*

		Set<Integer> numberSet = new HashSet<Integer>();
		numberSet.add(1);
		numberSet.add(2);
		numberSet.add(3);
		numberSet.add(1);
		System.out.println(numberSet.size());

		//AnotherStudent s = studentTable.findStudent(700);
		//System.out.println(s);
				
		//s = studentTable.findStudent(43);


		Map<String,String> stringMap = new HashMap<String, String>();
		stringMap.put("123", "key1");
		stringMap.put("123", "key2");

		System.out.println(stringMap.get("key2"));

		Map<String, Integer> numberMap = new HashMap<String, Integer>();
		numberMap.put("A", 1);
		numberMap.put("B", 2);
		numberMap.put("C", 3);
		System.out.println(numberMap.keySet());
		*/

	}




	
}
